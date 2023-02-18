/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.poly;

import java.util.Scanner;

/**
 *
 * @author AnhNV104
 */
public class QuanLyNhanVien {

    public static void main(String[] args) {
        int luaChon=1;
        Scanner scanner = new Scanner(System.in);
        NhanVienService nvService = new NhanVienService();
        while(luaChon != 0) {
            System.out.println("Vui long lua chon cac tinh nang tu 0-9");
            // Hien thi menu
            System.out.println("1. Nhap danh sach nhan vien tu ban phim");
            System.out.println("2. Xuat danh sach nhan vien ra man hinh");
            System.out.println("3. Tim va hien thi nhan vien theo ma nhap tu ban phim");
            System.out.println("4. Xoa nhan vien theo ma nhap vao tu ban phim");
            System.out.println("5. Cap nhat thong tin nhan vien theo ma nhap vao tu ban phim");
            System.out.println("6. Tim nhan vien theo khoang luong nhap vao tu ban phim");
            System.out.println("7. Sap xep nhan vien theo ho va ten");
            System.out.println("8. Sap xep nhan vien theo thu nhap");
            System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
            // Bo sung tinh nang thoat khoi chuong trinh
            System.out.println("0. Thoat khoi chuong trinh");
            
            System.out.print("Xin moi nhap: ");
            //Nhap 1 so tu ban phim
            luaChon = scanner.nextInt();
            switch(luaChon) {
                case 1:
                    System.out.println("Ban lua chon tinh nang 1: Them nhan vien");
                    nvService.themNhanVien();
                    break;
                case 2:
                    System.out.println("Ban lua chon tinh nang 2: Hien thi danh sach nhan vien");
                    nvService.hienThiDanhSachNhanVien();
                    break;
                case 3:
                    System.out.println("Ban lua chon tinh nang 3: Tim va hien thi nhan vien");
                    nvService.timVaHienThiNhanVien();
                    break;
                case 4:
                    System.out.println("Ban lua chon tinh nang 4: Xoa nhan vien");
                    nvService.xoaNhanVienTheoMa();
                    break;
                case 5:
                    System.out.println("Ban lua chon tinh nang 5: Cap nhat nhan vien");
                    nvService.capNhatNhanVien();
                    break;
                case 6:
                    System.out.println("Ban lua chon tinh nang 6: Tim nhan vien theo khoang luong");
                    nvService.timNhanVienTheoLuong();
                    break;
                case 7:
                    System.out.println("Ban lua chon tinh nang 7: Sap xep nhan vien theo ho va ten");
                    nvService.sapXepNhanVienTheoHoTen();
                    break;
                case 8:
                    System.out.println("Ban lua chon tinh nang 8: Sap xep nhan vien theo thu nhap");
                    nvService.sapXepNhanVienTheoThuNhap();
                    break;
                case 9:
                    System.out.println("Ban lua chon tinh nang 9: Xuat 5 nhan vien co thu nhap cao nhat");
                    nvService.top5NhanVienThuNhapCao();
                    break;
                default:
                    System.out.println("Cam on ban da su dung phan mem");
                    break;
            }
            System.out.println("-----------------KET THUC------------------");
        }
        
        
    }
}
