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

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    //Ham khoi tao
    public SanPham(String tenSP, int gia) {
        this.tenSP = tenSP;
        this.gia = gia;
    }
    
    
}
