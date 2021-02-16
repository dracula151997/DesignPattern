package creational.factory.os;

import creational.factory.OperatingSystem;

public class AndroidOS implements OperatingSystem {
    @Override
    public void getName() {
        System.out.println("Android OS");
    }
}
