package TH;

public class test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(5,6,"red",true);
        shapes[1] = new Circle(10,"yellow",true);
        shapes[2] = new Square(3,"green",true);
        for (Shape shape:shapes
             ) {
            double percent = Math.random()*100;

            System.out.println(shape);
            shape.resize(percent);
            System.out.println(percent);
            System.out.println(shape);
            if(shape instanceof Circle){
                Colorable colorable = (Circle) shape;
                colorable.howToColor();
            }


        }
    }
}
