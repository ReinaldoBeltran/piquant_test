package co.edu.ufps.controller;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import co.edu.ufps.model.Direccion;
import co.edu.ufps.repo.DireccionRepo;


public class AppController{
	/*
	@Autowired
	DireccionRepo dirRepo;
	
	@GetMapping({"/", "/login"})	
	public String index() {
		
		System.out.print(dirRepo.findAll());
		return "index.html";
		
	}
	@GetMapping({"/menu"})	
	public String menu() {
		return "menu.html";
	}
	
	@GetMapping({"/admin"})	
	public String admin() {
		return "admin.html";
	}
	@GetMapping({"/user"})	
	public String user() {
		return "user.html";
	}
	*/
}
