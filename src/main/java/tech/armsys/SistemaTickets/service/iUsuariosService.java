package tech.armsys.SistemaTickets.service;

import tech.armsys.SistemaTickets.model.Usuario;

public interface iUsuariosService {
	Usuario loguearUsuario(String nombreUsuario);
	
	Usuario buscarIDUsuario(Long idUsuario);

}
