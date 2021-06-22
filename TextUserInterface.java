import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private AirportPanel port;
    private FlightService flights;


    public TextUserInterface(Scanner reader){
        this.reader = reader;
        this.port = new AirportPanel();
    }

    public void startAirportPanel(){

        while(true){
            System.out.println("\n");
            System.out.println("Airport panel\n" +
                    "--------------------");
            System.out.println("Choose operation:\n" +
                    "[1] Add airplane\n" +
                    "[2] Add flight\n" +
                    "[x] Exit");

            System.out.println("\n");
            System.out.println("Statement: ");
            String statement = reader.nextLine().trim();

            if(statement.equalsIgnoreCase("1")){
                addPlaneInfo();
            }
            if(statement.equalsIgnoreCase("2")){
                addFlight();
            }
            if(statement.equalsIgnoreCase("x")){
                break;
            }
        }
        startFlightService();
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
                flights.printPlanes(); //function in progress
            }
            if (statement.equalsIgnoreCase("2")) {

            }
            if (statement.equalsIgnoreCase("3")) {

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
