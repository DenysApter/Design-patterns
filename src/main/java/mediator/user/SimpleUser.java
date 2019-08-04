package mediator.user;


import lombok.Getter;
import mediator.chat.IChat;


public class SimpleUser implements IUser {

    @Getter
    String name;
    IChat chat;


    public SimpleUser(IChat chat, String name) {
        this.chat = chat;
        this.name = name;
    }




    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(name + ", Received message from: " + message);
    }
}
