package co.edu.ufps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.edu.ufps.repo.ClienteRepo;
import co.edu.ufps.repo.DireccionRepo;
import co.edu.ufps.service.IClienteService;


@Controller
public class ClienteController {
	
	
	@Autowired
	private  IClienteService clienteService;
	

	
	@GetMapping("/registrarCliente")
	public String registrarCliente() {
			
		
		return "registro.html";
	}
}
