public class SurfaceArea
{
   static double pi = 3.14;
   
   public static double circle(double r){
       return 2*pi*r;
   }
   
   public static double rectangle(double a,double b){
       return a*b;
   }
   
   public static double triangle(double a,double h){
       return a*h/2;
   }
   
   public static void main(String[] args ){
       double poleKola = circle(3);
       double poleProstokata = rectangle(4,5);
       double poleTrojkata = triangle(2,5);
       System.out.println("Pole kola wynosi: " + poleKola);
       System.out.println("Pole trojkata wynosi: " + poleTrojkata);
       System.out.println("Pole prostokata wynosi: " + poleProstokata);
   }
   
}
