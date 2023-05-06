package tech.armsys.SistemaTickets.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import tech.armsys.SistemaTickets.model.Usuario;

@Service
public class UsuariosServiceImpl implements iUsuariosService{
	List<Usuario> listaUsuarios = null;
	
	
	public UsuariosServiceImpl() {
		listaUsuarios = new LinkedList<Usuario>();  
		Usuario usuario1 = new Usuario();
		usuario1.setNombre("ErickV");
		usuario1.setIdUsuario(Long.valueOf(1));
		
		Usuario usuario2 = new Usuario();
		usuario2.setNombre("Otro");
		
		listaUsuarios.add(usuario1);
		listaUsuarios.add(usuario2);
		
		// TODO Auto-generated constructor stub
	}


	@Override
	public Usuario loguearUsuario(String nombreUsuario) {
		
	
		for(Usuario v : listaUsuarios) {
			if(v.getNombre().equals(nombreUsuario)) {
				return v;
			}
		}
		
		return null;
	}


	@Override
	public Usuario buscarIDUsuario(Long idUsuario) {
		
		for(Usuario v : listaUsuarios) {
			if(v.getIdUsuario().equals(idUsuario)) {
				return v;
			}
		}

		
		return null;
	}
	
	

}
