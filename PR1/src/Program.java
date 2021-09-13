class PingPong implements Runnable{
    Object obj;
    String str;
    PingPong(Object obj,String str) {
        this.str=str;
        this.obj=obj;
    }
    public void run() {
        synchronized (obj) {
            while (true) {
                System.out.println(str);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                obj.notify();
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
public class Program {
    public static void main(String[] args) {
        Object obj= new Object();
        Thread ping = new Thread(new PingPong(obj,"Ping!"));
        Thread pong = new Thread(new PingPong(obj,"Pong!"));
        ping.start();
        pong.start();
    }
}

