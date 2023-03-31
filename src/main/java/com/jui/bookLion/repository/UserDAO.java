package com.jui.bookLion.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jui.bookLion.dto.UserDTO;
import com.jui.bookLion.utils.DBHelper;

public class UserDAO implements IUserRepo {

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;

	public UserDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public int joinUs(UserDTO dto) {
		int resultCount = 0;
		String queryStr = " INSERT INTO user(id, password, name, address, phone, email, birth, account) "
				+ " VALUE(?, ?, ?, ?, ?, ?, ?, ?) ";
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getAddress());
			pstmt.setString(5, dto.getPhone());
			pstmt.setString(6, dto.getEmail());
			pstmt.setString(7, dto.getBirth());
			pstmt.setString(8, dto.getAccount());
			resultCount = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("User insert 오류");
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultCount;
	}

	@Override
	public UserDTO logIn(String id, String password) {
		ResultSet rs= null;
		String queryStr = " SELECT * FROM user WHERE id = ? AND password = ? ";
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			String userid = rs.getString("userid"); 
			if(password.equals("password")) {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(UserDTO dto) {
		int resultCount = 0;
		String queryStr = " UPDATE user SET password = ?, address = ?, phone = ?, email = ?, account = ? WHERE id = ? AND password = ? ";
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, dto.getPassword());
			pstmt.setString(2, dto.getAddress());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getEmail());
			pstmt.setString(5, dto.getAccount());
			pstmt.setString(6, dto.getId());
			pstmt.setString(7, dto.getPassword());
			resultCount = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("User update 오류");
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultCount;
	}

	@Override
	public int delete(String id, String password) {
		int resultCount = 0;
		String queryStr = " DELETE FROM user WHERE id = ? AND password = ? ";
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			resultCount = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("User delete 오류");
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultCount;
	}

}
