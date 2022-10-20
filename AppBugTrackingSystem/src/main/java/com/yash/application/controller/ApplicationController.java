package com.yash.application.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.application.entity.AppEntity;
import com.yash.application.model.Application;
import com.yash.application.model.ResponseMessage;
import com.yash.application.service.ApplicationService;

@RestController
public class ApplicationController {
	
	private static final Logger log = LoggerFactory.getLogger(ApplicationController.class);

	
	@Autowired
	ApplicationService applicationService;
	
	
	@PostMapping("/addApplication")
	public ResponseMessage addApplicationService( @RequestBody Application app) {
			log.info("In Method :addApplicationService Class: ApplicationController");
	return	applicationService.addApplicationService(app);
		
	}
	
	
	@PutMapping("/updateApplication")
	public ResponseMessage updateApplication(@RequestBody Application application) {
		log.info("In Method :updateApplication Class: ApplicationController");
		return applicationService.updateApplication(application);
	}
	
	@DeleteMapping("/deleteApplication")
	public ResponseMessage deleteApplication(@RequestBody Application application) {
		log.info("In Method :deleteApplication Class: ApplicationController");
		return applicationService.deleteApplication(application);
	}
	
	@GetMapping("/ListApplication")
	public ResponseMessage  listApplication( ) {
		log.info("In Method :ListApplication Class: ApplicationController");
		return applicationService.listApplication();
	}

}
