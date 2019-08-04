package mediator;

import mediator.chat.SimpleChat;
import mediator.user.Admin;
import mediator.user.IUser;
import mediator.user.SimpleUser;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        SimpleChat chat = new SimpleChat();
        chat.setAdmin(admin);
        admin.setChat(chat);

        IUser user1 = new SimpleUser(chat, "user1");
        IUser user2 = new SimpleUser(chat, "user2");
        IUser user3 = new SimpleUser(chat, "user3");

        chat.addUserToChat(user1);
        chat.addUserToChat(user2);
        chat.addUserToChat(user3);

        user1.sendMessage("user 1 message");
        System.out.println("\n");

        user2.sendMessage("user 2 message");
        System.out.println("\n");

        user3.sendMessage(("user 3 message"));
        System.out.println("\n");

        admin.sendMessage("admin message");
    }
}
