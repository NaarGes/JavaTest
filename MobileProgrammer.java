// MobileProgrammer class drived from Programmer
public class MobileProgrammer extends Programmer {

    private int appsAtMarket;

    public MobileProgrammer(int ssid, String name, int workExperience, String lastJobPosition, int appsAtMarket) {

        super(ssid, name, workExperience, lastJobPosition);

        this.appsAtMarket = appsAtMarket;
    }

    @Override
    public String description() {
        
        return super.description() + "\r\nNumber of Apps Released at Market: " + this.appsAtMarket;
    }
}