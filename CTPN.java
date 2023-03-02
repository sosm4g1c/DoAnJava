/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoAnJava;

/**
 *
 * @author sosma
 */
public class CTPN {
//Khai Bao
    private int soLuong;
    private double thanhTien;
//Constructor

    public CTPN(int soLuong, double thanhTien) {
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }
   //Getter and Setter

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    //HashCode and Equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.soLuong;
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.thanhTien) ^ (Double.doubleToLongBits(this.thanhTien) >>> 32));
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
        final CTPN other = (CTPN) obj;
        if (this.soLuong != other.soLuong) {
            return false;
        }
        return Double.doubleToLongBits(this.thanhTien) == Double.doubleToLongBits(other.thanhTien);
    }
    
}
