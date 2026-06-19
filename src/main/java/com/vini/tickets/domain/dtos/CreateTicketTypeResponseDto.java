package com.vini.tickets.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTicketTypeResponseDto {
    private UUID id;
    private String name;
    private String description;
    private Double price;
    private Integer totalAvailable;

}
