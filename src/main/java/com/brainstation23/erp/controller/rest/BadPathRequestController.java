package com.brainstation23.erp.controller.rest;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class BadPathRequestController {
	@GetMapping("/{path:[^\\.]*}")
	public RedirectView redirect() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("http://localhost:8080/error");
		return redirectView;
	}
}
