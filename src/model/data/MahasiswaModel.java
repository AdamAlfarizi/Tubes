/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Mahasiswa;
import utilities.DatabaseUtilities;

/**
 *
 * @author SB604-18
 */
public class MahasiswaModel {
        public int Delete(Mahasiswa mhs) throws SQLException{
        Connection con = DatabaseUtilities.getConnection();
        try{
            PreparedStatement stat = con.prepareStatement("DELETE FROM mahasiswa WHERE nrp ");
            stat.setString(1, mhs.getNrp());
            stat.setString(2, mhs.getNama());
            stat.setString(3, mhs.getJurusan());
            stat.setString(4, mhs.getEmail());
            return stat.executeUpdate();
        }finally{
            if(con != null){
                con.close();
            }
        }
    }
    
    public int save(Mahasiswa mhs) throws SQLException{
        Connection con = DatabaseUtilities.getConnection();
        try{
            PreparedStatement stat = con.prepareStatement("INSERT INTO mahasiswa values(?,?,?,?)");
            stat.setString(1, mhs.getNrp());
            stat.setString(2, mhs.getNama());
            stat.setString(3, mhs.getJurusan());
            stat.setString(4, mhs.getEmail());
            return stat.executeUpdate();
        }finally{
            if(con != null){
                con.close();
            }
        }
    }
    
    public List<Mahasiswa> loadMahasiswas() throws SQLException{
    List<Mahasiswa> mhsList;
    Connection con = DatabaseUtilities.getConnection();
    try{
    Statement state = con.createStatement();
    ResultSet rs = state.executeQuery("SELECT * FROM mahasiswa");
    mhsList = new ArrayList<>();
    while (rs.next()){
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNrp(rs.getString("nrp"));
        mhs.setNama(rs.getString("nama"));
        mhs.setJurusan(rs.getString("jurusan"));
        mhs.setEmail(rs.getString("email"));
        
        mhsList.add(mhs);
    }
}finally{
        if (con != null) {
            con.close();
        }
    }
    return mhsList;
}
}
