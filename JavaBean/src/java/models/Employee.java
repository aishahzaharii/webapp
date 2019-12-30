
package java.models;

public class Employee {
    public int employeeId;
    public String employeeName;
    public String email;
    public String joinDate;
    public String address;
    public int salary;
    public String mobileNo;
    public int managerId;
    
    public Employee(int employeeId,String employeeName,String email,String joinDate,String address,int salary,String mobileNo,int managerId){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.joinDate = joinDate;
        this.address = address;
        this.salary = salary;
        this.mobileNo = mobileNo;
        this.managerId = managerId;
    }
}
