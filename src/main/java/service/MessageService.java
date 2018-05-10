package service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public void printMessage() {
        System.out.println("Hello World");
    }
}
