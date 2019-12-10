/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author SB604-18
 */
public class ConnectionTest {
    public static void main (String[]args){
        Connection con = DatabaseUtilities.getConnection();
        
        if (con != null) {
            JOptionPane.showMessageDialog(null, "Koneksi Berhasi");
    }else{
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
}
}
