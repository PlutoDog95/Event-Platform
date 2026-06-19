package com.vini.tickets.controllers;

import com.vini.tickets.domain.dtos.ListPublishedEventResponseDto;
import com.vini.tickets.mappers.EventMapper;
import com.vini.tickets.services.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/published-events")
@RequiredArgsConstructor
public class PublishedEventController {

    private final EventService eventService;
    private final EventMapper eventMapper;

    @GetMapping
    public ResponseEntity<Page<ListPublishedEventResponseDto>> listPublishedEvents(Pageable pageable) {
        // Map the events to DTOs and return them in the response
        return ResponseEntity.ok(eventService.listPublishedEvents(pageable)
                .map(eventMapper::toListPublishedEventResponseDto));
    }
}