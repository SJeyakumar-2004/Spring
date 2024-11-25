package com.example.springMongo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springMongo.Repository.UserRepository;
import com.example.springMongo.User.User;

@Service
public class UserService 
{
  @Autowired
  UserRepository userRepository;
  
  public List<User> getAll()
  {
	  return userRepository.findAll();
  }
  
  public User getBy(int id)
  {
	  return userRepository.findById(id).get();
  }
  
  public User Post(User user)
  {
	  return userRepository.save(user);
  }
  
  public User update(int id,User user)
  {
	  User demo=userRepository.findById(id).get();
	  demo.setName(user.getName());
	  demo.setAge(user.getAge());
	  demo.setCity(user.getCity());
	  
	  return userRepository.save(demo);
  }
  
  public void del(int id)
  {
	  userRepository.deleteById(id);
  }
}
