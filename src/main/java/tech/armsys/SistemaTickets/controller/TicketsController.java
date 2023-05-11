package tech.armsys.SistemaTickets.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import tech.armsys.SistemaTickets.model.Ticket;
import tech.armsys.SistemaTickets.model.Usuario;
import tech.armsys.SistemaTickets.service.iTicketsService;
import tech.armsys.SistemaTickets.service.iUsuariosService;

@Controller
@RequestMapping(value = "/tickets")
public class TicketsController {

	@Autowired
	private iTicketsService serviceTickets;
	@Autowired
	private iUsuariosService serviceUsuarios;
	
	private boolean mostrarDetalle=false;

	@GetMapping("")
	public String mostrarTickets(Ticket ticket, Model model) {
		List<Ticket> lista = serviceTickets.obtenerTickets();
		
		List<Ticket> ticketsNuevosList = new LinkedList<Ticket>();
		List<Ticket> ticketsEnProcesoList =new LinkedList<Ticket>();
		List<Ticket> ticketsAtendidosList = new LinkedList<Ticket>();
		for (Ticket tickets : lista) {
			switch (tickets.getEstatus()) {

			case 0:
				ticketsNuevosList.add(tickets);
				break;
			case 1:
				ticketsEnProcesoList.add(tickets);
				break;
			case 2:
				ticketsAtendidosList.add(tickets);
				break;

			}
		}

		model.addAttribute("ticketNuevos", ticketsNuevosList);
		model.addAttribute("ticketEnProceso", ticketsEnProcesoList);
		model.addAttribute("ticketAtendidos", ticketsAtendidosList);
		
		
		
		return "tickets/index";
	}
	
	@PostMapping("/verDetalle/{id}")
	public String buscarDetalle(@PathVariable("id") Long id, Model model, RedirectAttributes attributes) {
	    
		mostrarDetalle=true;
		
	
	    return "redirect:/tickets/verDetalle/{id}";
	    
	}
	@GetMapping("/verDetalle/{id}")
	public String verDetalle(@PathVariable("id") Long id, Model model, RedirectAttributes attributes) {
		
		Ticket ticket = serviceTickets.buscarIDTicket(id);
		Usuario usuario = serviceUsuarios.buscarIDUsuario(ticket.getIdCreador());
				
		model.addAttribute("mostrarDetalle",mostrarDetalle);
		model.addAttribute("ticket",ticket);
		model.addAttribute("usuario", usuario.getNombre());
		
	
	    return "/tickets/verDetalle";
	    
	}
	 


}
