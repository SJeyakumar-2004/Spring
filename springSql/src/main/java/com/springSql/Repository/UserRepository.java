package com.springSql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springSql.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{

}
