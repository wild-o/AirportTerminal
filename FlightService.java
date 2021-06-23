import java.util.HashMap;

public class FlightService {

    private AirportPanel data;

    public FlightService(){
        this.data = new AirportPanel();
    }

    public static void printPlanes(HashMap<String, Integer> airPlane) {
        for (String name: airPlane.keySet()) {
            String key = name;
            String value = airPlane.get(name).toString();
            System.out.println("\n");
            System.out.println(key + "(" + value + ")");
            // testing
        }
    }
}