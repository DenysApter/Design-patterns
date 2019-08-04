package state;

import state.context.FootballPlayer;

public class Main {
    public static void main(String[] args) {

        FootballPlayer player = new FootballPlayer();
        player.playInFootball();
        player.drinkWater();

        System.out.println("\n");

        player.goToFootballField();
        player.playInFootball();
        player.drinkWater();

        System.out.println("\n");

        player.beSpare();
        player.playInFootball();
        player.drinkWater();
    }
}
