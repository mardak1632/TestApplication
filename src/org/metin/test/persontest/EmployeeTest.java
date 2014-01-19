package org.metin.test.persontest;
public class EmployeeTest {
  public static void main(String[] args) {
      
    JuniorCalisan calisan=new JuniorCalisan("Steve", "Balmer", 2, "Microsoft");
    calisan.setLastName("falan");
    
    Employee emp = new Employee("Steve", "Balmer", 2, "Microsoft");
    System.out.println("Employee's full name: " + emp.getFullName());
    System.out.println("Employee's ID: " + emp.getEmployeeId());
    System.out.println("Employee's company: " + emp.getCompanyName());
  }
}
