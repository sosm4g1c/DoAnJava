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
public class TaiKhoan {

    //Khai Bao
    private String maTaiKhoan;
    private String tenTaiKhoan;
    private String trangThai;
    private String matKhau;

    //Constructor
    public TaiKhoan(String maTaiKhoan, String tenTaiKhoan, String trangThai, String matKhau) {
        this.maTaiKhoan = maTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.trangThai = trangThai;
        this.matKhau = matKhau;
    }

    //Getter And Setter
    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
//HashCode and Equals

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.maTaiKhoan);
        hash = 17 * hash + Objects.hashCode(this.tenTaiKhoan);
        hash = 17 * hash + Objects.hashCode(this.trangThai);
        hash = 17 * hash + Objects.hashCode(this.matKhau);
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
        final TaiKhoan other = (TaiKhoan) obj;
        if (!Objects.equals(this.maTaiKhoan, other.maTaiKhoan)) {
            return false;
        }
        if (!Objects.equals(this.tenTaiKhoan, other.tenTaiKhoan)) {
            return false;
        }
        if (!Objects.equals(this.trangThai, other.trangThai)) {
            return false;
        }
        return Objects.equals(this.matKhau, other.matKhau);
    }

}
