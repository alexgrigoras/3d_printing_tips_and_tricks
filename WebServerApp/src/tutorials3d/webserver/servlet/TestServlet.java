package tutorials3d.webserver.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet abcd
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    response.setCharacterEncoding("utf-8");
	    PrintWriter pw = response.getWriter();
	    pw.append("<h1>Exemplu de servlet</h1>");
        pw.append("Context path: ").append(request.getContextPath()).append("<br/>");
        pw.append("Request URI: ").append(request.getRequestURI()).append("<br/>");
        pw.append("Parameter map: ").append(request.getParameterMap().toString()).append("<br/>");
        request.setAttribute("UnAtribut", Math.random());
        pw.append("Attributes: ").append("<br/>");
        Enumeration<String> attributeNames =  request.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            String attr = attributeNames.nextElement();
            pw.append("- ").append(attr).append(": ").append(request.getAttribute(attr).toString()).append("<br/>");
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
