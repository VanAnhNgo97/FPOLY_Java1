/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVienService {
    public ArrayList<NhanVien> dsNhanVien;
    public NhanVienService() {
        dsNhanVien = new ArrayList<NhanVien>();
    }
    
    public void themNhanVien() {
        //Nhap vao tu ban phim cac thong tin maNV, ten, luong
        Scanner scanner = new Scanner(System.in);
        String maNV, hoTen, tiepTuc;
        double luong;
        do {
            System.out.print("Nhap vao ma NV: ");
            maNV = scanner.nextLine();
            System.out.print("Nhap vao ho ten: ");
            hoTen = scanner.nextLine();
            System.out.print("Nhap vao luong: ");
            luong = scanner.nextDouble();
            //Khoi tao 1 nhan vien day du cac thong tin vua nhap
            NhanVien nv = new NhanVien(maNV, hoTen, luong);
            //Them nv vao trong ds
            this.dsNhanVien.add(nv);
            scanner.nextLine(); //Tranh gay ra loi
            System.out.println("Ban muon tiep tuc them nhan vien?");
            System.out.print("Chon k de thoat, Moi lua chon: ");
            tiepTuc = scanner.nextLine();
            if (tiepTuc.equals("k")) {
                break;
            }
            System.out.println("Moi nhap nhan vien tiep theo");
        } while (true); 
    }
    
    public void hienThiDanhSachNhanVien() {
        for(NhanVien nv: this.dsNhanVien) {
            nv.xuatThongTin();
        }
    }
    
    public int timKiemNhanVien(String maNV) {
        for(int i=0; i < this.dsNhanVien.size(); i++) {
            //Lay ra nhan vien thu i
            NhanVien nv = this.dsNhanVien.get(i);
            //Kiem tra nhan vien co ma hay ko
            if (nv.getMaNV().equals(maNV)) {
                return i; //Tra ve vi tri trong ds
            }
        }
        return -1;
    }
    
    public void timVaHienThiNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma NV can tim kiem: ");
        String maNV = scanner.nextLine();
        int viTri = this.timKiemNhanVien(maNV);
        if (viTri == -1) {
            System.out.println("Khong tim thay nhan vien");
        } else {
            NhanVien nv = this.dsNhanVien.get(viTri);
            nv.xuatThongTin();
        }
    }
    
    public void xoaNhanVienTheoMa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma NV can tim kiem: ");
        String maNV = scanner.nextLine();
        int viTri = this.timKiemNhanVien(maNV);
        if (viTri == -1) {
            System.out.println("Khong tim thay nhan vien");
        } else {
            this.dsNhanVien.remove(viTri); //Xoa nhan vien theo vi tri
            System.out.println("Xoa thanh cong nv ma " + maNV);
        }
    }
    
    public void capNhatNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma NV can tim kiem: ");
        String maNV = scanner.nextLine();
        int viTri = this.timKiemNhanVien(maNV);
        if (viTri == -1) {
            System.out.println("Khong tim thay nhan vien");
        } else {
            String hoTenMoi;
            double luongMoi;
            System.out.print("Ho ten moi: ");
            hoTenMoi = scanner.nextLine();
            System.out.println("Muc luong moi: ");
            luongMoi = scanner.nextDouble();
            //Lay ra nhan vien
            NhanVien nv = this.dsNhanVien.get(viTri);
            //update ho ten va muc luong
            nv.setHoTen(hoTenMoi);
            nv.setLuong(luongMoi);           
        }
    }
    
    public void timNhanVienTheoLuong() {
        Scanner scanner = new Scanner(System.in);
        double khoangLuongBatDau, khoangLuongKetThuc;
        System.out.print("Nhap dai luong tu: ");
        khoangLuongBatDau = scanner.nextDouble();
        System.out.print("den: ");
        khoangLuongKetThuc = scanner.nextDouble();
        //Khai bao 1 array list luu tru danh sach nhan vien phu hop
        ArrayList<NhanVien> ketQua = new ArrayList<NhanVien>();
        //Su dung vong lap for
        for(NhanVien nv: this.dsNhanVien) {
            double luong = nv.getLuong();
            if(luong >= khoangLuongBatDau && luong <= khoangLuongKetThuc) {
                ketQua.add(nv);
            }
        }
        //Kiem tra xem ket qua co chua nhan vien hay ko
        if(ketQua.isEmpty()) {
            System.out.println("Khong tim thay nhan vien co muc luong tu "
                               + khoangLuongBatDau + " den " + khoangLuongKetThuc);
        } else {
            System.out.println("Danh sach nhan vien co luong tu "
                               + khoangLuongBatDau + " den " + khoangLuongKetThuc + ":");
            for(NhanVien nv: ketQua) {
                nv.xuatThongTin();
            }
        }
    }
    
    public void sapXepNhanVienTheoHoTen() {
        //Khai bao 1 tieu chi so sanh
        Comparator<NhanVien> soSanhHoTen = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                String tenNV1 = nv1.getHoTen();
                String tenNV2 = nv2.getHoTen();
                return tenNV1.compareToIgnoreCase(tenNV2);
            }
        };
        //Sap xep ho ten theo thu tu A - Z
        Collections.sort(this.dsNhanVien, soSanhHoTen);
        System.out.println("Danh sach nhan vien sap xep theo ho ten:");
        this.hienThiDanhSachNhanVien();
    }
    
    public void sapXepNhanVienTheoThuNhap() {
        //Khai bao 1 tieu chi so sanh
        Comparator<NhanVien> soSanhThuNhap = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                Double thuNhapNV1 = Double.valueOf(nv1.getThuNhap());
                Double thuNhapNV2 = Double.valueOf(nv2.getThuNhap());
                return thuNhapNV1.compareTo(thuNhapNV2);
            }
            
        };
        //Sap xep nhan vien theo thu nhap tu thap den cao
        Collections.sort(this.dsNhanVien, soSanhThuNhap);
        System.out.println("Danh sach nhan vien sap xep theo thu nhap:");
        this.hienThiDanhSachNhanVien();
    }
    
    public void top5NhanVienThuNhapCao() {
        //Khai bao 1 tieu chi so sanh
        Comparator<NhanVien> soSanhThuNhap = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                Double thuNhapNV1 = Double.valueOf(nv1.getThuNhap());
                Double thuNhapNV2 = Double.valueOf(nv2.getThuNhap());
                return thuNhapNV2.compareTo(thuNhapNV1);
            }
            
        };
        //Sap xep nhan vien theo thu nhap tu thap den cao
        Collections.sort(this.dsNhanVien, soSanhThuNhap);
        System.out.println("Top 5 Nhan Vien thu nhap cao");
        for(int i=0; i<5; i++) {
            if(i < this.dsNhanVien.size()) {
                NhanVien nv = this.dsNhanVien.get(i);
                nv.xuatThongTin();
            } else {
                break;
            }
        }
        
    }
    
}
