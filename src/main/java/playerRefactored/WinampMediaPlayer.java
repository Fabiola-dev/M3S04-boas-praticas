package playerRefactored;

public class WinampMediaPlayer implements AudioMediaPlayer{
    //winamp only supports audio.
    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }
}
