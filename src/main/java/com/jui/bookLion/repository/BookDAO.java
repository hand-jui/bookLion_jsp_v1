package com.jui.bookLion.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jui.bookLion.dto.BookDTO;
import com.jui.bookLion.utils.DBHelper;

public class BookDAO implements IBookRepo {

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;

	public BookDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public BookDTO select(String title) {
		ResultSet rs = null;
		String queryStr = " SELECT * FROM booklist WHERE title = ? ";
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, title);
			rs = pstmt.executeQuery();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return null;
	}

	@Override
	public int update(int sale, int quantity, String title) {
		int resultRow = 0;
		String queryStr  = " UPDATE booklist SET sale = ?, quantity = ? WHERE title = ? ";
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setInt(1, sale);
			pstmt.setInt(2, quantity);
			pstmt.setString(3, title);
			resultRow = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultRow;
	}

}
