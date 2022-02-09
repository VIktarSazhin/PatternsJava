package behavior.fatoryMethod;

public class FactoryMethodApp {
    public static void main(String[] args) {
        WatchMaker maker = new DigitalWatchMaker();
        Watch watch = maker.createWatch();
        watch.showTime();

        WatchMaker maker1 = getMakerByName("Rome");
        Watch watch1 = maker1.createWatch();
        watch1.showTime();
    }

    public static WatchMaker getMakerByName(String maker) {
        if (maker.equalsIgnoreCase("Digital")) {
            return new DigitalWatchMaker();
        } else if (maker.equalsIgnoreCase("Rome")) {
            return new RomeWatchMaker();
        }

        throw new RuntimeException("Не поддерживаемая производственная линия часов: " + maker);
    }
}

