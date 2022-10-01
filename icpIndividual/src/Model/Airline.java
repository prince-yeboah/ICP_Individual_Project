package Model;

public class Airline {
    private int airlineID;
    private String Name;
    private String Alias;
    private String IATAcode;
    private String ICAOcode;
    private String callSign;
    private String Country;

    public Airline(int airlineID, String name, String alias, String IATAcode, String ICAOcode, String callSign, String country, String active) {
        this.airlineID = airlineID;
        Name = name;
        Alias = alias;
        this.IATAcode = IATAcode;
        this.ICAOcode = ICAOcode;
        this.callSign = callSign;
        Country = country;
        Active = active;
    }

    private String Active;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String alias) {
        Alias = alias;
    }

    public String getIATAcode() {
        return IATAcode;
    }

    public void setIATAcode(String IATAcode) {
        this.IATAcode = IATAcode;
    }

    public String getICAOcode() {
        return ICAOcode;
    }

    public void setICAOcode(String ICAOcode) {
        this.ICAOcode = ICAOcode;
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }

    public int getAirlineID() {
        return airlineID;
    }

    public void setAirlineID(int airlineID) {
        this.airlineID = airlineID;
    }

//    int airlineID;
}
