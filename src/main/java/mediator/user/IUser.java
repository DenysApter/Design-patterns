package mediator.user;

public interface IUser {
    void sendMessage(String message);
    void getMessage(String message);
    String getName();
}
