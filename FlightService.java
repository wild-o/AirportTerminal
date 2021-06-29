import java.util.HashMap;

public class FlightService {
    private HashMap<String,Integer> airPlane;
     AirportPanel port = new AirportPanel();

    public FlightService() {
        this.airPlane = new HashMap<String,Integer>();

    }
    public static void printPlanes(HashMap<String, Integer> airPlane) {
        for (String name : airPlane.keySet()) {
            String key = name;
            String value = airPlane.get(name).toString();
            System.out.println("\n");
            System.out.println(key + "(" + value + " people)");
            // testing
        }
    }
    public static void printFlights(HashMap<String, String> Flight) {

        for (String name : Flight.keySet()) {
            String key = name;
            String value = Flight.get(name);
            System.out.println("(" + key + "-" +value + ")");
        }
    }
    //public void printPlaneInfo(String statement){         This function could not access my airPlane HashMap? Why?
      //  if(port.getAirPlane().containsKey(statement)){    Maybe initializing the HashMap inside the function instead?
        //    printPlanes(port.getAirPlane());
        //}
    //}
}