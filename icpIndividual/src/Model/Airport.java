package Model;

public class Airport {

    int airportID;
    String Name;
    String City;
    String Country;
    String IATAcode;
    String ICAOcode;
    double Latitude;
    double Longitude;
    int Altitude;
    double Timezone;
    String DST;
    String databaseTimeZone;
    String type;
    String source;

    public Airport(int airportID, String name, String city, String country,
                   String IATAcode, String ICAOcode, double latitude, double longitude,
                   int altitude, double timezone, String DST, String databaseTimeZone,
                   String type, String source) {
        this.airportID = airportID;
        Name = name;
        City = city;
        Country = country;
        this.IATAcode = IATAcode;
        this.ICAOcode = ICAOcode;
        Latitude = latitude;
        Longitude = longitude;
        Altitude = altitude;
        Timezone = timezone;
        this.DST = DST;
        this.databaseTimeZone = databaseTimeZone;
        this.type = type;
        this.source = source;
    }

    public int getAirportID() {
        return airportID;
    }

    public void setAirportID(int airportID) {
        this.airportID = airportID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
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

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }

    public int getAltitude() {
        return Altitude;
    }

    public void setAltitude(int altitude) {
        Altitude = altitude;
    }

    public double getTimezone() {
        return Timezone;
    }

    public void setTimezone(double timezone) {
        Timezone = timezone;
    }

    public String getDST() {
        return DST;
    }

    public void setDST(String DST) {
        this.DST = DST;
    }

    public String getDatabaseTimeZone() {
        return databaseTimeZone;
    }

    public void setDatabaseTimeZone(String databaseTimeZone) {
        this.databaseTimeZone = databaseTimeZone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
