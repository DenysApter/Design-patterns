package adapter.sportsmans;

public class BoxerWrapper implements ISportsMan {

    Boxer boxer;

    public BoxerWrapper(Boxer boxer) {
        this.boxer = boxer;
    }
    @Override
    public void doSport() {
        boxer.rightHook();
    }
}
