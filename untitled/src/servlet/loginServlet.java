package servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
    // 定义模板引擎对象，用来解析模板

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql:///homework?characterEncoding=utf8&useSSL=false";
            System.out.println("正在连接");
            Connection conn = DriverManager.getConnection(url, "root", "Qjj20030520");
            if (conn == null) {
                System.out.println("连接失败！");
            }
            System.out.println("连接成功！");
        } catch (Exception e) {
            System.out.println("ee连接失败！");
        }

    }
}