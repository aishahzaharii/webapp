package restoran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Drink {
	private int code;
	 private String drink;
	 private double price;
	 
	 public Drink() {
		 
		 code = 0;
		 drink = "unknown";
		 price = 0;
	 }
	 
	public void setCode(int code){
		    this.code = code;  
		} 

	public int getCode(){
		  return code;
		}
	 
	public void setDrink(String drink){
		    this.drink = drink;  
		} 

	public String getDrinkName(){
		  return drink;
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
	           sql="DELETE FROM Drink WHERE code = ?";
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
	           sql="UPDATE Drink SET code = ?, drink = ?, price = ? WHERE code = ?";
	           PreparedStatement statement = con.prepareStatement(sql);                
	           statement.setInt(1, getCode());
	           statement.setString(2, getDrinkName());
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



