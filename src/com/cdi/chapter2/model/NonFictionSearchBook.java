package com.cdi.chapter2.model;

import com.cdi.chapter2.qualifier.Book;
import com.cdi.chapter2.qualifier.Category;

@Book(value = Category.NON_FICTION, description = "Non fiction books will be search")
public class NonFictionSearchBook implements SearchBook {

	@Override
	public String search() {
		return "Searching Non Fictions Book";
	}

}
