package com.bytecode.controllers;

import java.util.List;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytecode.dao.UsuarioDao;
import com.bytecode.models.Usuario;

@RestController	
public class usuarioController {
	@Autowired
	private UsuarioDao usuarioDao;
	@RequestMapping(value="mensaje")
	public String mensaje() {
		return "hola";
	}
	@RequestMapping(value="persona")
	public List<String> listarPersonas(){
		return List.of("Diego","juan","Pedro");
		
	}
	@RequestMapping(value="usuario")
	public Usuario listarUsuarios() {
		Usuario usuario=new Usuario();
		usuario.setNombre("Ignacio");
		usuario.setApellido("Pujado");
		usuario.setEmail("Ignaciopujado@gmail.com");
		usuario.setTelefono("261487685");
		
		
	
		return usuario;
	}
	@RequestMapping(value="usuarios/{id}")
	public Usuario getUsuarios(@PathVariable Long id) {
		Usuario usuario=new Usuario();
		usuario.setId(id);
		usuario.setNombre("Ignacio");
		usuario.setApellido("Pujado");
		usuario.setEmail("Ignaciopujado@gmail.com");
		usuario.setTelefono("261487685");
		
		
	
		return usuario;
	}
	@RequestMapping(value="usuarios/lista_user")
	public List<Usuario> listar_variosUsuarios(){
		List<Usuario> usuarios=new ArrayList<>();
		Usuario usuario1=new Usuario();
		usuario1.setId(3L);
		usuario1.setNombre("Ignacio");
		usuario1.setApellido("Pujado");
		usuario1.setEmail("Ignaciopujado@gmail.com");
		usuario1.setTelefono("2614876853");
		
		Usuario usuario2=new Usuario();
		usuario2.setId(4L);
		usuario2.setNombre("Valentina");
		usuario2.setApellido("Lombardo");
		usuario2.setEmail("valentinalombardo@gmail.com");
		usuario2.setTelefono("2614865426");
		
	
		 usuarios.add(usuario1);
		 usuarios.add(usuario2);
		 
		 return usuarios;
	}
	
		@RequestMapping(value="api/usuarios")
		public List<Usuario> getUsuario(){
			List<Usuario> user=usuarioDao.obtenerUsuario();
			return user;
		}
		
		
	
	

}
