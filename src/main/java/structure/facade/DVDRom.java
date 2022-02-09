package structure.facade;

public class DVDRom {
    private boolean data;

    public boolean hasData() {
        return data;
    }

    void load() {
        System.out.println("Диск загружен");
        data = true;
    }

    void unload() {
        System.out.println("Диск выгружен");
        data = false;
    }
}
