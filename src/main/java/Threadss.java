import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class Threadss extends HttpServlet
{
  
  Lock firstLock = new ReentrantLock();
  Lock secondLock = new ReentrantLock();
  
  public void init() throws ServletException
  {
        System.out.println("----------");
        System.out.println("---------- CrunchifyServletExample Initialized successfully ----------");
        System.out.println("----------");
        Threadss tg=new Threadss();
        tg.start();
        
        
        
  }
  private void start() {
    firstLock.lock();
    Thread secondThread = new Thread(new Runnable() {
      public void run() {
          secondLock.lock();
          firstLock.lock();
      }
    });

    secondThread.start();
    try {
        Thread.sleep(250);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    secondLock.lock();
    secondLock.unlock();
    firstLock.unlock();

}
}
