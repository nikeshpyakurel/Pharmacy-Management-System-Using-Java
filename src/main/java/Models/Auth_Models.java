
package Models;


public class Auth_Models {
    Auth_Models(String UserName,String Contact_number, String Email,String Password,String Role,String Address,String dob){
        this.Role=Role;
        this.Address=Address;
        this.Contact_number=Contact_number;
        this.dob=dob;
        this.UserName=UserName;
        this.Email=Email;
        this.Password=Password;   
    }

    public String getUserName() {
        return UserName;
    }

    public String getContact_number() {
        return Contact_number;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getRole() {
        return Role;
    }

    public String getAddress() {
        return Address;
    }

    public String getDob() {
        return dob;
    }
    private String UserName;
    private String Contact_number;
    private String Email;
    private String Password;
    private String Role;
    private String Address;
    private String dob;
    
    
}
