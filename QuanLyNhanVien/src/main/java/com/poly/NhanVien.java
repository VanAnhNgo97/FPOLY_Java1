/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly;

/**
 *
 * @author Admin
 */
public class NhanVien {
    protected String maNV;
    protected String hoTen;
    protected double luong;

    //Ham khoi tao - constructor
    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }
    // Getter & setter
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public double getThuNhap() {
        return this.luong;
    }
    
    public double getThueTN() {
        //Lay thu nhap cua nhan vien
        double thuNhap = this.getThuNhap();
        double thueTN = 0; //Khoi tao 1 bien luu thue
        if (thuNhap < 9000000) {
            return 0; //TH1
        } else if (thuNhap < 15000000) {
            thueTN = (thuNhap - 9000000) / 100 * 10; // TH2
            return thueTN;
        } else {
            thueTN = (thuNhap - 15000000) / 100 * 12 + 6000000 / 100 * 10; // TH3
            return thueTN;
        }
    }
    
    public void xuatThongTin() {
        //Hien thi ten - maNV - thu nhap - thue TN
        System.out.println("Thong tin nhan vien");
        System.out.println(this.maNV +  " - " + this.hoTen);
        System.out.println("Thu nhap: " + this.getThuNhap());
        System.out.println("Thue thu nhap: " + this.getThueTN());
    }
    
}
