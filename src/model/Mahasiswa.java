/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author SB604-18
 */
public class Mahasiswa {

    private String nrp;
    private String nama;
    private String jurusan;
    private String email;

    public Mahasiswa() {

    }

    public Mahasiswa(String nrp, String nama, String jurusan, String email) {
        this.nama = nama;
        this.nrp = nrp;
        this.jurusan = jurusan;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
