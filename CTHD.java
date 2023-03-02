/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoAnJava;

/**
 *
 * @author sosma
 */
public class CTHD {

    //Khai Bao
    private double thanhTien;
    private int soLuongMua;
    //Constructor

    public CTHD(double thanhTien, int soLuongMua) {
        this.thanhTien = thanhTien;
        this.soLuongMua = soLuongMua;
    }
    //Getter and Setter

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }
    //HashCode and Equals

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.thanhTien) ^ (Double.doubleToLongBits(this.thanhTien) >>> 32));
        hash = 53 * hash + this.soLuongMua;
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
        final CTHD other = (CTHD) obj;
        if (Double.doubleToLongBits(this.thanhTien) != Double.doubleToLongBits(other.thanhTien)) {
            return false;
        }
        return this.soLuongMua == other.soLuongMua;
    }

}
