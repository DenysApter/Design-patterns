package decorator;

public class SenderDecorator implements ISender {

    private ISender wrapeeSender;

    public SenderDecorator(ISender sender) {
        this.wrapeeSender = sender;
    }

    @Override
    public void send() {
        wrapeeSender.send();
    }
}
