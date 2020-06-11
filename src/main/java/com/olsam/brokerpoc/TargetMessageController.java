package com.olsam.brokerpoc;

import com.olsam.brokerpoc.domain.Greeting;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class TargetMessageController {

    private final SimpMessageSendingOperations messageSendingOperations;

    public TargetMessageController(SimpMessageSendingOperations messageSendingOperations) {
        this.messageSendingOperations = messageSendingOperations;
    }

    @GetMapping("/messages/target/{username}")
    public void sendTargetGreeting(Principal principal, @PathVariable String username) {
        messageSendingOperations.convertAndSendToUser(username, "/topic/greetings", new Greeting("Hello, I'm " + principal.getName()));
    }
}
