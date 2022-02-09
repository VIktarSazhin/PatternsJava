package behavior.delegate;

public class Officiant {
    Cooker cooker;
    void  setCooker(Cooker c) {
        cooker = c;
    }
    
    void dish(){
        cooker.cook();
    }
}
