/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author USER
 */
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
public class koneksi {
    public static Connection bukaCon(){
       try {
           MysqlDataSource kont = new MysqlDataSource();
           kont.setDatabaseName("uts");
           kont.setUser("root");
           kont.setPassword("");
           kont.setServerName("localhost");
           kont.setPort(8111);
           kont.setServerTimezone("Asia/Jakarta");
           Connection c = kont.getConnection();
           return c;
       } catch (SQLException e) {
       }
       return null;
   }

    static com.sun.jdi.connect.spi.Connection getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}