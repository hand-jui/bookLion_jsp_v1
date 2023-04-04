package com.jui.bookLion.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
	public ArrayList<BookDTO> select(BookDTO dto) {
		ArrayList<BookDTO> list = new ArrayList<>();
		BookDTO bookDTO = null;
		ResultSet rs = null;
		String queryStr = " SELECT * FROM booklist INNER JOIN category ON booklist.category = category.c_id WHERE c_name= ? ";
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, dto.getC_name());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				int c_id = rs.getInt("c_id");
				String c_name = rs.getString("c_name");
				String img = rs.getString("img");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String publisher = rs.getString("publisher");
				String pubdate = rs.getString("pubdate");
				int price = rs.getInt("price");
				int sale = rs.getInt("sale");
				int quantity = rs.getInt("quantity");
				bookDTO = new BookDTO(id, c_id, c_name, img, title, author, publisher, pubdate, price, sale, quantity);
				list.add(bookDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public int update(int sale, int quantity, String title) {
		int resultRow = 0;
		String queryStr = " UPDATE booklist SET sale = ?, quantity = ? WHERE title = ? ";
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
