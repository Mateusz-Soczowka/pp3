public class CinemaTicket
{
    // Atrybuty obiektu
    static String cinemaName = "Słoneczko";
    String filmTitle;
    int seat;
    int row;
    double price;

    // Metody obiektu
    public void displayTicket (){
        System.out.println("Nazwa kina: " + cinemaName);
        System.out.println("Tytuł filmu: " + filmTitle);
        System.out.println("Miejsce: " + seat);
        System.out.println("Rząd: " + row);
        System.out.println("Cena biletu: " + price);
    }
    public CinemaTicket(String filmTitle, int seat, int row){
        this.filmTitle = filmTitle;
        this.seat = seat;
        this.row = row;
        if (row>2){
            price = 25;
        }
        else{
            price = 10;
        }
    }
    
    public static void main(String[] args ){
        CinemaTicket ticket1 = new CinemaTicket("Terminator" ,5,6);
        CinemaTicket ticket2 = new CinemaTicket("Drive",8,1);
        ticket1.displayTicket();
        ticket2.displayTicket();
        
    }
    
     
}
