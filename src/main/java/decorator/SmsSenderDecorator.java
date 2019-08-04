package decorator;

public class SmsSenderDecorator extends SenderDecorator {

    public SmsSenderDecorator(ISender sender) {
        super(sender);
    }

    @Override
    public void  send() {
        System.out.println("send by sms");
        super.send();
    }
}
