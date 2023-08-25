package playerRefactored;

public class VlcMediaPlayer implements AudioMediaPlayer, VideoMediaPlayer{
    @Override
    public void playAudio() {
        System.out.println("Playing video...");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing audio...");
    }
}
