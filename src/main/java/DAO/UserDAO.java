
package DAO;

import database.DatabaseConnection;


public class UserDAO extends DatabaseConnection {
   public void AddUser(String name,String username,String contact,String email,String password,String address,String dob){
        
        String query="INSERT INTO user(Name,Email,Address,DOB,Mobile_num,Username,Password) VALUES ('"+name+"','"+email+"','"+address+"','"+dob+"','"+contact+"','"+username+"','"+password+"')";
        manipulate(query);  
    }
   public void UpdateUser(String name,String username,String contact,String email,String password,String address,String dob){
        
        String query="UPDATE INTO user SET Name='"+name+"',Email='"+email+"',Address='"+address+"',DOB='"+dob+"',Mobile_num='"+contact+"',Username='"+username+"',Password='"+password+"'";
        manipulate(query);  
    }
    
}
