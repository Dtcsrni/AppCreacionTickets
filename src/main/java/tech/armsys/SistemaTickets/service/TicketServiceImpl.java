package tech.armsys.SistemaTickets.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import tech.armsys.SistemaTickets.model.Ticket;

@Service
public class TicketServiceImpl implements iTicketsService{

	List<Ticket> ticketsLista;
	Long min=(long) 1, max=(long) 10000000;
	public TicketServiceImpl() {
		
		String date_string;
		Ticket ticket1 = new Ticket();
		Ticket ticket2 = new Ticket();
		Ticket ticket3 = new Ticket();
		Ticket ticket4 = new Ticket();
		
		ticketsLista=new LinkedList<Ticket>();
		
		Random rand = new Random(); 
		 
		 
		ticket1.setId(rand.nextLong(max - min) + min);
		ticket1.setTitulo("Ticket de prueba 1");
		date_string = "16-01-2022";
	    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");      
	    Date date=null;
		try {
			date = formatter.parse(date_string);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		ticket1.setFechaCreacion(date);
		ticket1.setIdCreador(Long.valueOf(1));
		ticket1.setIdEquipoResponsable(Long.parseLong("1"));
		ticket1.setTipoIncidencia(0);
		ticket1.setGravedadIncidencia(2);
		ticket1.setVersionSoftwareIncidencia((float) 0.2);
		ticket1.setDescripcionProblema("No cargan las imagenes");
		ticket1.setEstatus(0);
		ticket1.setArchivado(false);
		
		ticketsLista.add(ticket1);
		
		ticket2.setId(rand.nextLong(max - min) + min);
		ticket2.setTitulo("Ticket de prueba 2");
		date_string = "11-03-2022";
	    formatter = new SimpleDateFormat("dd-MM-yyyy");      
	    date=null;
		try {
			date = formatter.parse(date_string);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		ticket2.setFechaCreacion(date);
		ticket2.setIdCreador((long) 1);
		ticket2.setIdEquipoResponsable((long) 1);
		ticket2.setTipoIncidencia(1);
		ticket2.setGravedadIncidencia(2);
		ticket2.setVersionSoftwareIncidencia((float) 0.2);
		ticket2.setDescripcionProblema("No cargan las fuentes");
		ticket2.setEstatus(1);
		ticket2.setArchivado(false);
		ticketsLista.add(ticket2);
		
		ticket3.setId(rand.nextLong(max - min) + min);
		ticket3.setTitulo("Ticket de prueba 3");
		date_string = "22-03-2022";
	    formatter = new SimpleDateFormat("dd-MM-yyyy");      
	    date=null;
		try {
			date = formatter.parse(date_string);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		ticket3.setFechaCreacion(date);
		ticket3.setIdCreador((long) 1);
		ticket3.setIdEquipoResponsable((long) 1);
		ticket3.setTipoIncidencia(1);
		ticket3.setGravedadIncidencia(0);
		ticket3.setVersionSoftwareIncidencia((float) 0.2);
		ticket3.setDescripcionProblema("Se deberían de agregar nuevas fuentes a la estructura");
		ticket3.setEstatus(2);
		ticket3.setArchivado(false);
		
		ticketsLista.add(ticket3);
		
		ticket4.setId(rand.nextLong(max - min) + min);
		ticket4.setTitulo("Ticket de prueba 4");
		date_string = "25-04-2022";
	    formatter = new SimpleDateFormat("dd-MM-yyyy");      
	    date=null;
		try {
			date = formatter.parse(date_string);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		ticket4.setFechaCreacion(date);
		ticket4.setIdCreador((long) 1);
		ticket4.setIdEquipoResponsable((long) 1);
		ticket4.setTipoIncidencia(1);
		ticket4.setGravedadIncidencia(1);
		ticket4.setVersionSoftwareIncidencia((float) 0.2);
		ticket4.setDescripcionProblema("No enciende el equipo");
		ticket4.setEstatus(2);
		ticket4.setArchivado(true);
		
		ticketsLista.add(ticket4);
	}
	@Override
	public List<Ticket> obtenerTickets() {
		
		
		return ticketsLista;
	
	}
	@Override
	public Ticket buscarIDTicket(Long id) {
		for(Ticket v : ticketsLista) {
			if(v.getId().equals(id)) {
				return v;
			}
		}
		
		return null;
	
	}
	
	

}
