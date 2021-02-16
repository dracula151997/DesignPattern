package creational.singleton;

public class LazyInitializedSingleton {
    /**
     * Lazy initialization method to implement Singleton pattern creates the instance in the global access method.
     * This implementation works fine in case of the single-threaded environment but when it comes to multithreaded systems,
     * it can cause issues if multiple threads are inside the if condition at the same time.
     * It will destroy the singleton pattern and both threads will get the different instances of the singleton class.
     *
     * This approach is fine of the Single-threaded only
     */
    private static LazyInitializedSingleton instance;

    private static boolean delay = true;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance(){
        if (instance == null)
        {
            if (delay)
            {
                try {
                    delay = false;
                    Thread.currentThread();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
