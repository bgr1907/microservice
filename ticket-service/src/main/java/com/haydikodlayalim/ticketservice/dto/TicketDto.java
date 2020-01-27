package com.haydikodlayalim.ticketservice.dto;

import com.haydikodlayalim.ticketservice.model.PriorityType;
import com.haydikodlayalim.ticketservice.model.TicketStatus;
import lombok.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketDto {
    private String id;

    private String description;

    private String notes;

    private String assignee;

    private Date ticketDate;

    private String priorityType;

    private String ticketStatus;
}
