package org.metin.test.persontest;
/** Represents people that work at a company. */

public class Employee extends Person4 implements Insan{
  private int employeeId;
  private String companyName;
  
  public Employee(String firstName, String lastName,int employeeId, String companyName) {
    super(firstName, lastName);
    this.employeeId = employeeId;
    this.companyName = companyName;
  }
  
  /** The ID of the employee, with the assumption that
   *  lower numbers are people that started working at
   *  the company earlier than those with higher ids.
   */
  public int getEmployeeId() {
    return (employeeId);
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  /** The name of the company that the person 
   *  works for. 
   */
  public String getCompanyName() {
    return (companyName);
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

    @Override
    public String kossun() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String aglasin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer yurusun() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
