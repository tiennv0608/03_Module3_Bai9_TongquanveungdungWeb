import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletDiscountCalculator", urlPatterns = "/display-discount")
public class ServletDiscountCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        double percent = Double.parseDouble(request.getParameter("percent"));
        double amount = price * percent * 0.01;
        double discountPrice = price - amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h3>Product: "+product+"</h3>");
        writer.println("<h3>List price: "+price+"</h3>");
        writer.println("<h3>Discount percent: "+percent+"%</h3>");
        writer.println("<h3>Discount amount: "+amount+"</h3>");
        writer.println("<h3>Discount price: "+discountPrice+"</h3>");
        writer.println("</html>");
    }
}
