package multithreading;
//this include a practice Thread,Runnable,start(),yeild(),join(),sleep(),run(),currentThread().toString(),getName(),
//setPriority(),getPriority(),


 class xxx implements Runnable{

    @Override
    public void run() {

        for(int i=0;i<=5;i++){
            System.out.println("i am in a Runnable class"+Thread.currentThread() + "  " + i +"  " +  Thread.currentThread().getName() + Thread.currentThread().toString());
           Thread.yield();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}

public class demo{
    public static void main(String[] args) throws InterruptedException {
        Thread hello= new Thread(new xxx() , "RUNNABLE THREAD");
        hello.start();

        hello.join();
        for(int i=0;i<=5;i++){
            System.out.println("i am in a HOME class"+Thread.currentThread() + "  " + i +"  " +  Thread.currentThread().getName());

        }


    }



}

