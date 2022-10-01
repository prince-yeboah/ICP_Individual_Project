package Model;

public class Route {
    private String airlineCode;
    private int airlineID;
    private String sourceAirportCode;
    private int sourceAirportId;
    private String destinationAirportCode;
    private int getDestinationAirportId;
    private String codeShare;
    private int stops;
    private String equipment;

    public Route(String airlineCode, int airlineID, String sourceAirportCode,
                 int sourceAirportId, String destinationAirportCode, int getDestinationAirportId,
                 String codeShare, int stops, String equipment) {
        this.airlineCode = airlineCode;
        this.airlineID = airlineID;
        this.sourceAirportCode = sourceAirportCode;
        this.sourceAirportId = sourceAirportId;
        this.destinationAirportCode = destinationAirportCode;
        this.getDestinationAirportId = getDestinationAirportId;
        this.codeShare = codeShare;
        this.stops = stops;
        this.equipment = equipment;
    }



    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public int getAirlineID() {
        return airlineID;
    }

    public void setAirlineID(int airlineID) {
        this.airlineID = airlineID;
    }

    public String getSourceAirportCode() {
        return sourceAirportCode;
    }

    public void setSourceAirportCode(String sourceAirportCode) {
        this.sourceAirportCode = sourceAirportCode;
    }

    public int getSourceAirportId() {
        return sourceAirportId;
    }

    public void setSourceAirportId(int sourceAirportId) {
        this.sourceAirportId = sourceAirportId;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    public void setDestinationAirportCode(String destinationAirportCode) {
        this.destinationAirportCode = destinationAirportCode;
    }

    public int getGetDestinationAirportId() {
        return getDestinationAirportId;
    }

    public void setGetDestinationAirportId(int getDestinationAirportId) {
        this.getDestinationAirportId = getDestinationAirportId;
    }

    public String getCodeShare() {
        return codeShare;
    }

    public void setCodeShare(String codeShare) {
        this.codeShare = codeShare;
    }

    public int getStops() {
        return stops;
    }

    public void setStops(int stops) {
        this.stops = stops;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }
}
