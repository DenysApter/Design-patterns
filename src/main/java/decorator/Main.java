package decorator;

public class Main {
    public static void main(String[] args) {
        SenderDecorator senderDecorator = new SenderDecorator(
                new SmsSenderDecorator(
                        new EmailSender()));
        senderDecorator.send();
    }
}
