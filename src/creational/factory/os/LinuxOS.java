package creational.factory.os;

import creational.factory.OperatingSystem;

public class LinuxOS implements OperatingSystem {
    @Override
    public void getName() {
        System.out.println("Linux OS");
    }
}
