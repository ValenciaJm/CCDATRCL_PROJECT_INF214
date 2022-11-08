import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> ResortReservation = new LinkedList<>();

        System.out.println("Hotel Reservation");

        ResortReservation.add("Estimadora");
        ResortReservation.add("Valencia");
        ResortReservation.add("Torres");
        ResortReservation.add("Victoria");
        ResortReservation.add("Rolda");
        ResortReservation.add("Capulla");
        ResortReservation.add("Soriano");
        ResortReservation.add("Cruz");
        ResortReservation.add("Reyes");
        ResortReservation.add("Velasquez");

        System.out.println("The Customer booked a 12 hours reservation at the resort" + " - " + ResortReservation.peek());
        
        System.out.println(ResortReservation);
       
        ResortReservation.remove("Estimadora");

        System.out.println(ResortReservation.size());


        
        System.out.println("The Customer booked a 48 hours reservation at the resort" + " - " + ResortReservation.peek());

        System.out.println(ResortReservation);

        ResortReservation.remove("Valencia");

        System.out.println(ResortReservation.size());



        System.out.println("The Customer booked a 24 hours reservation at the resort" + " - " + ResortReservation.peek());

        System.out.println(ResortReservation);
        
        ResortReservation.remove("Torres");

        System.out.println(ResortReservation.size());



        System.out.println("The Customer booked a 36 hours reservation at the resort" + " - " + ResortReservation.peek());

        System.out.println(ResortReservation);

        ResortReservation.remove("Victoria");
        
        System.out.println(ResortReservation.size());


        
        System.out.println("The Customer booked a 120 hours reservation at the resort" + " - " + ResortReservation.peek());

        System.out.println(ResortReservation);

        ResortReservation.remove("Rolda");
        
        System.out.println(ResortReservation.size());



        System.out.println("The Customer booked a 240 hours reservation at the resort" + " - " + ResortReservation.peek());

        System.out.println(ResortReservation);

        ResortReservation.remove("Capulla");
        
        System.out.println(ResortReservation.size());



        System.out.println("The Customer booked a 168 hours reservation at the resort" + " - " + ResortReservation.peek());

        System.out.println(ResortReservation);

        ResortReservation.remove("Soriano");
        
        System.out.println(ResortReservation.size());



        System.out.println("The Customer booked a 96 hours reservation at the resort" + " - " + ResortReservation.peek());

        System.out.println(ResortReservation);

        ResortReservation.remove("Cruz");
        
        System.out.println(ResortReservation.size());



        System.out.println("The Customer booked a 48 hours reservation at the resort" + " - " + ResortReservation.peek());

        System.out.println(ResortReservation);

        ResortReservation.remove("Reyes");
        
        System.out.println(ResortReservation.size());



        System.out.println("The Customer booked a 192 hours reservation at the resort" + " - " + ResortReservation.peek());

        System.out.println(ResortReservation);

        ResortReservation.remove("Velasquez");
        
        System.out.println(ResortReservation.size());

        System.out.println("The reservation is alraedy full");
    }
}
