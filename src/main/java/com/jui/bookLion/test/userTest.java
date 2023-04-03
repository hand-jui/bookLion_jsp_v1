package com.jui.bookLion.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jui.bookLion.dto.UserDTO;
import com.jui.bookLion.repository.UserDAO;

@WebServlet("/userTest")
public class userTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public userTest() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserDAO dao = new UserDAO();
		String action = request.getParameter("action");
		if ("delete".equals(action)) {
			String cid = request.getParameter("cid");
			String cpwd = request.getParameter("cpwd");
			dao.delete(cid, cpwd);
			response.sendRedirect("/bookLion/userTest");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String id = request.getParameter("userid");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");

		UserDTO dto = new UserDTO(100, name, id, password, phone, email);
		UserDAO dao = new UserDAO();

		String action = request.getParameter("action");

		int responseCount = 0;
		if (action.equals("insert")) {
			responseCount = dao.joinUs(dto);

		} else if (action.equals("update")) {
			responseCount = dao.update(dto);
		} else if (action.equals("select")) {
			System.out.println(id + password);
			UserDTO result = dao.logIn(id, password);
			System.out.println(result);
			HttpSession session = request.getSession();
			session.setAttribute("id", result.getId());
			session.setAttribute("password", result.getPassword());
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/welcome.jsp");
			dispatcher.forward(request, response);

		}
		response.setContentType("text/plain; UTF-8;");
		// PrintWriter out = response.getWriter();
		// out.println(dto);
		// out.print("저장되 수" + responseCount);
	}

}
