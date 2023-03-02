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
public class LoaiSP {
    //Khai Bao
    private String tenLoaiSP;
    private String maLoaiSP;
    //Constructor

    public LoaiSP(String tenLoaiSP, String maLoaiSP) {
        this.tenLoaiSP = tenLoaiSP;
        this.maLoaiSP = maLoaiSP;
    }
    //Getter and Setter

    public String getTenLoaiSP() {
        return tenLoaiSP;
    }

    public void setTenLoaiSP(String tenLoaiSP) {
        this.tenLoaiSP = tenLoaiSP;
    }

    public String getMaLoaiSP() {
        return maLoaiSP;
    }

    public void setMaLoaiSP(String maLoaiSP) {
        this.maLoaiSP = maLoaiSP;
    }
    //HashCode and Equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.tenLoaiSP);
        hash = 61 * hash + Objects.hashCode(this.maLoaiSP);
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
        final LoaiSP other = (LoaiSP) obj;
        if (!Objects.equals(this.tenLoaiSP, other.tenLoaiSP)) {
            return false;
        }
        return Objects.equals(this.maLoaiSP, other.maLoaiSP);
    }
    
}
