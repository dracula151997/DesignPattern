package creational.factory;

import creational.factory.factory.OSFactory;
import creational.factory.os.OSTypes;

public class FactoryTest {
    public static void main(String[] args) {
        OperatingSystem apple = new OSFactory().getOS(OSTypes.APPLE);
        apple.getName();

        OperatingSystem google = new OSFactory().getOS(OSTypes.GOOGLE);
        google.getName();

        OperatingSystem microsoft = new OSFactory().getOS(OSTypes.MICROSOFT);
        microsoft.getName();
    }
}
