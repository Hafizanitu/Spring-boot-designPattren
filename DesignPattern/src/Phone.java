public class Phone {
    SIM sim;

    //    public Phone(SIM s){
//        this.sim=s;
//    }
    public void setSim(SIM sim) {
        this.sim = sim;
    }

    public void makeACall() {
        sim.doCall();
    }
}
