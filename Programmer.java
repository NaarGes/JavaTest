// Programmer class drived from Applicant
public class Programmer extends Applicant {
    
    private String lastJobPosition;

    public Programmer(int ssid, String name, int workExperience, String lastJobPosition) {

        super(ssid, name, workExperience);

        this.lastJobPosition = lastJobPosition;
    }

    @Override
    public String description() {
        
        return super.description() + "\r\nLast Job Position: " + this.lastJobPosition;
    }
}