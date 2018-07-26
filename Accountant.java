// Accountant class drived from Applicant
public class Accountant extends Applicant {

    private String degree;

    public Accountant(int ssid, String name, int workExperience, String degree) {

        super(ssid, name, workExperience);

        this.degree = degree;
    }

    @Override
    public String description() {
        
        return super.description() + "\r\nLast Educational Certificate: " + this.degree;
    }
}