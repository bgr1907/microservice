package com.haydikodlayalim.ticketservice.model;

import lombok.Getter;

@Getter
public enum PriorityType {
    URGENT("Acil"),
    LOW("Onemsiz"),
    HIGH("Yuksek Oncelikli");

    private String label;

    PriorityType(String label) {
        this.label = label;
    }
}
