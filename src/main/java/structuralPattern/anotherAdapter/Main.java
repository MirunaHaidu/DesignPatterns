package structuralPattern.anotherAdapter;

public class Main {
    public static void main(String[] args) {
        MP4Video mp4Video = new MP4Video();
//        AdapterPlayer mp3Player = new AdapterPlayer(new MP4Video());   -- NU asa
        MP3Player mp3Player = new AdapterPlayer(mp4Video);
        mp3Player.playSong();


    }
}
