package app.clase4.hilos;

public class Simple2DelayThread extends Thread{
    public String name = null;
    public int delay = 0;

    public Simple2DelayThread(String str, int d){
        this.name = str;
        this.delay = d;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("name: " + this.name + " | delay: " + this.delay);
    }
    
    
}
