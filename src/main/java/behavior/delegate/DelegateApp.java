package behavior.delegate;

public class DelegateApp {
    public static void main(String[] args) {

        Officiant officiant = new Officiant();
        officiant.setCooker(new CreamCooker());
        officiant.dish();
    }
}
