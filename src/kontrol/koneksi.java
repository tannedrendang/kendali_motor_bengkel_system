/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontrol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bayu
 */
public class koneksi {
    private Connection koneksi;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex);
        }
        String url = "jdbc:mysql://localhost:3306/bengkelvisual";
        try{
            koneksi = DriverManager.getConnection(url, "root", "");
            System.out.println("Berhasil Koneksi Database");
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        return koneksi;
    }
}