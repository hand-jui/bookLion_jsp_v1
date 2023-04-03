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
		String queryStr = " INSERT INTO user(name, id, password, phone, email) VALUE(?, ?, ?, ?, ?) ";
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getId());
			pstmt.setString(3, dto.getPassword());
			pstmt.setString(4, dto.getPhone());
			pstmt.setString(5, dto.getEmail());
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
		ResultSet rs = null;
		String queryStr = " SELECT * FROM user WHERE id = ? AND password = ? ";
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			String userid = rs.getString("userid");
			if (rs.next()) {
				if (password.equals(rs.getString("password"))) {
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(UserDTO dto) {
		int resultCount = 0;
		String queryStr = " UPDATE user SET password = ?, phone = ?, email = ?  WHERE id = ? AND password = ? ";
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, dto.getPassword());
			pstmt.setString(2, dto.getPhone());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getId());
			pstmt.setString(5, dto.getPassword());
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
