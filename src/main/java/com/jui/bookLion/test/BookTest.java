package com.jui.bookLion.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jui.bookLion.dto.BookDTO;
import com.jui.bookLion.repository.BookDAO;

@WebServlet("/bookTest")
public class BookTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BookTest() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BookDAO dao = new BookDAO();

		String action = request.getParameter("action");
		String title = request.getParameter("title");

		if (action.equals("select")) {
			BookDTO resultList = dao.select(title);
			request.setAttribute("list", resultList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("test/serchForm.jsp");
			dispatcher.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

	}

}
