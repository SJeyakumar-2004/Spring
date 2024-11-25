package com.springSql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springSql.Entity.User;
import com.springSql.Service.UserService;

@RestController
@RequestMapping("/detail")
public class UserController
{
  @Autowired
  UserService userService;
  
  @GetMapping("/getAll")
  public List<User> get()
  {
	  return userService.getAll();
  }
  
  @GetMapping("/get/{id}")
  public User getById(@PathVariable("id") int id)
  {
	  return userService.getById(id);
  }
  
  @PostMapping("/post")
  public void create(@Validated @RequestBody User user)
  {
	  userService.createStd(user);
  }
  
  @PutMapping("/update/{id}")
  public void update(@PathVariable("id") int id,@Validated @RequestBody User user)
  {
	  userService.update(id,user);
  }
}
