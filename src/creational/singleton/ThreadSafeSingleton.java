package creational.singleton;

public class ThreadSafeSingleton {
    /**
      *The easier way to create a thread-safe singleton class is to make the global access method synchronized, so that
      only one thread can execute this method at a time.
     * This implementation works fine and provide thread-safety but it reduces the performance because of the cost
     * associated with the synchronized method, although we need it only for the first few threads
     * who might create the separate instances.
     *
     * This approach is fine for multi-threaded but it reduces the performance of app with increasing number of
     * threaded because of 'synchronized' keyword.
     **/
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){};

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null)
        {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
