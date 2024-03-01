public class test07 {
    public static void main(String[] args) throws InterruptedException{
        String[] strss = new String[4];
        System.out.println(strss[0]);
        Thread t = new MyThread();
        t.start();
        Thread.sleep(1);
        t.interrupt();
        t.join();

        System.out.println("1");
        Thread t2 = new Thread(() -> {
            System.out.println("t2 thread start!");
            System.out.println("t2 1");
            System.out.println("t2 2");
            System.out.println("t2 3");
        });
        t2.setPriority(10);
        t2.start();
        t2.join();
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {}
        System.out.println("thread end.");
        
        // synchronized(this){xxx;}
    }
}


class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("thread start!");
        int n =0;
        while (! isInterrupted()){
            n++;
            System.out.println(n + "hello!!");
        }
    }
}