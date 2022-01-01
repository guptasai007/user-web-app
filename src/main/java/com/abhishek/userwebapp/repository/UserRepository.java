package com.abhishek.userwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishek.userwebapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
