package decorator;

public class ColorDecorator extends ShapeDecorator {
    private final String color;

    public ColorDecorator(Shape shape, String color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw(){
        super.draw();
        System.out.println("Adding a "+color+" color to the shape.");
    }
}
