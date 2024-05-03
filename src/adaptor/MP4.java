package adaptor;

public class MP4 implements MediaPlayer {
    @Override
    public void play(String file) {
        System.out.println("Playing "+file+".mp4");
    }
}
