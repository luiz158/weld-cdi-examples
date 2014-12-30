package com.cdi.chapter2.model;

@Book(value = Category.NON_FICTION, description = "Non fiction books will be search")
public class NonFictionSearchBook implements SearchBook {

	@Override
	public String search() {
		return "Searching Non Fictions Book";
	}

}
