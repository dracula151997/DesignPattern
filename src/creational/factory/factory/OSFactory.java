package creational.factory.factory;

import creational.factory.OperatingSystem;
import creational.factory.os.*;

public class OSFactory extends OperatingSystemFactory {
    @Override
    public OperatingSystem getOS(OSTypes type) {
        switch (type)
        {
            case MICROSOFT:
                return new WindowsOS();
            case UBUNTU:
                return new LinuxOS();
            case APPLE:
                return new IOS();
            case GOOGLE:
                return new AndroidOS();
        }
        return null;
    }
}
