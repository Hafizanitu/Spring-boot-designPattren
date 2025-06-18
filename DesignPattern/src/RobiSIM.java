public class RobiSIM implements SIM {
    @Override
    public String getNumber() {
        return "0187854554554";
    }

    @Override
    public String getBrand() {
        return "Robi";
    }

    @Override
    public void doCall() {
        System.out.println("Call is connected by Robi");
    }

}
