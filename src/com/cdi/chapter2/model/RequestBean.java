package com.cdi.chapter2.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;

@RequestScoped //@Dependet
public class RequestBean {

	public RequestBean() {
		System.out.println("RequestBean constructor");
	}

	public String print() {
		return "RequestBean being using";
	}

	@PostConstruct
	public void postConstructor() {
		System.out.println("RequestBean post constructor");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("RequestBean preDestroy");
	}

}
