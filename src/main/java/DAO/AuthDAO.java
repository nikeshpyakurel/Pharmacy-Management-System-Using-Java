
package DAO;

import View.Dashboard;
import View.DashboardAdmin;
import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AuthDAO extends DatabaseConnection {
    public void SignupMethod(String username,String contact,String email,String password,String role,String address,String dob){
        
        String query="INSERT INTO Logindetails(role,contactnum,email,address,dob,username,password) VALUES ('"+role+"','"+contact+"','"+email+"','"+address+"','"+dob+"','"+username+"','"+password+"')";
        manipulate(query);  
    }
   
        
    public void loginMethod(String email, String password) {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    try {
        // Establish database connection (Replace "your_database_url", "your_username", and "your_password" with actual values)
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacymanagement", "root", "");

        // Query for Admin
        String adminQuery = "SELECT * FROM Logindetails WHERE email=? AND password=? AND role='Admin'";
        preparedStatement = connection.prepareStatement(adminQuery);
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, password);
        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
//            int adminId = resultSet.getInt("ID");
//            AllId.userId=adminId;
            DashboardAdmin dash = new DashboardAdmin();
            dash.setVisible(true);
            dash.pack();
            dash.setLocationRelativeTo(null);
//            System.out.println("Admin ID: " + AllId.userId);
        } else {
            // Query for User
            String userQuery = "SELECT * FROM Logindetails WHERE Email=? AND password=? AND role='Pharmacist'";
            preparedStatement = connection.prepareStatement(userQuery);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
//                int userId = resultSet.getInt("ID");
//                AllId.userId=userId;
                Dashboard dash1 = new Dashboard();
                dash1.setVisible(true);
                dash1.pack();
                dash1.setLocationRelativeTo(null);
//                System.out.println("User ID: " + AllId.userId);
                
            } else {
                System.out.println("Invalid credentials");
            }
        }

    } catch (SQLException ex) {
        Logger.getLogger(AuthDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        // Close resources in the reverse order of their creation to avoid resource leaks
        try {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AuthDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
    public void Updateprofile(String name,String email,String password,String address,String dob){
        
        String query="UPDATE INTO  Logindetails SET username='"+name+"',Address='"+address+"',DOB='"+dob+"',Password='"+password+"' WHERE Email='"+email+"'";
        manipulate(query);  
    }

}
