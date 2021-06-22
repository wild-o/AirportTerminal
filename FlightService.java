
public class FlightService {

    private AirportPanel data;

    public FlightService(){
        this.data = new AirportPanel();
    }

    public String printPlanes(){
        String plane = this.data.getAirPlane().toString();
        return plane;
    }
}
