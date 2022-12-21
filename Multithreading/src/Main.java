import static java.lang.Thread.sleep;

public class Main {


    public static class Test2 implements Runnable{

        @Override
        public void run() {

            for(int i=0;i<5;i++){
                System.out.println("Inside the test class ");
                try {
                    sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    public static class Test extends Thread{

        //Overriding this run --> what you want
        public void run(){ // Similar to the main function

            //Waiting for its turn to take the console;

            for(int i=0;i<5;i++){
                System.out.println("Inside the test class ");
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {


        //Main is running on 1 thread ---->

        System.out.println("Hello world!");

//        Create the thead
        Test t = new Test();


        //Starting this thread
        t.start();


        //main thread
        for(int i=0;i<5;i++){

            System.out.println("Inside the main class");
            sleep(1);
        }


        //Calling the thread built using the Runnable Interface
        Thread t2 = new Thread(new Test2());

        t2.start();

        for(int i=0;i<5;i++){

            System.out.println("Inside the main class");
            sleep(2);
        }


    }
}