package behavior.delegate;

public class SaltCooker implements Cooker {
    @Override
    public void cook() {
        System.out.println("Cook salt");
    }
}
