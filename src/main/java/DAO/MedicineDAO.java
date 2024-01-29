
package DAO;

import database.DatabaseConnection;


public class MedicineDAO extends DatabaseConnection {
    public void AddMedicine(String name,int quantity,int price,String company,String Expire){
        
        String query="INSERT INTO medicine(Name,Quantity,price,company,Expire) VALUES ('"+name+"','"+quantity+"','"+price+"','"+company+"','"+Expire+"')";
        manipulate(query);  
    }
    public void UpdateMedicine(String name,int quantity,int price,String company,String Expire){
        
        String query="UPDATE medicine SET Quantity='"+quantity+"',price='"+price+"',company='"+company+"',Expire='"+Expire+"'WHERE Name='"+name+"'";
        manipulate(query);  
    }
    
}
