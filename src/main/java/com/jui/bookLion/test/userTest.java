package com.jui.bookLion.test;

import java.io.IOException;

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
public class UserTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserTest() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserDAO dao = new UserDAO();
		String action = request.getParameter("action");
		if ("delete".equals(action)) {
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			dao.delete(id, password);
			response.sendRedirect("/bookLion/userTest");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; UTF-8;");
		response.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");

		UserDTO dto = null;
		UserDAO dao = new UserDAO();

		String action = request.getParameter("action");
		

		int responseCount = 0;
		if (action.equals("insert")) {
			dto = new UserDTO(100, name, id, password, phone, email);
			responseCount = dao.joinUs(dto);
			RequestDispatcher dispatcher = request.getRequestDispatcher("loginForm.jsp");
			dispatcher.include(request, response);
			
		} else if (action.equals("update")) {
			dto =  new UserDTO(0, name, id, password, phone, email);
			System.out.println("========================");
			responseCount = dao.update(dto);
			System.out.println("========================");
			RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
			dispatcher.include(request, response);
		} else if (action.equals("select")) {
			System.out.println(id + " : " + password);

			UserDTO resultResponse = dao.logIn(id, password);

			session.setAttribute("id", resultResponse.getId());
			session.setAttribute("name", resultResponse.getName());
			session.setAttribute("phone", resultResponse.getPhone());
			session.setAttribute("email", resultResponse.getEmail());
			RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
			dispatcher.forward(request, response);

		}
		
		// PrintWriter out = response.getWriter();
		// out.println(dto);
		// out.print("저장되 수" + responseCount);
	}

}
