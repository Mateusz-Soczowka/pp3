public class Rectangle extends Shape{
    private double a;
    private double b;
    
    public Rectangle(double a,double b){
        this.a = a;
        this.b = b;
    }
    public double perimeter(){
        return 2*a+2*b;
    }
    
    public double area(){
        return a*b;
    }
}