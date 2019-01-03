package com.truyenho;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DisplayDiscountServlet", urlPatterns = "/display-discount")
public class DisplayDiscountServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String description = request.getParameter("description");
    float price = Float.parseFloat(request.getParameter("price"));
    float discountPercent = Float.parseFloat(request.getParameter("discount_percent"));

    float discountAmount = (float) (price * discountPercent * 0.01);

    PrintWriter writer = response.getWriter();
    writer.println("<html>");
    writer.println("<head>\n<title>Product Discount Calculator</title>\n<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\"/>\n</head>");
    writer.println("<body>\n<div id=\"content\">");
    writer.println("<h1>Product Discount Calculator</h1>");
    writer.println("<label>Product Description: </label><span>" + description + "</span></br>");
    writer.println("<label>Price: $</label><span>" + price + "</span></br>");
    writer.println("<label>Discount Percent: </label><span>" + discountPercent + " %</span></br>");
    writer.println("<label>Discount Amount: $</label><span>" + discountAmount + "</span></br>");
    writer.println("<label>Discount Price: $</label><span>" + (price-discountAmount) + "</span></br>");
    writer.println("</div></body>");
    writer.println("</html>");
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}
