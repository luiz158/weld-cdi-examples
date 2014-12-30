package com.cdi.chapter2.model;

import javax.enterprise.inject.Alternative;

import com.cdi.chapter2.qualifier.Administrator;
import com.cdi.chapter2.qualifier.UserAccount;

@Alternative
@UserAccount
@Administrator
public class MockAccount implements Account {

	@Override
	public String print() {
		return "I'm a Mock account";
	}

}
