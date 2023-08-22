package com.webdev.hotelRes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdev.hotelRes.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User , Long>{
    //Custom queries
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);

}