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
        System.out.println("Them san pham thanh cong");
    }
    
    public void xuatDanhSachSanPham() {
        System.out.println("STT - Ten SP - Gia");
        int dem = 1;
        for(SanPham sp: this.dsSanPham) {
            System.out.println(dem + " - " + sp.getTenSP() + " - " + sp.getGia());
        }
    }
    
    public int timKiemSanPham() {
        /**Su dung vong lap for, kiem tra sp trong danh sach
         * Tra ve thu tu cua san pham trong danh sach
         * Neu khong ton tai, tra ve -1
         */
        System.out.println("Nhap ten SP can tim kiem:");
        Scanner scanner = new Scanner(System.in);
        String tenSP = scanner.nextLine();
        
        for(int i = 0; i < this.dsSanPham.size(); i++) {
            SanPham sp = this.dsSanPham.get(i);
            if(sp.getTenSP().equals(tenSP)){
                return i;
            }
        }
        return -1;
    }
    
    public void xoaSanPham() {
        int viTri = this.timKiemSanPham();
        if(viTri == -1) {
            System.out.println("San pham khong ton tai");
        } else {
            System.out.println("Xoa thanh cong san pham");
        }
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
