package state.states;

import state.context.FootballPlayer;

public class PlayState extends FootballPlayerState {

    public PlayState(FootballPlayer footballPlayer) {
        super(footballPlayer);
    }

    @Override
    public void drinkWater() {
        System.out.println("I cant drink water now, my state is play!");
    }

    @Override
    public void playInFootball() {
        System.out.println("I play in football");
    }

    public void goToFootballField() {

    }

    public void beSpare() {
        footballPlayer.setState(new RestState(footballPlayer));
    }
}
