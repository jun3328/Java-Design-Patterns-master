package Facade.Computer;

public class Desktop {

    public void powerOn(){
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();

        cpu.freeze();
        hardDrive.read();
        memory.load();

        cpu.jump();
        cpu.execute();
        System.out.println("PC가 부팅 되었습니다");
    }
}
