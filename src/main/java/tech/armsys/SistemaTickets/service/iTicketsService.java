package tech.armsys.SistemaTickets.service;

import java.util.List;

import tech.armsys.SistemaTickets.model.Ticket;

public interface iTicketsService {

	List<Ticket> obtenerTickets ();
	Ticket buscarIDTicket(Long id);

}
