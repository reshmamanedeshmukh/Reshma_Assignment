package com.yash.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yash.application.entity.AppEntity;
import com.yash.application.model.Application;
import com.yash.application.model.ResponseMessage;


@Service
public interface ApplicationService {
	
	public ResponseMessage addApplicationService(Application app);
	
	public ResponseMessage deleteApplication(Application application);

	public ResponseMessage updateApplication(Application application); 
	
	public ResponseMessage listApplication();

}
