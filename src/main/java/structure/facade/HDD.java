package structure.facade;

public class HDD {
    void copyFromDVD(DVDRom dvdRom) {
        if (dvdRom.hasData()) {
            System.out.println("Происходит копирование данных с диска");
        } else {
            System.out.println("Вставьте диск с данными");
        }
    }
}
