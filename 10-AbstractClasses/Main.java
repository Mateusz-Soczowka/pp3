public class Main{
    
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(2,5);
        Triangle triangle = new Triangle(1,2,3,5);
        Circle circle = new Circle(4);
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
        System.out.println(circle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(triangle.perimeter());
        System.out.println(circle.perimeter());
    }
}
