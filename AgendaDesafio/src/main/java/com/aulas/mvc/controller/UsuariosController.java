package com.aulas.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aulas.dao.DaoUsuario;
import com.aulas.entidades.Usuarios;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {

	@GetMapping("/cadastro")
	public String formUsuario(Model model) {
		model.addAttribute("usuarios", new Usuarios());
		
		return "cadastro";
	}
	
	@PostMapping("/cadastro")
	public String cadastrarUsuarios (@ModelAttribute Usuarios usuarios) {
		if(new DaoUsuario().salvar(usuarios)) {
			return "redirect:/usuarios/consulta";
		}
		return "cadastro";
	}
	
	@GetMapping("/consulta")
	public String consultaUsuario(Model model) {
		List<Usuarios> lista = new DaoUsuario().getTodos();
		
		model.addAttribute("lista", lista);
		return "consulta";
	}
	
	@GetMapping("/consulta/{idusuarios}")
	public String consultaUsuariosPorId(@PathVariable("idusuarios") int idusuarios, Model model) {
		Usuarios usuarios = new DaoUsuario().getOne(idusuarios);
		
		model.addAttribute("usuarios", usuarios);
		return "editausuarios";
	}
	
	@RequestMapping(value = "/alterar", method = RequestMethod.POST)
	public String alterarUsuario(@ModelAttribute Usuarios usuarios) {
		if(new DaoUsuario().alterar(usuarios)) {
			return "redirect:/usuarios/consulta";
		}
		return "editausuarios";
	}
	
	@GetMapping("/excluir/{idusuarios}")
	public String excluirUsuarios(@PathVariable("idusuarios") int idusuarios, Model model) {
		new DaoUsuario().deletar(idusuarios);
		
		return "redirect:/usuarios/consulta";
	}
	
}
