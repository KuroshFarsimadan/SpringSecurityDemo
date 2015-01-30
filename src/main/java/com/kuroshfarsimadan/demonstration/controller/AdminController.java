package com.kuroshfarsimadan.demonstration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/secure/admin")
public class AdminController {

	@RequestMapping(value = "/tools", method = RequestMethod.GET)
	public String mainPage(Model model) {

		return "secure/admin/tools";
	}
	
	@RequestMapping(value = "/outputXML", method = RequestMethod.GET)
	public String outputXML(Model model) {
		System.out.println("Method outputXML");
		return "secure/admin/outputXML";
	}
}
