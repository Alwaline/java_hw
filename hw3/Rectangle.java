public class Rectangle extends Square{
    private int length;

    public Rectangle (int width, int length) {
        super(width);
        this.length = length;
    }

    public double square () {
        return width * length;
    }

    public double perimeter () {
        return (width + length) * 2;
    }

}
