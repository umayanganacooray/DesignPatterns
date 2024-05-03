package adaptor.image;

public class PngViewer implements ImageViewer {
    @Override
    public void show(String file) {
        System.out.println("Showing "+file+".png");
    }
}