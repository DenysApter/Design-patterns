package decorator;

public class EmailSender implements ISender {
    @Override
    public void send() {
        System.out.println("send by email");
    }
}
