package creational.singleton;

public class EagerInitializedSingleton {
    //the instance of the class is created at the time of class loading.
    //Advantage: If your singleton class is not using a lot of resources, this is the approach to use.
    //Disadvantage: it has a drawback that instance is created even though client application might not be using it.
    //-> This approach is not best practise
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid other classes to use its constructor
    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
