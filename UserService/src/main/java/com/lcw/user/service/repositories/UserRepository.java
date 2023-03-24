package com.lcw.user.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcw.user.service.entities.User;

public interface UserRepository extends JpaRepository<User,String> {

}
