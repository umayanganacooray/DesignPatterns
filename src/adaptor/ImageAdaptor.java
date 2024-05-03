package adaptor;

import adaptor.image.ImageViewer;

public class ImageAdaptor implements MediaPlayer {

    private ImageViewer imageViewer;

    public ImageAdaptor(ImageViewer imageViewer) {
        this.imageViewer = imageViewer;
    }

    @Override
    public void play(String file) {
        imageViewer.show(file);
    }
}
