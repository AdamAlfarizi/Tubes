/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.SQLException;
import view.MahasiswaFrame;

/**
 *
 * @author Asus
 */
public class MainProgram {
    
    public static void main(String[]args) throws SQLException{
        new MahasiswaFrame().setVisible(true);
    }
    
}
