package dev.doakes.entities;

public class Employee {
  private   int Eid;
  private String lastName, FirstName;
  public String occupation;
  private int exspenseAmount;
  private int wage;

  public int getWage() {
    return wage;
  }

  public void setWage(int wage) {
    this.wage = wage;
  }

  public int getExspenseAmount() {
    return exspenseAmount;
  }

  public void setExspenseAmount(int exspenseAmount) {
    this.exspenseAmount = exspenseAmount;
  }

  public String getFirstName() {
    return FirstName;
  }

  public void setFirstName(String firstName) {
    FirstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getEid() {
    return Eid;
  }

  public Employee(int eid) {
    Eid = eid;
  }
}