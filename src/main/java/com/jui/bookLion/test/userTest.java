package com.jui.bookLion.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		} else {

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String no = request.getParameter("no");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String birth = request.getParameter("birth");
		String account = request.getParameter("account");

		UserDTO dto = new UserDTO(Integer.parseInt(no), id, password, name, address, phone, email, birth, account);
		UserDAO dao = new UserDAO();

		String action = request.getParameter("action");
		int responseCount = 0;
		if (action.equals("insert")) {
			responseCount = dao.joinUs(dto);

		} else if (action.equals("update")) {
			responseCount = dao.update(dto);
		}
		response.setContentType("text/plain; UTF-8;");
		PrintWriter out = response.getWriter();
		out.print("저장되 수" + responseCount);
	}

}
