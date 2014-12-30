package com.cdi.chapter2.model;

@Book(value = Category.FICTION)
public class FictionSearchBook implements SearchBook {

	@Override
	public String search() {
		return "Searching Fictions Book";
	}

}
