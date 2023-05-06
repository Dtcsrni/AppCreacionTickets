package tech.armsys.SistemaTickets.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import tech.armsys.SistemaTickets.model.Usuario;
import tech.armsys.SistemaTickets.service.iUsuariosService;

@Controller
public class LoginController {
	
	@Autowired
	private iUsuariosService serviceUsuarios;
	
	@GetMapping("/")
	public String mostrarLogin(Model model) {
		

		
		return "/index";
	}
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String Loguear(@RequestParam("nombreUsuario") String nombreUsuario, RedirectAttributes attributes) {
		Usuario usuario = serviceUsuarios.loguearUsuario(nombreUsuario);
		System.out.println("Logeando");
		if(usuario!=null) {
			System.out.println("Correcto");
			return "redirect:/tickets";
		}
		System.out.println("Usuario incorrecto");
		
		return null;
	}

}
