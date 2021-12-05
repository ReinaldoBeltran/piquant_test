package co.edu.ufps.controller;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.edu.ufps.model.Direccion;

import co.edu.ufps.repo.DireccionRepo;


@Controller
public class DireccionController {
	
	
	@Autowired
	private DireccionRepo direccionRepo;
	
	 private ArrayList<Direccion> dir = new ArrayList<Direccion>();
	
	
	 @GetMapping("/test1")
		public String test1(Model model) {
			Direccion d1= new Direccion(2,"Av 4 # 24-30");
			Direccion d2 = new Direccion(12,"Av 3 # 25-29");
			dir.add(d1);
			dir.add(d2);
		model.addAttribute("direcciones",dir);
		

			return "test1.html";
		}


	 @GetMapping("/test2")
		public String test2(Model model) {
			
		model.addAttribute("direcciones", direccionRepo.findAll());			
		

			return "test1.html";
		}
}
