package com.jui.bookLion.repository;

import com.jui.bookLion.dto.BookDTO;

public interface IBookRepo {

	BookDTO select(String title);

	int insert(BookDTO dto);

	int update(int sale, int quantity, String title);

	int delete(int quantity);

}
