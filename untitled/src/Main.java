import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/bai_test?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
                Connection conn = DriverManager.getConnection(url, "root", "Qjj20030520");
                if(conn==null){
                    System.out.println("连接失败");
                }
                System.out.println("连接成功");
                //2. 通过连接对象得到sql语句对象

    }
}