public class Square extends Figure{
    protected int width;
    
    public Square(int width) {
        this.width = width;
    }

    public double square () {
        return width * width;
    }

    public double perimeter () {
        return width * 4;
    }
}
