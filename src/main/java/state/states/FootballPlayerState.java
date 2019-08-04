package state.states;

import state.IFootballPlayer;
import state.context.FootballPlayer;

public abstract class FootballPlayerState implements IFootballPlayer {

    protected FootballPlayer footballPlayer;

    public FootballPlayerState(FootballPlayer footballPlayer) {
        this.footballPlayer = footballPlayer;
    }
}
