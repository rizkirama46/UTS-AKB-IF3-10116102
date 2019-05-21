package com.example.uts;

//Tanggal Pengerjaaan = 21-mei-2019
//10116102
//Mohammad Rizki Ramadhan/
//IF-3

public class Model {
    private String nim;
    private String nama;
    private String kelas;
    private String telp;
    private String email;
    private String ig;

    public Model(String nim, String nama, String kelas, String telp, String email, String ig) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.telp = telp;
        this.email = email;
        this.ig = ig;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIg() {
        return ig;
    }

    public void setIg(String ig) {
        this.ig = ig;
    }
}