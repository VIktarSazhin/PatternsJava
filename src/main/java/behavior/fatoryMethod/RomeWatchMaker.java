package behavior.fatoryMethod;

public class RomeWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
