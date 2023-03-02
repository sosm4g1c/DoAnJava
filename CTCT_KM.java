/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoAnJava;

/**
 *
 * @author sosma
 */
public class CTCT_KM {
//Khai Bao

    private double tienGiam;
//Constructor

    public CTCT_KM(double tienGiam) {
        this.tienGiam = tienGiam;
    }
//Getter and Setter

    public double getTienGiam() {
        return tienGiam;
    }

    public void setTienGiam(double tienGiam) {
        this.tienGiam = tienGiam;
    }
    //HashCode and Equals

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.tienGiam) ^ (Double.doubleToLongBits(this.tienGiam) >>> 32));
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
        final CTCT_KM other = (CTCT_KM) obj;
        return Double.doubleToLongBits(this.tienGiam) == Double.doubleToLongBits(other.tienGiam);
    }

}
