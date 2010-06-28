package org.example;

import java.io.IOException;
import javax.servlet.http.*;

/**
 * Quick and dirty redirect to /
 */
public class HomeRedirector extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.sendRedirect( "/" );
	}
}

