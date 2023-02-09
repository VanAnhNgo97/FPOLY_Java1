/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.quanlysanpham;

/**
 *
 * @author Admin
 */
public class SanPham {
    private String tenSP;
    private int gia;
    
    //Ham khoi tao
    public SanPham() {
    }
    
    public SanPham(String tenSP, int gia) {
        this.tenSP = tenSP;
        this.gia = gia;
    }

    //getter and setter for tenSP
    public String getTenSP() {
        return this.tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getGia() {
        return this.gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
    
    
}
