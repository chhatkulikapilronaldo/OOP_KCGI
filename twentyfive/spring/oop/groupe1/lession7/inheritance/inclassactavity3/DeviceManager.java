package twentyfive.spring.oop.groupe1.lession7.inheritance.inclassactavity3;

class DeviceManager {
    ElectronicDevice[] devices;

    DeviceManager(ElectronicDevice[] d) {
        devices = d;
    }

    void showAll() {
        for (ElectronicDevice d : devices) {
            d.displaySpecifications();
        }
    }

    void turnOnAll() {
        for (ElectronicDevice d : devices) {
            d.turnOn();
        }
    }

    void turnOffAll() {
        for (ElectronicDevice d : devices) {
            d.turnOff();
        }
    }
}

