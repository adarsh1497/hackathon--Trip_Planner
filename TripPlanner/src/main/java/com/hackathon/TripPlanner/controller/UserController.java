package com.hackathon.TripPlanner.controller;

import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.TripPlanner.model.Route;
import com.hackathon.TripPlanner.model.User;
import com.hackathon.TripPlanner.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepo;
	
	
	/*
	 * @GetMapping("/user") public String process(Model model, HttpSession session)
	 * {
	 * 
	 * @SuppressWarnings("unchecked") //List<String> messages = (List<String>)
	 * session.getAttribute("MY_SESSION_MESSAGES");
	 * 
	 * model.addAttribute("sessionUser", );
	 * 
	 * return "index"; }
	 */	
	
	@GetMapping("/user/login/{userName}/{password}")
	public void login(@PathVariable("userName") String userName , @PathVariable("password") String password) {
		/*
		 * if(userRepo.existsById(userName) && userRepo. ) {
		 * 
		 * }
		 */
	}
	
	
	@PostMapping("/add/route" )
	public void addRoute(@RequestBody Route route) {
		//if(userRepo.)
	}
}
