package creational.factory.os;

import creational.factory.OperatingSystem;

public class WindowsOS implements OperatingSystem {
    @Override
    public void getName() {
        System.out.println("Windows OS");
    }
}
