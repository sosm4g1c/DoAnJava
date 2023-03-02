/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoAnJava;

import java.util.Objects;

/**
 *
 * @author sosma
 */
public class PhieuNhap {
//Khai Bao

    private String maPhieuNhap;
    private double tongTienNhap;
    private Date ngayXuatPhieu;
//Constructor

    public PhieuNhap(String maPhieuNhap, double tongTienNhap, Date ngayXuatPhieu) {
        this.maPhieuNhap = maPhieuNhap;
        this.tongTienNhap = tongTienNhap;
        this.ngayXuatPhieu = ngayXuatPhieu;
    }
    //Getter and Setter

    public String getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(String maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public double getTongTienNhap() {
        return tongTienNhap;
    }

    public void setTongTienNhap(double tongTienNhap) {
        this.tongTienNhap = tongTienNhap;
    }

    public Date getNgayXuatPhieu() {
        return ngayXuatPhieu;
    }

    public void setNgayXuatPhieu(Date ngayXuatPhieu) {
        this.ngayXuatPhieu = ngayXuatPhieu;
    }
    //HashCode and Equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.maPhieuNhap);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.tongTienNhap) ^ (Double.doubleToLongBits(this.tongTienNhap) >>> 32));
        hash = 43 * hash + Objects.hashCode(this.ngayXuatPhieu);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PhieuNhap other = (PhieuNhap) obj;
        if (Double.doubleToLongBits(this.tongTienNhap) != Double.doubleToLongBits(other.tongTienNhap)) {
            return false;
        }
        if (!Objects.equals(this.maPhieuNhap, other.maPhieuNhap)) {
            return false;
        }
        return Objects.equals(this.ngayXuatPhieu, other.ngayXuatPhieu);
    }

}
