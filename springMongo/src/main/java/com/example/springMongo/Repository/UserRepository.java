package com.example.springMongo.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springMongo.User.User;

public interface UserRepository extends MongoRepository<User , Integer>
{

}
