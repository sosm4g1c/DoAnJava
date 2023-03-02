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
public class PhieuGiamGia {
//Khai Bao

    private String maPhieuGiamGia;
    private String maVoucher;
    private String tenPhieuGiamGia;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private float giam_PhieuGiamGia;
    private boolean trangThai;
//Constructor

    public PhieuGiamGia(String maPhieuGiamGia, String maVoucher, String tenPhieuGiamGia, Date ngayBatDau, Date ngayKetThuc, float giam_PhieuGiamGia, boolean trangThai) {
        this.maPhieuGiamGia = maPhieuGiamGia;
        this.maVoucher = maVoucher;
        this.tenPhieuGiamGia = tenPhieuGiamGia;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.giam_PhieuGiamGia = giam_PhieuGiamGia;
        this.trangThai = trangThai;
    }
    //Getter and Setter 

    public String getMaPhieuGiamGia() {
        return maPhieuGiamGia;
    }

    public void setMaPhieuGiamGia(String maPhieuGiamGia) {
        this.maPhieuGiamGia = maPhieuGiamGia;
    }

    public String getMaVoucher() {
        return maVoucher;
    }

    public void setMaVoucher(String maVoucher) {
        this.maVoucher = maVoucher;
    }

    public String getTenPhieuGiamGia() {
        return tenPhieuGiamGia;
    }

    public void setTenPhieuGiamGia(String tenPhieuGiamGia) {
        this.tenPhieuGiamGia = tenPhieuGiamGia;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public float getGiam_PhieuGiamGia() {
        return giam_PhieuGiamGia;
    }

    public void setGiam_PhieuGiamGia(float giam_PhieuGiamGia) {
        this.giam_PhieuGiamGia = giam_PhieuGiamGia;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    //HashCode and Equals

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.maPhieuGiamGia);
        hash = 41 * hash + Objects.hashCode(this.maVoucher);
        hash = 41 * hash + Objects.hashCode(this.tenPhieuGiamGia);
        hash = 41 * hash + Objects.hashCode(this.ngayBatDau);
        hash = 41 * hash + Objects.hashCode(this.ngayKetThuc);
        hash = 41 * hash + Float.floatToIntBits(this.giam_PhieuGiamGia);
        hash = 41 * hash + (this.trangThai ? 1 : 0);
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
        final PhieuGiamGia other = (PhieuGiamGia) obj;
        if (Float.floatToIntBits(this.giam_PhieuGiamGia) != Float.floatToIntBits(other.giam_PhieuGiamGia)) {
            return false;
        }
        if (this.trangThai != other.trangThai) {
            return false;
        }
        if (!Objects.equals(this.maPhieuGiamGia, other.maPhieuGiamGia)) {
            return false;
        }
        if (!Objects.equals(this.maVoucher, other.maVoucher)) {
            return false;
        }
        if (!Objects.equals(this.tenPhieuGiamGia, other.tenPhieuGiamGia)) {
            return false;
        }
        if (!Objects.equals(this.ngayBatDau, other.ngayBatDau)) {
            return false;
        }
        return Objects.equals(this.ngayKetThuc, other.ngayKetThuc);
    }

}
