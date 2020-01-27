package com.haydikodlayalim.ticketservice.repository;

import com.haydikodlayalim.ticketservice.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface TicketRepository extends JpaRepository<Ticket, String> {
}
