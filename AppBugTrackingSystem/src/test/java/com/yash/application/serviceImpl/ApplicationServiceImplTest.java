package com.yash.application.serviceImpl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoSettings;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.yash.application.entity.AppEntity;
import com.yash.application.model.Application;
import com.yash.application.model.ResponseMessage;
import com.yash.application.repository.AppRepository;

@RunWith(MockitoJUnitRunner.class)
class ApplicationServiceImplTest {

	@InjectMocks
	ApplicationServiceImpl sut;
	
	
	@Mock
	AppRepository repo;
	
	
	@Mock
	ResponseMessage response;
	
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void test01() {
		Application app= new Application();
		response.setResponseCode(Mockito.any());
		response.setResponseDisc(Mockito.anyString());
		response.setResponseMessage(Mockito.anyString());
		response.setResponseObj(Mockito.any());
		assertEquals(response, sut.addApplicationService(app));
	}
	
	
	@Test
	public void test02() {
		Application app= new Application();
		response.setResponseCode(Mockito.any());
		response.setResponseDisc(Mockito.anyString());
		response.setResponseMessage(Mockito.anyString());
		response.setResponseObj(Mockito.any());
		assertEquals(response, sut.updateApplication(app));
	}
	@Test
	public void test03() {
		Application app= new Application();
		response.setResponseCode(Mockito.any());
		response.setResponseDisc(Mockito.anyString());
		response.setResponseMessage(Mockito.anyString());
		response.setResponseObj(Mockito.any());
		assertEquals(response, sut.deleteApplication(app));
	}
	
	@Test
	public void test04() {
		Application app= new Application();
		
		response.setResponseCode(Mockito.any());
		response.setResponseDisc(Mockito.anyString());
		response.setResponseMessage(Mockito.anyString());
		response.setResponseObj(Mockito.anyIterable());
	     
		assertEquals(response, sut.listApplication());
	}

}
