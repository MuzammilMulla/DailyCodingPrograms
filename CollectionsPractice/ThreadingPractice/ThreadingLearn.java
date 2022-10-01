public class ThreadingLearn {
    public static void main(String[] args) {
        // thread
        /*
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();


        System.out.println(t1.getState());  //NEW
        System.out.println(t2.getState());  //NEW

        t1.start();
        t2.start();
        t3.start();

         */


        //runnable

        Thread4 t4 = new Thread4();
        Thread s4 = new Thread(t4);

        Thread5 t5 = new Thread5();
        Thread s5 = new Thread(t5);

        s4.start();
        s5.start();


    }

}

// creating thread extending thread class
class Thread1 extends Thread{
    public void run(){
        while(true) System.out.println("thread 1 --------");
    }
}

class Thread2 extends Thread{
    public void run(){  while(true) System.out.println("thread 2 **********"); }
}

class Thread3 extends Thread{
    public void run(){
        while(true) System.out.println("thread 3 ##########");
    }
}


//  creating thread implementing Runnable interface

class Thread4 implements  Runnable{

    @Override
    public void run() {
        int i=0;
        while( i < 1000)System.out.println(" 44444444444");
    }
}class Thread5 implements  Runnable{

    @Override
    public void run() {
        int i=0;
        while( i < 1000)System.out.println(" 5555555555");
    }
}


