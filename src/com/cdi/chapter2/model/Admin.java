package com.cdi.chapter2.model;

import com.cdi.chapter2.qualifier.Administrator;

@Administrator
public class Admin implements Account {

	@Override
	public String print() {
		return "I'm an Admin";
	}

}
