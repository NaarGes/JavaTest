// base class
public class Person {

    // fields
    private int ssid; 
    private String name;

    // constructor
    public Person(int ssid, String name) {

        this.ssid = ssid;
        this.name = name;
    }

    // method returns a description of class fields
    public String description() {

        return "SSID: " + this.ssid + "\r\nName: " + this.name;
    }
}