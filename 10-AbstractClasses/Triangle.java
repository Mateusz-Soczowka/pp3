public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    private double h;
    
    public Triangle(double a,double b,double c,double h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    public double area(){
        return (a*h)/2;
    }
    public double perimeter(){
        return a+b+c;
    }
}