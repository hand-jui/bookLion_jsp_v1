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
		if ("delete".equals(action)) {
			String bid = request.getParameter("bid");
			dao.delete(Integer.parseInt(bid));
			response.sendRedirect("/bookLion/bookTest");
		} else {
			BookDTO resultList = dao.select(title);
			request.setAttribute("list", resultList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("test/serchForm.jsp");
			dispatcher.forward(request, response);

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String category = request.getParameter("category");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String publisher = request.getParameter("publisher");
		String pubdate = request.getParameter("pubdate");
		String price = request.getParameter("price");
		String sale = request.getParameter("sale");
		String quantity = request.getParameter("quantity");

		BookDAO bookDAO = new BookDAO();

		String action = request.getParameter("action");
		int responseCount = 0;

		if (action.equals("insert")) {
			BookDTO bookDTO = new BookDTO(Integer.parseInt(id), category, title, author, publisher, pubdate,
					Integer.parseInt(price), Integer.parseInt(sale), Integer.parseInt(quantity));
			responseCount = bookDAO.insert(bookDTO);
		} else if (action.equals("update")) {
			responseCount = bookDAO.update(Integer.parseInt(sale), Integer.parseInt(quantity), title);

		}
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.print("저장 수 "+ responseCount);

	}

}
