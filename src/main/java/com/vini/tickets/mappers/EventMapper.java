package com.vini.tickets.mappers;

import com.vini.tickets.domain.CreateEventRequest;
import com.vini.tickets.domain.CreateTicketTypeRequest;
import com.vini.tickets.domain.UpdateEventRequest;
import com.vini.tickets.domain.UpdateTicketTypeRequest;
import com.vini.tickets.domain.dtos.*;
import com.vini.tickets.domain.entities.Event;
import com.vini.tickets.domain.entities.TicketType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {
    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);
    CreateEventRequest fromDto(CreateEventRequestDto dto);
    CreateEventResponseDto toDto(Event event);
    ListEventTicketTypeResponseDto toDto(TicketType ticketType);
    ListEventResponseDto toListEventResponseDto(Event event);
    GetEventDetailsTicketTypesResponseDto toGetEventDetailsTicketTypesResponseDto(TicketType ticketType);
    GetEventDetailsResponseDto toGetEventDetailsResponseDto(Event event);
    UpdateTicketTypeRequest fromDto(UpdateTicketTypeRequestDto dto);

    UpdateEventRequest fromDto(UpdateEventRequestDto dto);

    UpdateTicketTypeResponseDto toUpdateTicketTypeResponseDto(TicketType ticketType);

    UpdateEventResponseDto toUpdateEventResponseDto(Event event);
}
