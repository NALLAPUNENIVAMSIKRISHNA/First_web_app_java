// src/com/example/RegisterServlet.java
import java.io.*;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mywebappdb", "root", "password");

            PreparedStatement ps = con.prepareStatement("INSERT INTO users (email, password) VALUES (?, ?)");
            ps.setString(1, email);
            ps.setString(2, password);
            ps.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("index.html");
    }
}
