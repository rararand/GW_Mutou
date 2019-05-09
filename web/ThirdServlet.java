package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		//送信したパラメータの取得(文字列)
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String sex = req.getParameter("sex");
		String ran = req.getParameter("kyoumi");
		String ran2 = req.getParameter("kyoumi1");
		String ran3 = req.getParameter("kyoumi2");

		resp.setContentType("text/html; charset = UTF-8");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		out.println("<h1>申し込み入力画面</h1>");
		out.println("<p>お名前</p>");
		out.println(name);
		out.println("<p>年齢</p>");
		out.println(age + "歳");
		out.println("<p>性別</p>");
		out.println(sex);
		out.println("<p>興味のある言語</p>");
		if(ran != null) {
			out.println(ran);
		}
		if(ran2 != null) {
			out.println(ran2);
		}
		if(ran3 != null) {
			out.println(ran3);
		}

		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
		out.close();
	}

}
