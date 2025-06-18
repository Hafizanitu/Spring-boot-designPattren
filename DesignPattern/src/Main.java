//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Phone iPhone = new Phone();
        GPSIM gpsim = new GPSIM();
        iPhone.setSim(gpsim);
        iPhone.makeACall();
        iPhone.setSim(new RobiSIM());
        iPhone.makeACall();
//---------------------
        SimFactory simFactory = new SimFactory();
        SIM sim = simFactory.getSim("robi");
        System.out.println(sim.getBrand());
    }
}