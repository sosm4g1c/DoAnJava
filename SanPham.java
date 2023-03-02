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
public class SanPham {
//Khai Bao

    private int soLuong;
    private String maSP;
    private double giaSP;
    private String tenSP;
    private double giaGiam_SanPham;
//Constructor

    public SanPham(int soLuong, String maSP, double giaSP, String tenSP, double giaGiam_SanPham) {
        this.soLuong = soLuong;
        this.maSP = maSP;
        this.giaSP = giaSP;
        this.tenSP = tenSP;
        this.giaGiam_SanPham = giaGiam_SanPham;
    }
    //Getter and Setter

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGiaGiam_SanPham() {
        return giaGiam_SanPham;
    }

    public void setGiaGiam_SanPham(double giaGiam_SanPham) {
        this.giaGiam_SanPham = giaGiam_SanPham;
    }
    //HashCode and Equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.soLuong;
        hash = 47 * hash + Objects.hashCode(this.maSP);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.giaSP) ^ (Double.doubleToLongBits(this.giaSP) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.tenSP);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.giaGiam_SanPham) ^ (Double.doubleToLongBits(this.giaGiam_SanPham) >>> 32));
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
        final SanPham other = (SanPham) obj;
        if (this.soLuong != other.soLuong) {
            return false;
        }
        if (Double.doubleToLongBits(this.giaSP) != Double.doubleToLongBits(other.giaSP)) {
            return false;
        }
        if (Double.doubleToLongBits(this.giaGiam_SanPham) != Double.doubleToLongBits(other.giaGiam_SanPham)) {
            return false;
        }
        if (!Objects.equals(this.maSP, other.maSP)) {
            return false;
        }
        return Objects.equals(this.tenSP, other.tenSP);
    }

}
