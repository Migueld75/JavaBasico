package app.clase4.hilos;

public class SimpleDelayThread extends Thread{
    
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(i);
                //1000                
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
            
}
