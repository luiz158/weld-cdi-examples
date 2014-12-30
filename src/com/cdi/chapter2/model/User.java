package com.cdi.chapter2.model;


public class User implements Account {

	@Override
	public String print() {
		return "I'm an User";
	}

}
