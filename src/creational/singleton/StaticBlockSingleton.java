package creational.singleton;

public class StaticBlockSingleton {
    //Static block initialization implementation is similar to eager initialization,
    //except that instance of class is created in the static block that provides option for exception handling.
    //-> is not best practise
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
