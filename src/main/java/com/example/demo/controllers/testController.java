package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.FrequencyBlock;
import com.example.demo.repo.IFrequencyBlockRepo;



@Controller
public class testController {
	
	@Autowired
	IFrequencyBlockRepo freqRepo;
	
	@GetMapping("/test") // url - localhost:8080/test
	public String getTest(Model model) {
		
		System.out.println("Just opened the testing page");
		
		FrequencyBlock fb1 =new FrequencyBlock(6657.05f, "L", 8.0f, 8);
		freqRepo.save(fb1);
		
		System.out.println(fb1);
		
		
	
		return "test-page";

		
	}

}
