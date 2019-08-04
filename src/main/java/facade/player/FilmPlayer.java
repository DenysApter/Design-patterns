package facade.player;


public class FilmPlayer {

    public void playFilm() {
        new AudioPlayer().playSound();
        new VideoPlayer().playVideo();
        System.out.println("film shown");
    }
}
