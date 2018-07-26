// WebProgrammer class drived from Programmer
public class WebProgrammer extends Programmer {

     private String programmingLanguage;

    public WebProgrammer(int ssid, String name, int workExperience, String lastJobPosition, String programmingLanguage) {

        super(ssid, name, workExperience, lastJobPosition);

        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String description() {
        
        return super.description() + "\r\nProgramming Language: " + this.programmingLanguage;
    }
}