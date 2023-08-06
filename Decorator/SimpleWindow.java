package Decorator;

public class SimpleWindow implements Window {

    @Override
    public void draw() {
        System.out.println("draw windows");
    }

    @Override
    public String getDescription() {
        return "simple window";
    }
}
