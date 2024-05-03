package decorator;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape circleWithBorder = new BorderDecorator(circle);
        Shape circleWithBorderAndColor = new ColorDecorator(circleWithBorder,"red");
        circleWithBorderAndColor.draw();
    }
}
