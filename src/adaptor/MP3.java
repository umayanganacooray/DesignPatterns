package adaptor;

public class MP3 implements MediaPlayer {
    @Override
    public void play(String file) {
        System.out.println("Playing "+file+".mp3");
    }
}
