package creational.factory.os;

import creational.factory.OperatingSystem;

public class IOS implements OperatingSystem {
    @Override
    public void getName() {
        System.out.println("IOS");
    }
}
