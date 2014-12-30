package com.cdi.chapter2.model;

import com.cdi.chapter2.qualifier.Book;
import com.cdi.chapter2.qualifier.Category;

@Book(value = Category.FICTION)
public class FictionSearchBook implements SearchBook {

	@Override
	public String search() {
		return "Searching Fictions Book";
	}

}
