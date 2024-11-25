package com.springSql.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springSql.Entity.User;
import com.springSql.Repository.UserRepository;

@Service 
public class UserService
{
  @Autowired
  UserRepository userRepository;

  public List<User> getAll()
  {
	  return userRepository.findAll();
  }
  
  
  public User getById(int id)
  {
	  return userRepository.findById(id).get();
  }
  
  public User createStd(User user)
  {
	  return userRepository.save(user);
  }
  
  public User update(int id,User user)
  {
	User userdemo=userRepository.findById(id).get();
	userdemo.setName(user.getName());
	userdemo.setCity(user.getCity());
	userdemo.setSalary(user.getSalary());
	return userRepository.save(userdemo);
	
	  
  }



}
  
  
  

