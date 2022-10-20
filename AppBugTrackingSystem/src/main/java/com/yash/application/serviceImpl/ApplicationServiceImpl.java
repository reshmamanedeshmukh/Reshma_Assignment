package com.yash.application.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import com.yash.application.entity.AppEntity;
import com.yash.application.model.Application;
import com.yash.application.model.ResponseMessage;
import com.yash.application.repository.AppRepository;
import com.yash.application.service.ApplicationService;
@Service
public class ApplicationServiceImpl implements ApplicationService {
	
	
	private static final Logger log = LoggerFactory.getLogger(ApplicationServiceImpl.class);

	
	@Autowired
	AppRepository appRepository;
	
	@Autowired
	ResponseMessage responseMessage;

	@Override
	public ResponseMessage addApplicationService(Application app) {
		log.info("Inside Method : addApplicationService Class: ApplicationServiceImpl");
		try {
		AppEntity appEntity= new AppEntity();
		appEntity.setAppId(app.getAppId());
		appEntity.setAppName(app.getAppName());
		appRepository.save(appEntity);
		responseMessage.setResponseCode("SU");
		responseMessage.setResponseMessage("Application Submitted Successfully!");
		responseMessage.setResponseObj(app);
		return responseMessage;
		}catch (Exception e) {
			log.info("Exception addApplicationService : "+e);
			e.printStackTrace();
			responseMessage.setResponseCode("ER");
			responseMessage.setResponseMessage("Error occurred while submiting application");
			return responseMessage;
		}
		
	}

	@Override
	public ResponseMessage updateApplication(Application application) {
		log.info("Inside Method : updateApplication Class: ApplicationServiceImpl");
		try {
			 Optional<AppEntity> appEntity= appRepository.findById(application.getAppId());
			
			 if(null!=application.getAppName()) {
							 
				appEntity.get().setAppName(application.getAppName());
				 
			 }
			 appRepository.save(appEntity.get());
		
			 responseMessage.setResponseCode("SU");
				responseMessage.setResponseMessage("Application Updated Successfully!");
				responseMessage.setResponseObj(application);
				return responseMessage;
			
		}catch (Exception e) {
			log.info("Exception updateApplication : "+e);
			responseMessage.setResponseCode("ER");
			responseMessage.setResponseMessage("Error occurred while updating application");
			return responseMessage;
		}
	}

	@Override
	public ResponseMessage deleteApplication(Application application) {
		// TODO Auto-generated method stub
		log.info("Inside Method : deleteApplicationService Class: ApplicationServiceImpl");
		
		try {
		Optional<AppEntity> appEntity=appRepository.findById(application.getAppId());
		if(null!=application.getAppId())
	appRepository.delete(appEntity.get());
	 responseMessage.setResponseCode("SU");
		responseMessage.setResponseMessage("Application deleted Successfully!");
		responseMessage.setResponseObj(application);
		return responseMessage;
	
}catch (Exception e) {
	log.info("Exception deleteApplication : "+e);
	responseMessage.setResponseCode("ER");
	responseMessage.setResponseMessage("Error occurred while deleting application");
	return responseMessage;
}
		
	}

	@Override
	public ResponseMessage listApplication() {

		
	log.info("Inside Method : listApplicationService Class: ApplicationServiceImpl");
			
			try {
				
				Iterable<AppEntity> iterable = appRepository.findAll();
				List<AppEntity> list = Streamable.of(iterable).toList();
				 responseMessage.setResponseCode("SU");
					responseMessage.setResponseMessage("Application list!");
					//for(AppEntity application:list) {
					responseMessage.setResponseObj(list);
					
					System.out.println(list);
					
					
					return responseMessage;
	}catch (Exception e) {
		log.info("Exception deleteApplication : "+e);
		responseMessage.setResponseCode("ER");
		responseMessage.setResponseMessage("Error occurred while deleting application");
		return responseMessage;
	}
	// return null;	
	
	}

		

	
	
	
	
	
	
	

}
