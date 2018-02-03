package com.example.sinki.model;

/**
 * Created by Sinki on 8/21/2017.
 */

public class NhanVien {
    private String ten;
    private String thuBatDauCongTac;
    private int soNgayCongTac;

    public NhanVien() {
    }

    public NhanVien(String ten, String thuBatDauCongTac, int soNgayCongTac) {
        this.ten = ten;
        this.thuBatDauCongTac = thuBatDauCongTac;
        this.soNgayCongTac = soNgayCongTac;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return this.ten+"\nBắt đầu đi công tác vào thứ "
                + this.thuBatDauCongTac
                + " trong " + this.soNgayCongTac + " ngày.";
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getThuBatDauCongTac() {
        return thuBatDauCongTac;
    }

    public void setThuBatDauCongTac(String thuBatDauCongTac) {
        this.thuBatDauCongTac = thuBatDauCongTac;
    }

    public int getSoNgayCongTac() {
        return soNgayCongTac;
    }

    public void setSoNgayCongTac(int soNgayCongTac) {
        this.soNgayCongTac = soNgayCongTac;
    }


}
