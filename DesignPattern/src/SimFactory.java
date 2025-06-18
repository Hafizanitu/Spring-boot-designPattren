public class SimFactory {
    SIM getSim(String simName) {
        if (simName.equals("gp"))
            return new GPSIM();
        else if (simName.equals("robi"))
            return new RobiSIM();
        return null;
    }

}
