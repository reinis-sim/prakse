package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.FrequencyBlock;
import com.example.demo.repo.IFrequencyBlockRepo;
import com.example.demo.service.IFrequencyBlockService;

@Controller
public class FrequencyBlockController {
	
	
	@Autowired
	IFrequencyBlockService freqService;
	
	
	@GetMapping("/showAll")
	public String getShowAllPage(Model model) {
		
		System.out.println("Showing all frequency lists");
		
		model.addAttribute("innerObject", freqService.selectAllFrequencyBlock());
		
		return "show-all-page";
		
		
	}
	
	@GetMapping("/insert") //localhost:8080/insert
	public String getInsertPage (FrequencyBlock frequencyBlock) {
		
		return "insert-page";
	}
	
	@PostMapping("/insert")
	public String postInsertPage(@Valid FrequencyBlock frequencyBlock, BindingResult result )
	{
		System.out.println(frequencyBlock);
		
		if (result.hasErrors())
		{
			return "insert-page";
		}
		
		freqService.insertNewFrequencyBlock(frequencyBlock.getStartingFrequency(), frequencyBlock.getBandName(), frequencyBlock.getBandWidth(), frequencyBlock.getNumOfChannels());
		return "redirect:/showAll";
	}
	

}
