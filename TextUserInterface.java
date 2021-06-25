import java.util.Scanner;
import java.util.HashMap;

public class TextUserInterface {

    private Scanner reader;
    private AirportPanel port;
    private FlightService flight;


    public TextUserInterface(Scanner reader){
        this.reader = reader;
        this.port = new AirportPanel();
        this.flight = new FlightService();
    }

    public void startAirportPanel(){

        while(true){
            System.out.println("\n");
            System.out.println("Airport panel\n" +
                    "--------------------");
            System.out.println("Choose operation:\n" +
                    "[1] Add airplane\n" +
                    "[2] Add flight\n" +
                    "[3] Exit");

            System.out.println("\n");
            System.out.println("Statement: ");
            String statement = reader.nextLine().trim();

            if(statement.equalsIgnoreCase("1")){
                addPlaneInfo();
            }
            if(statement.equalsIgnoreCase("2")){
                addFlight();
            }
            if(statement.equalsIgnoreCase("3")){
                startFlightService();
            }

        }

    }

    public void startFlightService() {
        while (true) {
            System.out.println("\n");
            System.out.println("Flight Service\n" +
                    "--------------------");
            System.out.println("Choose operation:\n" +
                    "[1] Print Planes\n" +
                    "[2] Print flights\n" +
                    "[3] Print Plane Info\n" +
                    "[x] Exit");

            System.out.println("\n");
            System.out.println("Statement: ");
            String statement = reader.nextLine().trim();

            if (statement.equalsIgnoreCase("1")) {
                flight.printPlanes(port.getAirPlane()); //function in progress
            }
            if (statement.equalsIgnoreCase("2")) {
                flight.printPlanes(port.getAirPlane());
                flight.printFlights(port.getFlight());
            }
            if(statement.equalsIgnoreCase("3")){
                System.out.println("Enter Plane ID: ");
                String code = reader.nextLine();

                //flight.printPlaneInfo(code);
                if(port.getAirPlane().containsKey(code)){
                    flight.printPlanes(port.getAirPlane());
                }


            }

            if (statement.equalsIgnoreCase("x")){

            }
        }
    }

    public void addPlaneInfo(){
        String ID;
        int capacity;

        System.out.println("Give Plane ID: ");
        ID = reader.nextLine();
        System.out.println("Give Plane capacity: ");
        capacity = Integer.parseInt(reader.nextLine());

        port.addAirplane(ID,capacity);
    }

    public void addFlight(){
        String ID;
        String depCode;
        String destCode;

        System.out.println("Give Plane ID: ");
        ID = reader.nextLine();

        System.out.println("Give Plane departure code: ");
        depCode = reader.nextLine();

        System.out.println("Give Plane destination code: ");
        destCode = reader.nextLine();

        port.addFlight(ID, depCode, destCode);
    }
}