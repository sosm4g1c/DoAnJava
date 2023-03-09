import java.io.Serializable;
public class Address implements Serializable {
    private String city;
    private String district;
    private String street;

    public Address(){
        this.city = "?";
        this.district="?";
        this.street="?";
    }
    public Address(String city,String district,String street){

        this.city = city;
        this.district = district;
        this.street = street;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    public void nhap(){
        this.city =  Sys.checkAddress("Tỉnh/Thành phố : ");
        this.district = Sys.checkAddress("Quận/Huyện : ");
        this.street = Sys.checkAddress("Đường : ");
    }
    public String thongtin(){
         return this.city+","+this.district+","+this.street;
    }
}

