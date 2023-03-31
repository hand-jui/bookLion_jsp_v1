package com.jui.bookLion.repository;

import com.jui.bookLion.dto.UserDTO;

public interface IUserRepo {

	int joinUs(UserDTO dto);

	UserDTO logIn(String id, String password);

	int update(UserDTO dto);

	int delete(String id, String password);

}
