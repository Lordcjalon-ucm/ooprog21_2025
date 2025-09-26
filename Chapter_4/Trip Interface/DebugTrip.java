public class DebugTrip {
    private String destination;
    private String departureCity;
    private String mode;

    public DebugTrip(String dest) {
        destination = dest;
        departureCity = "Unknown"; 
        mode = "Unknown";
    }

    public DebugTrip(String dest, String depart) {
        destination = dest;
        departureCity = depart;
        mode = "Unknown"; 
    }

    public DebugTrip(String dest, String depart, String modeChoice) {
        destination = dest;
        departureCity = depart;
        mode = modeChoice;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getMode() {
        return mode;
    }
}
