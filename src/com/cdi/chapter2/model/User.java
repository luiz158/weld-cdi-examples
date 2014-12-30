package com.cdi.chapter2.model;

import com.cdi.chapter2.qualifier.UserAccount;

@UserAccount
public class User implements Account {

	@Override
	public String print() {
		return "I'm an User";
	}

}
