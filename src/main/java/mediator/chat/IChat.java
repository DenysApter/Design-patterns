package mediator.chat;

import mediator.user.IUser;

public interface IChat {
   void sendMessage(String message, IUser user);
}
