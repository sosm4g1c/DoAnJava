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
public class NhaCungCap {
    //Khai Bao
    private String ma_NhaCungCap;
    private String diaChi;
    private Sring ten_NhaCungCap;
    //Constructor

    public NhaCungCap(String ma_NhaCungCap, String diaChi, Sring ten_NhaCungCap) {
        this.ma_NhaCungCap = ma_NhaCungCap;
        this.diaChi = diaChi;
        this.ten_NhaCungCap = ten_NhaCungCap;
    }
    //Getter and Setter

    public String getMa_NhaCungCap() {
        return ma_NhaCungCap;
    }

    public void setMa_NhaCungCap(String ma_NhaCungCap) {
        this.ma_NhaCungCap = ma_NhaCungCap;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Sring getTen_NhaCungCap() {
        return ten_NhaCungCap;
    }

    public void setTen_NhaCungCap(Sring ten_NhaCungCap) {
        this.ten_NhaCungCap = ten_NhaCungCap;
    }
    //HashCode and Equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.ma_NhaCungCap);
        hash = 67 * hash + Objects.hashCode(this.diaChi);
        hash = 67 * hash + Objects.hashCode(this.ten_NhaCungCap);
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
        final NhaCungCap other = (NhaCungCap) obj;
        if (!Objects.equals(this.ma_NhaCungCap, other.ma_NhaCungCap)) {
            return false;
        }
        if (!Objects.equals(this.diaChi, other.diaChi)) {
            return false;
        }
        return Objects.equals(this.ten_NhaCungCap, other.ten_NhaCungCap);
    }
    
}
