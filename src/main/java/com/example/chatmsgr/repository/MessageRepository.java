package com.example.chatmsgr.repository;

import com.example.chatmsgr.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message,Integer> {

}
