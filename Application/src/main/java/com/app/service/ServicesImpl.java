package com.app.service;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

@Service
public class ServicesImpl implements Services{
	
	public String randomStringFromArr() {
	    String[] arr = {"Rock","Paper","Scissor"};
	    int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
	    String randomElem = arr[randIdx];
	    return randomElem;
	}

	@Override
	public String findWinner(String u) throws Exception {
		if(u.equals("Rock")) {
			String c=this.randomStringFromArr();
			if(c.equals("Scissor")) {
				return "Player wins";
			}else if(c.equals("Paper")) {
				return "Computer wins";
			}else {
				return "It is a tie";
			}
		}else if(u.equals("Paper")) {
			String c=this.randomStringFromArr();
			if(c.equals("Rock")) {
				return "Player wins";
			}else if(c.equals("Scissor")) {
				return "Computer wins";
			}else {
				return "It is a tie";
			}
		}else if(u.equals("Scissor")){
			String c=this.randomStringFromArr();
			if(c.equals("Paper")) {
				return "Player wins";
			}else if(c.equals("Rock")) {
				return "Computer wins";
			}else {
				return "It is a tie";
			}
		}else {
			throw new Exception("Enter Correct Move (Rock,Paper,Scissor)");
		}
	}
	 
	
}
