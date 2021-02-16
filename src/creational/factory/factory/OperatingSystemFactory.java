package creational.factory.factory;

import creational.factory.OperatingSystem;
import creational.factory.os.OSTypes;

public abstract class OperatingSystemFactory {
    public abstract OperatingSystem getOS(OSTypes type);
}
