package player;

public class WinampMediaPlayer implements MediaPlayer {

    //Play video is not supported in winamp plauer
    @Override
    public void playAudio() {
        throw new ExceptionInInitializerError();
    }
    @Override
    public void playVideo() {
        System.out.println("Playing audio...");
    }
}
