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
public class HoaDon {
//Khai Bao

    private String maHoaDon;
    private double tongTienHD;
    private float diemTV;
    private double tienGiam;
    private Date ngayXuat;
//Constructor

    public HoaDon(String maHoaDon, double tongTienHD, float diemTV, double tienGiam, Date ngayXuat) {
        this.maHoaDon = maHoaDon;
        this.tongTienHD = tongTienHD;
        this.diemTV = diemTV;
        this.tienGiam = tienGiam;
        this.ngayXuat = ngayXuat;
    }
//Getter and Setter

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public double getTongTienHD() {
        return tongTienHD;
    }

    public void setTongTienHD(double tongTienHD) {
        this.tongTienHD = tongTienHD;
    }

    public float getDiemTV() {
        return diemTV;
    }

    public void setDiemTV(float diemTV) {
        this.diemTV = diemTV;
    }

    public double getTienGiam() {
        return tienGiam;
    }

    public void setTienGiam(double tienGiam) {
        this.tienGiam = tienGiam;
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }
//Hash Code and Equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.maHoaDon);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.tongTienHD) ^ (Double.doubleToLongBits(this.tongTienHD) >>> 32));
        hash = 13 * hash + Float.floatToIntBits(this.diemTV);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.tienGiam) ^ (Double.doubleToLongBits(this.tienGiam) >>> 32));
        hash = 13 * hash + Objects.hashCode(this.ngayXuat);
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
        final HoaDon other = (HoaDon) obj;
        if (Double.doubleToLongBits(this.tongTienHD) != Double.doubleToLongBits(other.tongTienHD)) {
            return false;
        }
        if (Float.floatToIntBits(this.diemTV) != Float.floatToIntBits(other.diemTV)) {
            return false;
        }
        if (Double.doubleToLongBits(this.tienGiam) != Double.doubleToLongBits(other.tienGiam)) {
            return false;
        }
        if (!Objects.equals(this.maHoaDon, other.maHoaDon)) {
            return false;
        }
        return Objects.equals(this.ngayXuat, other.ngayXuat);
    }

}
