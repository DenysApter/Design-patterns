package mediator.chat;

import lombok.Setter;
import mediator.user.IUser;

import java.util.ArrayList;
import java.util.List;

public class SimpleChat implements IChat {

    List<IUser> users;
    @Setter
    IUser admin;

    public SimpleChat() {
        this.users = new ArrayList<>();
    }

    public void addUserToChat(IUser user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, IUser user) {
        users.stream().filter(u -> !u.getName().equals(user.getName())).forEach(u -> u.getMessage(message));
        admin.getMessage(message);
    }
}
