package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.ServicesImpl;

@RestController
public class GameController {
	
	@Autowired
	private ServicesImpl service;
	
	@GetMapping("/Game/{move}")
	public ResponseEntity<String> UserMove(@PathVariable String move) throws Exception{
		String s=service.findWinner(move);
		return new ResponseEntity<>(s,HttpStatus.ACCEPTED);
	}
	
}
