package com.haydikodlayalim.ticketservice.model;

import lombok.Getter;

@Getter
public enum TicketStatus {
    OPEN("Acik"),
    IN_PROGRESS("Uzerinde Çalisiliyor"),
    RESOLVED("Cozuldu"),
    CLOSED("Kapandi");

    private String label;

    TicketStatus(String label) {
        this.label = label;
    }
}
