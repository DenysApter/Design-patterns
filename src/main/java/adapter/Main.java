package adapter;

import adapter.sportsmans.Boxer;
import adapter.sportsmans.BoxerWrapper;

public class Main {



    public static void main(String[] args) {
        Boxer boxer = new Boxer();
        BoxerWrapper boxerWrapper = new BoxerWrapper(boxer);


        Gym gym = new Gym();
        gym.train(boxerWrapper);
    }
}
