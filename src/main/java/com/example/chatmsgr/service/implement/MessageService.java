package com.example.chatmsgr.service;

import com.example.chatmsgr.model.Message;
import com.example.chatmsgr.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message createMsg(Message message) {
        return messageRepository.save(message);
    }

}
