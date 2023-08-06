package Facade.Coffee;

public class EspressoMachine {

    private Grinder grinder;
    private Tamper tamper;

    public EspressoMachine() {
        this.grinder = new Grinder();
        this.tamper = new Tamper();
    }

    public void extract(){
        grinder.grinding();
        grinder.dosing();
        tamper.tamping();
        tamper.tapping();
        System.out.println("에스프레소가 추출 되었습니다.");
    }
}
