package structure.facade;

public class Computer {
    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();

    void copy() {
        power.on();
        dvdRom.load();
        hdd.copyFromDVD(dvdRom);
    }
}
