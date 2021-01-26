package com.example.xpertsystem;

import javax.swing.text.View;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.servlet.ModelAndView;

@Controller 

public class RegistrationController {
	Prediction p = new Prediction() ;
	PercResult pr = new PercResult();
	
	@RequestMapping("/regform")
	public String register()
	{
		return "registration" ;
	}
	
	@RequestMapping("/subDetails")
	public ModelAndView prediction(UserDetails user) {
		
		ModelMap model = new ModelMap();
		
		Double sm = p.calcresult(user) ;
		double bmi = p.bmi(user.getWeight(), user.getHeight()) ;
		String msg = pr.isSafe(sm);
		
		model.addAttribute("Fname", user.getFname());
		
		model.addAttribute("Lname", user.getLname());
		model.addAttribute("Gender", user.getGender() == Integer.parseInt("1")? "MALE" : "FEMALE");
		model.addAttribute("Age", user.getAge());
		model.addAttribute("Weight", user.getWeight());
		model.addAttribute("Height", user.getHeight());
		model.addAttribute("Chol", user.getChol());
		model.addAttribute("BSL", user.getBSL());
		model.addAttribute("BPL", user.getBPL());
		model.addAttribute("Diabetes", user.getDiabetes()== Integer.parseInt("1")? "YES":"NO");
		model.addAttribute("Exercise", user.getExercise()== Integer.parseInt("1")? "YES":"NO");
		model.addAttribute("Smoke", user.getSmoke()== Integer.parseInt("1")? "YES":"NO");
		model.addAttribute("Symptoms", user.getSymptoms()== Integer.parseInt("1")? "YES":"NO");		
		model.addAttribute("Result", sm);
		model.addAttribute("BMI", bmi);
		model.addAttribute("Msg", msg) ; 
		ModelAndView mv = new ModelAndView("results") ;
		mv.addObject("user", model);
		return mv ;
	}

}
