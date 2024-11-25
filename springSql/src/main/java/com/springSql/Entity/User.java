package com.springSql.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="std")
public class User
{
  public User()
  {
	  
  }
  @Id
  private int id;
  private String name;
  private String city;
  private int salary;
  
  
 public int getId()
{
	return id;
}
  
public void setId(int id)
{
	this.id = id;
}
public String getName()
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public String getCity() 
{
	return city;
}
public void setCity(String city)
{
	this.city = city;
}
public int getSalary() 
{
	return salary;
}
public void setSalary(int salary) 
{
	this.salary = salary;
}

}
