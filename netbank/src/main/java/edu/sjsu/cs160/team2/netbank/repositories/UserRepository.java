package edu.sjsu.cs160.team2.netbank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.sjsu.cs160.team2.netbank.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>  {    
}