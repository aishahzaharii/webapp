package restoran;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Employee {
	 private int id;
	 private String name;
	 private String gender;
	 private int icno;
	 private String dateOfBirth;
	 private String address;
	 private String marital;
	 private String religion;
	 private int phoneno;
	 private String department;
	
	public Employee(){
	 id = 0;
	 name = "unknown";
	 gender = "unknown";
	 icno = 0;
	 dateOfBirth = "unknown";
	 marital = "unknown";
	 religion = "unknown";
	 phoneno = 0;
	 department = "unknown";
	 
	}

	
	public void setId(int id){
	    this.id = id;  
	} 

	public int getId(){
	  return id;
	}

	
	public void setName(String name){
	  this.name = name;
	}

	public String getName(){
	 return name;
	}


	public void setGender(String gender){
	   this.gender = gender;
	}

	public String getGender(){
	 return gender;
	}
	
	
	public void setIcNo(int icno){
		 this.icno = icno;
	}

	public int getIcNo(){
		 return icno;
	}
	
	
	public void setDateOfBirth(String dateOfBirth ) {
		this.dateOfBirth =dateOfBirth;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setAddress(String address) {
		this.address =address;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	public void setMaritalStatus(String marital) {
		this.marital =marital;
	}
	
	public String getMarital() {
		return marital;
	}
	
	public void setReligion(String religion) {
		this.religion =religion;
	}
	
	public String getReligion() {
		return religion;
	}
	
	public void setPhoneno(int phoneno){
	    this.phoneno = phoneno;
	  
	} 

	public int getPhoneno(){
	  return phoneno;
	}

	
	public void setDepartment(String department) {
		this.department =department;	
	}
	
	public String getDepartment() {
		return this.department;
	}
	

	
	public boolean storeData(){
		 try
	        {
	           String sql = "";
	           Class.forName("com.mysql.jdbc.Driver");
	           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant?useTimezone=true&serverTimezone=UTC","root","AmiraH16031995");
	           sql="INSERT INTO Employee (id,name,gender,icno,dateOfBirth,address,marital,religion,phoneno,department) VALUES (?,?,?,?,?,?,?,?,?)";
	           PreparedStatement statement = con.prepareStatement(sql);                
	           statement.setInt(1, getId());
	           statement.setString(2, getName());
	           statement.setString(3, getGender());
	           statement.setInt(4, getIcNo());
	           statement.setString(5, getDateOfBirth());
	           statement.setString(6, getAddress());
	           statement.setString(7, getMarital());
	           statement.setString(8, getReligion());
	           statement.setInt(9, getPhoneno());
	           statement.setString(10, getDepartment());
	          
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
	
	public boolean deleteData(int id){
		 try
	        {
	           String sql = "";
	           Class.forName("com.mysql.jdbc.Driver");
	           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant?useTimezone=true&serverTimezone=UTC","root","AmiraH16031995");
	           sql="DELETE FROM Employee WHERE id = ?";
	           PreparedStatement statement = con.prepareStatement(sql);                
	           statement.setInt(1, id);
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
	           sql="UPDATE Employee SET id = ?, name = ?, gender = ?, icno = ?, dateOfBirth = ?, address = ?, marital = ?, religion = ?, phoneno = ?, department = ? WHERE id = ?";
	           PreparedStatement statement = con.prepareStatement(sql);                
	           statement.setInt(1, getId());
	           statement.setString(2, getName());
	           statement.setString(3, getGender());
	           statement.setInt(4, getIcNo());
	           statement.setString(5, getDateOfBirth());
	           statement.setString(6, getAddress());
	           statement.setString(7, getMarital());
	           statement.setString(8, getReligion());
	           statement.setInt(9, getPhoneno());
	           statement.setString(10, getDepartment());
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


