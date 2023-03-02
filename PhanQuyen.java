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
public class PhanQuyen {

    //Khai Bao
    private String maQuyen;
    private String quyen;

    //Constructor
    public PhanQuyen(String maQuyen, String quyen) {
        this.maQuyen = maQuyen;
        this.quyen = quyen;
    }

    //Getter And Setter
    public String getMaQuyen() {
        return maQuyen;
    }

    public void setMaQuyen(String maQuyen) {
        this.maQuyen = maQuyen;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }

    //HashCode and Equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.maQuyen);
        hash = 19 * hash + Objects.hashCode(this.quyen);
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
        final PhanQuyen other = (PhanQuyen) obj;
        if (!Objects.equals(this.maQuyen, other.maQuyen)) {
            return false;
        }
        return Objects.equals(this.quyen, other.quyen);
    }

}
