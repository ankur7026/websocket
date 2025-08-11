package com.example.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage") // listens to /app/sendMessage
    @SendTo("/topic/messages")      // sends to /topic/messages
    public String broadcastMessage(String message) {
        return message;
    }
}
