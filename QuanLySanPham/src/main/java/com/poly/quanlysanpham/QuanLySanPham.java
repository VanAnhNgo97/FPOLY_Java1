/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.poly.quanlysanpham;

/**
 *
 * @author Admin
 */
public class QuanLySanPham {

    public static void main(String[] args) {
        SanPhamService spService = new SanPhamService();
        spService.nhapSanPham();
        spService.nhapSanPham();
        spService.nhapSanPham();
        spService.nhapSanPham();
        spService.nhapSanPham();
        spService.xuatDanhSachSanPham();
        spService.giaTrungBinh();
        spService.xoaSanPham();
        spService.xuatDanhSachSanPham();
        
    }
}
