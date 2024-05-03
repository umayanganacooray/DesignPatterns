package adaptor;

public class Main {
    public static void main(String[] args) {

        String fileType="jpeg";
        String fileName="abc";

        MediaPlayer mediaPlayer = new MediaPlayerFactory().getInstance(fileType);

        if(mediaPlayer!=null)
            mediaPlayer.play(fileName);
        else
            System.out.println("Media Player not found");
    }
}