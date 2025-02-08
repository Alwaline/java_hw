

public class Main {
    public static void main(String[] args) {
        

        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(2, 3);
        Circle circle = new Circle(3);
        Ellipse ellipse = new Ellipse(3, 4);

        Figure[] figures = {square, rectangle, circle, ellipse};

        for (Figure figure : figures) {
            System.out.println(figure.perimeter());
            System.out.println(figure.square());
        }
    }
}
