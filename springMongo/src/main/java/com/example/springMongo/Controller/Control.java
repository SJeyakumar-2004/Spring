package com.example.springMongo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springMongo.Service.UserService;
import com.example.springMongo.User.User;

@RestController
@RequestMapping("/detail")
public class Control 
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
	return userService.getBy(id);
}

@PostMapping("/post")
public void create(@Validated @RequestBody User user)
{
	userService.Post(user);
}

@PutMapping("/update/{id}")
public void update(@PathVariable("id") int id,User user)
{
	userService.update(id, user);
}

@DeleteMapping("/del/{id}")
public void delete(int id)
{
	this.userService.del(id);
}
}
