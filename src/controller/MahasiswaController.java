/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.List;
import model.Mahasiswa;
import model.data.MahasiswaModel;

/**
 *
 * @author SB604-18
 */
public class MahasiswaController {
    public List<Mahasiswa> loadMahasiswas() throws SQLException{
        MahasiswaModel model = new MahasiswaModel();
        return model.loadMahasiswas();
    }
    public int insert(Mahasiswa mahasiswa) throws SQLException{
        MahasiswaModel model = new MahasiswaModel();
        return model.save(mahasiswa);
    }
    
}
