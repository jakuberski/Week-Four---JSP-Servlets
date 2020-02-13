package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TimecardCalculations;

/**
 * Servlet implementation class timecardServlet
 */
@WebServlet("/timecardServlet")
public class timecardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public timecardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userHours =request.getParameter("hours");
		TimecardCalculations alex = new TimecardCalculations(Integer.parseInt(userHours));
		request.setAttribute("employee", alex);
		if(alex.isOvertime()) {
			getServletContext().getRequestDispatcher("/overtime.jsp").forward(request, response);
			
		}
		else {
			
			getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);
			
		}
		
		
	}

}
