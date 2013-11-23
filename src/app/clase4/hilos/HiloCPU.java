package app.clase4.hilos;

public class HiloCPU extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Vez " + i);
            
            ListarCPU();
            
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }           
        }
    }
    
    public void ListarCPU(){
        long mem0 = Runtime.getRuntime().totalMemory();
        long mem1 = Runtime.getRuntime().freeMemory();
        long mem2 = Runtime.getRuntime().availableProcessors();
        long mem3 = Runtime.getRuntime().maxMemory();

        System.out.println("totalMemory " + mem0);
        System.out.println("freeMemory " + mem1);
        System.out.println("availableProcessors " + mem2);
        System.out.println("maxMemory " + mem3);
    }
    
}
