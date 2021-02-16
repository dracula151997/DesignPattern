package creational.singleton;

import java.util.Random;

//This approach is best practise for multi-threaded app
public class ThreadSafeSingletonWithDoubleLocking {
    private static volatile ThreadSafeSingletonWithDoubleLocking instance;
    private static boolean delay = true;

    private ThreadSafeSingletonWithDoubleLocking() {
    }

    public static ThreadSafeSingletonWithDoubleLocking getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingletonWithDoubleLocking.class) {
                if (instance == null) {
                    if (delay) {
                        delay = false;
                        try {

                            Thread.currentThread();
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    instance = new ThreadSafeSingletonWithDoubleLocking();
                }
            }
        }
        return instance;
    }

    public void print()
    {
        int count = new Random().nextInt(1000);
        System.out.println("Random = " + count);

    }
}
