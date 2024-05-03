package adaptor;

import adaptor.image.JpegViewer;
import adaptor.image.PngViewer;

public class MediaPlayerFactory {

    MediaPlayer mediaPlayer=null;

    public MediaPlayer getInstance(String fileType) {
        if (fileType == "mp3") {
            mediaPlayer = new MP3();
        }else if (fileType == "mp4") {
            mediaPlayer = new MP4();
        }else if (fileType == "jpeg") {
            mediaPlayer = new ImageAdaptor(new JpegViewer());
        }else if (fileType == "png") {
            mediaPlayer = new ImageAdaptor(new PngViewer());
        }
        return mediaPlayer;
    }
}