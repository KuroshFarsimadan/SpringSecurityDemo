package com.kuroshfarsimadan.demonstration.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kuroshfarsimadan.demonstration.service.MiscService;

@Controller
@RequestMapping (value="misc")
public class MiscController {

	@Inject
	private MiscService miscService;
	
	public MiscService getMiscService() {
		return miscService;
	}

	public void setMiscService(MiscService miscService) {
		this.miscService = miscService;
	}
	

	@RequestMapping(value = "/admineille", method = RequestMethod.GET)
	public String onlyForAdmins(Model model) {
		miscService.serviceForAdmins();
		model.addAttribute("viesti", "Lisäsivu admineille");
		return "misc";
	}
	
	@RequestMapping(value = "/sisaankirjautuneille", method = RequestMethod.GET)
	public String onlyForLogged(Model model) {
		miscService.serviceForLoggedInUsers();
		model.addAttribute("viesti", "Lisäsivu sisäänkirjautuneille");
		return "misc";
	}
	
	@RequestMapping(value = "/kaikille", method = RequestMethod.GET)
	public String allUsers(Model model) {
		miscService.serviceForAll();
		model.addAttribute("viesti", "Lisäsivu kaikille");
		return "misc";
	}
	
	
}
