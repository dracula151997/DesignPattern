package creational.singleton;

public class SingletonTest {
    public static void main(String[] args) {

        new LazyInitializedThread().start();
        new LazyInitializedThread().start();

        new ThreadSafeSingleton().start();
        new ThreadSafeSingleton().start();

    }

    public static class LazyInitializedThread extends Thread {
        @Override
        public void run() {
            LazyInitializedSingleton instance = LazyInitializedSingleton.getInstance();
            System.out.println("Lazy Initialization instance = " + instance.hashCode());
        }
    }

    public static class ThreadSafeSingleton extends Thread {
        @Override
        public void run() {
            ThreadSafeSingletonWithDoubleLocking instance = ThreadSafeSingletonWithDoubleLocking.getInstance();
            System.out.println("ThreadSafe Initialization Instance = " + instance.hashCode());
        }
    }
}
