package com.example.chatmsgr.repository;

import com.example.chatmsgr.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
