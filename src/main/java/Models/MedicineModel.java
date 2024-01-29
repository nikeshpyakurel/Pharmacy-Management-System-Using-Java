
package Models;


public class MedicineModel {

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getExpire() {
        return Expire;
    }

    public void setExpire(String Expire) {
        this.Expire = Expire;
    }
   private String Name;
private int Quantity;  
private int price;  
private String company; 
private String Expire;
    
}
