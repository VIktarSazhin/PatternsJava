package behavior.delegate;

public class CocktailCooker implements Cooker{
    @Override
    public void cook() {
        System.out.println("Cook cocktail");
    }
}
