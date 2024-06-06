// src/com/example/LoginServlet.java

import java.io.*;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        boolean loginSuccessful = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mywebappdb", "root", "password");

            PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE email=? AND password=?");
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                loginSuccessful = true;
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (loginSuccessful) {
            response.sendRedirect("home.jsp");
        } else {
            response.sendRedirect("index.html");
        }
    }
}
