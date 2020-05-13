import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("product");
        float price = Float.parseFloat(request.getParameter("price"));
        float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));

        float discountAmount = price * (discountPercent/100);
        float discountPrice= price - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Discount Calculator</h1>");
        writer.println("<p>Product Description: " + product + "</p>");
        writer.println("<p>Price: " + price + "</p>");
        writer.println("<p>Discount Percent: " + discountPercent + "</p>");
        writer.println("<p>Discount Amount: " + discountAmount + "</p>");
        writer.println("<p>Discount Price: " + discountPrice + "</p>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
