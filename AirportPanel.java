import java.util.HashMap;

public class AirportPanel {

    private HashMap<String,Integer> airPlane;
    private HashMap<String,String> Flight;


    public AirportPanel(){
        this.airPlane = new HashMap<String,Integer>();
        this.Flight = new HashMap<String,String>();
    }

    public void addAirplane(String planeID, int capacity){
        this.airPlane.put(planeID,capacity);
        System.out.println("\n");
        System.out.println("--------------------------------");
        System.out.println("The Flight has been added! ");
        System.out.println("--------------------------------");
    }

    public void addFlight(String flightCode, String depCode, String destCode){
        if(this.airPlane.containsKey(flightCode)){
            this.Flight.put(depCode,destCode);
        }
        else{
            System.out.println("\n");
            System.out.println("--------------------------------");
            System.out.println("The Plane ID does not exist. ");
            System.out.println("--------------------------------");
        }
    }
    public HashMap<String, Integer> getAirPlane() {
        return airPlane;
    }

    public void exitToFlightService(){
        System.out.println("Exiting...");
    }
}
