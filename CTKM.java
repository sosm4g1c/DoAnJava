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
public class CTKM {

    //Khai Bao
    private String maCTKM;
    private String tenCTKM;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private boolean trangThai;

    //Constructor
    public CTKM(String maCTKM, String tenCTKM, Date ngayBatDau, Date ngayKetThuc, boolean trangThai) {
        this.maCTKM = maCTKM;
        this.tenCTKM = tenCTKM;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.trangThai = trangThai;
    }
    //Getter and Setter 

    public String getMaCTKM() {
        return maCTKM;
    }

    public void setMaCTKM(String maCTKM) {
        this.maCTKM = maCTKM;
    }

    public String getTenCTKM() {
        return tenCTKM;
    }

    public void setTenCTKM(String tenCTKM) {
        this.tenCTKM = tenCTKM;
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

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    //HashCode and Equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.maCTKM);
        hash = 53 * hash + Objects.hashCode(this.tenCTKM);
        hash = 53 * hash + Objects.hashCode(this.ngayBatDau);
        hash = 53 * hash + Objects.hashCode(this.ngayKetThuc);
        hash = 53 * hash + (this.trangThai ? 1 : 0);
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
        final CTKM other = (CTKM) obj;
        if (this.trangThai != other.trangThai) {
            return false;
        }
        if (!Objects.equals(this.maCTKM, other.maCTKM)) {
            return false;
        }
        if (!Objects.equals(this.tenCTKM, other.tenCTKM)) {
            return false;
        }
        if (!Objects.equals(this.ngayBatDau, other.ngayBatDau)) {
            return false;
        }
        return Objects.equals(this.ngayKetThuc, other.ngayKetThuc);
    }

}
