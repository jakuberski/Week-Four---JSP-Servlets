package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TimecardCalculations;

/**
 * Servlet implementation class overtimeServlet
 */
@WebServlet("/overtimeServlet")
public class overtimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public overtimeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String bonus = request.getParameter("bonus");
		String userHours = request.getParameter("hours");
		
		TimecardCalculations alex = new TimecardCalculations(Integer.parseInt(userHours));
		
		alex.setBonus(Integer.parseInt(bonus));
		
	

		request.setAttribute("employee", alex);
		getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);

	}
}
