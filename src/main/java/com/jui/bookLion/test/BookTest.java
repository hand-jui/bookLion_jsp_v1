package com.jui.bookLion.test;

import java.io.IOException;
import java.util.ArrayList;

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
		String category = request.getParameter("category");
		BookDTO dto = new BookDTO(category);

		ArrayList<BookDTO> resultList = dao.select(dto);
		
		request.setAttribute("list", resultList);
		
		if(category.equals("self")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("self.jsp");
			dispatcher.forward(request, response);
		} else if (category.equals("new")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("new.jsp");
			dispatcher.forward(request, response);
		} else if (category.equals("novel")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("novel.jsp");
			dispatcher.forward(request, response);
		} else if (category.equals("essay")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("essay.jsp");
			dispatcher.forward(request, response);
		}
		

		
				

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

	}

}
