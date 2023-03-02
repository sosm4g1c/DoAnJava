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
public class ThanhVien {
    //Khai Bao

    private String maThanhVien;
    private String soDienThoai;
    private String tenThanhVien;
    private String matKhau;
    private Date ngaySinhTV;
    private String mailTV;
//Constructor

    public ThanhVien(String maThanhVien, String soDienThoai, String tenThanhVien, String matKhau, Date ngaySinhTV, String mailTV) {
        this.maThanhVien = maThanhVien;
        this.soDienThoai = soDienThoai;
        this.tenThanhVien = tenThanhVien;
        this.matKhau = matKhau;
        this.ngaySinhTV = ngaySinhTV;
        this.mailTV = mailTV;
    }
//HashCode and Equals

    public String getMaThanhVien() {
        return maThanhVien;
    }

    public void setMaThanhVien(String maThanhVien) {
        this.maThanhVien = maThanhVien;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getTenThanhVien() {
        return tenThanhVien;
    }

    public void setTenThanhVien(String tenThanhVien) {
        this.tenThanhVien = tenThanhVien;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Date getNgaySinhTV() {
        return ngaySinhTV;
    }

    public void setNgaySinhTV(Date ngaySinhTV) {
        this.ngaySinhTV = ngaySinhTV;
    }

    public String getMailTV() {
        return mailTV;
    }

    public void setMailTV(String mailTV) {
        this.mailTV = mailTV;
    }
//HashCode and Equals

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.maThanhVien);
        hash = 71 * hash + Objects.hashCode(this.soDienThoai);
        hash = 71 * hash + Objects.hashCode(this.tenThanhVien);
        hash = 71 * hash + Objects.hashCode(this.matKhau);
        hash = 71 * hash + Objects.hashCode(this.ngaySinhTV);
        hash = 71 * hash + Objects.hashCode(this.mailTV);
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
        final ThanhVien other = (ThanhVien) obj;
        if (!Objects.equals(this.maThanhVien, other.maThanhVien)) {
            return false;
        }
        if (!Objects.equals(this.soDienThoai, other.soDienThoai)) {
            return false;
        }
        if (!Objects.equals(this.tenThanhVien, other.tenThanhVien)) {
            return false;
        }
        if (!Objects.equals(this.matKhau, other.matKhau)) {
            return false;
        }
        if (!Objects.equals(this.mailTV, other.mailTV)) {
            return false;
        }
        return Objects.equals(this.ngaySinhTV, other.ngaySinhTV);
    }

}
