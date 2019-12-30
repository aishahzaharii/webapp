
package java.models;

public class User {
    public int userId;
    public String username;
    public String email;
    public String mobileNo;
    public String address;
    
    public User(int userId,String username,String email,String mobileNo,String address){
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.mobileNo = mobileNo;
        this.address = address;
    }
}
