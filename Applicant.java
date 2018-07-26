// Applicant class derived from Person
public class Applicant extends Person {

    // adds one more field to Person class
    private int workExperience;

    // constructor
    public Applicant(int ssid, String name, int workExperience) {

        super(ssid, name);

        this.workExperience = workExperience;
    }

    @Override
    public String description() {

        return super.description() + "\r\nWork Experience (years): "+ this.workExperience; 
    }
}