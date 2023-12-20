public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i+=10) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
