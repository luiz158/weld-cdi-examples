package com.cdi.chapter2.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ApplicationBean {

	@Inject
	private RequestBean requestBean;

	public ApplicationBean() {
		System.out.println("ApplicationBean constructor");
	}

	public String print() {
		return "ApplicationBean being using" + " " + requestBean.print();
	}

	@PostConstruct
	public void postConstructor() {
		System.out.println("ApplicationBean post constructor");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("ApplicationBean preDestroy");
	}
}
