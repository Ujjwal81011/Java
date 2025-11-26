class mythread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}
public class wednesday {
    public static void main(String[] args) {
        mythread t = new mythread();
        t.start();
    }
}