/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.quanlysanpham;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SanPhamService {
    private ArrayList<SanPham> dsSanPham;

    public SanPhamService() {
        this.dsSanPham = new ArrayList<SanPham>();
    }
    
    public void nhapSanPham() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ten SP: ");
        String tenSP = scanner.nextLine();
        System.out.println("Gia thanh: ");
        int gia = scanner.nextInt();
        SanPham sp = new SanPham(tenSP, gia);
        this.dsSanPham.add(sp);
    }
    
    public void xuatDanhSachSanPham() {
        System.out.println("STT - Ten SP - Gia");
        int dem = 1;
        for(SanPham sp: this.dsSanPham) {
            System.out.println(dem + " - " + sp.getTenSP() + " - " + sp.getGia());
        }
    }
    
    public void timKiemSanPham() {
        //Su dung vong lap for, kiem tr
    }
    
    public void xoaSanPham() {
    }
    
    public void sapXepSanPham() {
    }
    
    public void giaTrungBinh() {
        int tongGia = 0;
        int soLuongSP = this.dsSanPham.size();
        double giaTrungBinh = 0; //giaTB = tongGia / soLuongSP
        for(SanPham sp: this.dsSanPham) {
            tongGia = tongGia + sp.getGia();
        }
        giaTrungBinh = (double)tongGia / soLuongSP;
        System.out.println("Gia trung binh: " + giaTrungBinh);
    }
    
}
