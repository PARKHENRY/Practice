

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalaServlet
 */
@WebServlet("/CalaServlet")
public class CalaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/views/calc.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String left = request.getParameter("left");
		String op = request.getParameter("op");
		String right = request.getParameter("right");
		
		int result = 0;
		
		if("pls".equals(op))
			result = Integer.parseInt(left) + Integer.parseInt(right);
		else if("min".equals(op))
			result = Integer.parseInt(left) - Integer.parseInt(right);
		else if("mul".equals(op))
			result = Integer.parseInt(left) * Integer.parseInt(right);
		else if("div".equals(op))
			result = Integer.parseInt(left) / Integer.parseInt(right);
		
		request.setAttribute("result", result);
		request.setAttribute("left", left);
		request.setAttribute("op", op);
		request.setAttribute("right", right);
		request.getRequestDispatcher("/WEB-INF/views/result.jsp").forward(request, response);
	}

}
