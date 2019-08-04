package state.context;

import lombok.Getter;
import lombok.Setter;
import state.IFootballPlayer;
import state.states.FootballPlayerState;
import state.states.RestState;

public class FootballPlayer implements IFootballPlayer {

    @Getter
    @Setter
    private FootballPlayerState state;

    public FootballPlayer() {
        this.state = new RestState(this);
    }

    @Override
    public void drinkWater() {
        state.drinkWater();
    }

    @Override
    public void playInFootball() {
        state.playInFootball();
    }

    @Override
    public void goToFootballField() {
        state.goToFootballField();
    }

    @Override
    public void beSpare() {
        state.beSpare();
    }
}
