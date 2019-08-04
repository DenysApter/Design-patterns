package state.states;

import state.context.FootballPlayer;

public class RestState extends FootballPlayerState {

    public RestState(FootballPlayer footballPlayer) {
        super(footballPlayer);
    }


    @Override
    public void drinkWater() {
        System.out.println("I drink water");
    }

    @Override
    public void playInFootball() {
        System.out.println("I cant play now, my state is rest!");
    }


    public void goToFootballField() {
        footballPlayer.setState(new PlayState(footballPlayer));
    }


    public void beSpare() {
    }
}
