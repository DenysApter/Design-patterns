package mediator.user;

import lombok.Getter;
import lombok.Setter;
import mediator.chat.IChat;

public class Admin implements IUser {
    @Getter
    private String name = "admin";
    @Setter
    private IChat chat;

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin, received message from: " + message);
    }
}
