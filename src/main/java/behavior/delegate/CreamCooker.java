package behavior.delegate;

public class CreamCooker implements Cooker{
    @Override
    public void cook() {
        System.out.println("Cook cream");
    }
}
