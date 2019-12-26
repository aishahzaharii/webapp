package restoran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Food {
	
	 private int code;
	 private String food;
	 private double price;
	 
	 public Food() {
		 
		 code = 0;
		 food = "unknown";
		 price = 0;
	 }
	 
	public void setCode(int code){
		    this.code = code;  
		} 

	public int getCode(){
		  return code;
		}
	 
	public void setFood(String food){
		    this.food = food;  
		} 

	public String getFoodName(){
		  return food;
		}
	
	public void setPrice(double price){
	    this.price = price;  
	} 

	public double getPrice(){
	  return price;
	}
	
	public boolean deleteData(int id){
		 try
	        {
	           String sql = "";
	           Class.forName("com.mysql.jdbc.Driver");
	           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant?useTimezone=true&serverTimezone=UTC","root","AmiraH16031995");
	           sql="DELETE FROM Food WHERE code = ?";
	           PreparedStatement statement = con.prepareStatement(sql);                
	           statement.setInt(1, code);
	           statement.executeUpdate();
	           statement.close();
	           con.close();
	           return true;    
	        }
	        catch(Exception ex)
	        {
	        	return false;
	        }   
	}
	
	public boolean updateData(int id){
		 try
	        {
	           String sql = "";
	           Class.forName("com.mysql.jdbc.Driver");
	           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant?useTimezone=true&serverTimezone=UTC","root","AmiraH16031995");
	           sql="UPDATE Food SET code = ?, food = ?, price = ? WHERE code = ?";
	           PreparedStatement statement = con.prepareStatement(sql);                
	           statement.setInt(1, getCode());
	           statement.setString(2, getFoodName());
	           statement.setDouble(3, getPrice());
	           statement.executeUpdate();
	           statement.close();
	           con.close();
	           return true;    
	        }
	        catch(Exception ex)
	        {
	        	return false;
	        }   
		
	}

}
