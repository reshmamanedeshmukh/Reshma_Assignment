package com.yash.application.model;

import org.springframework.stereotype.Component;

@Component
public class Application {

	private Integer appId;
	private String appName;

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	@Override
	public String toString() {
		return "Application [appId=" + appId + ", appName=" + appName + "]";
	}



}
