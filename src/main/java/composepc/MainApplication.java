package composepc;

import java.lang.reflect.Method;

public class MainApplication {
    public static void main(String[] args) {

        Case corsair_case = new Case("Corsair", "Asus powersupply", new Dimension(15,15,15), "E500");
        Monitor asus_monitor = new Monitor(new Resolution(1920, 1080), "Asus", "VH328H");
        MotherBoard msi_mobo = new MotherBoard("MSI-model", "MSI", 4, 4, "BIOS");

        PC computer = new PC(corsair_case, asus_monitor, msi_mobo);

        computer.powerUp();
        computer.description();

    }
}
