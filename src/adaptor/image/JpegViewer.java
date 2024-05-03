package adaptor.image;

public class JpegViewer implements ImageViewer {
    @Override
    public void show(String file) {
        System.out.println("Showing "+file+".jpeg");
    }
}