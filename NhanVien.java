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
public class NhanVien {
    //Khai Bao

    private String maNhanVien;
    private String tenNhanVien;
    private String soDienThoai;
    private Date ngaySinhNV;
    private String mailNV;
//Constructor

    public NhanVien(String maNhanVien, String tenNhanVien, String soDienThoai, Date ngaySinhNV, String mailNV) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.soDienThoai = soDienThoai;
        this.ngaySinhNV = ngaySinhNV;
        this.mailNV = mailNV;
    }
    //Getter And Setter

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public Date getNgaySinhNV() {
        return ngaySinhNV;
    }

    public void setNgaySinhNV(Date ngaySinhNV) {
        this.ngaySinhNV = ngaySinhNV;
    }

    public String getMailNV() {
        return mailNV;
    }

    public void setMailNV(String mailNV) {
        this.mailNV = mailNV;
    }
//HashCode and Equals

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.maNhanVien);
        hash = 17 * hash + Objects.hashCode(this.tenNhanVien);
        hash = 17 * hash + Objects.hashCode(this.soDienThoai);
        hash = 17 * hash + Objects.hashCode(this.ngaySinhNV);
        hash = 17 * hash + Objects.hashCode(this.mailNV);
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
        final NhanVien other = (NhanVien) obj;
        if (!Objects.equals(this.maNhanVien, other.maNhanVien)) {
            return false;
        }
        if (!Objects.equals(this.tenNhanVien, other.tenNhanVien)) {
            return false;
        }
        if (!Objects.equals(this.soDienThoai, other.soDienThoai)) {
            return false;
        }
        if (!Objects.equals(this.mailNV, other.mailNV)) {
            return false;
        }
        return Objects.equals(this.ngaySinhNV, other.ngaySinhNV);
    }

}
