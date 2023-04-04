package com.jui.bookLion.repository;

import java.util.ArrayList;

import com.jui.bookLion.dto.BookDTO;

public interface IBookRepo {

	ArrayList<BookDTO> select(BookDTO dto);

	int update(int sale, int quantity, String title);

}
