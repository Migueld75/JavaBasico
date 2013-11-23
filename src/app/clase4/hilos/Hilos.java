package app.clase4.hilos;

public class Hilos {

    public static void main(String[] args) {
        //Hilos.testHiloHerencia();
        //Hilos.testHiloInterface();
        //Hilos.testSimpleDelayThread();
        //Hilos.testSimple2DelayThread();
        //Hilos.testPrioridades();
        Hilos.testHiloCPU();
        //Hilos.testHiloInfoProcesos();
    }

    public static void testHiloHerencia() {
        HiloHerencia hilo = new HiloHerencia();
        hilo.start();
    }

    public static void testHiloInterface() {
        HiloImplementacion hiloInterface = new HiloImplementacion();
        Thread hilo = new Thread(hiloInterface);
        hilo.start();
        /*
         HiloImplementacion hiloInterface = new HiloImplementacion();
         hiloInterface.run();
         */

    }

    public static void testSimpleDelayThread() {
        SimpleDelayThread sd = new SimpleDelayThread();
        sd.start();
    }

    public static void testSimple2DelayThread() {
        int delay1 = (int) (Math.random() * 2000);
        int delay2 = (int) (Math.random() * 2000);
        int delay3 = (int) (Math.random() * 2000);
        Simple2DelayThread thread1 = new Simple2DelayThread("thread1", delay1);
        Simple2DelayThread thread2 = new Simple2DelayThread("thread2", delay2);
        Simple2DelayThread thread3 = new Simple2DelayThread("thread3", delay3);
        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static void testPrioridades() {
        Simple2DelayThread thread1 = new Simple2DelayThread("thread1", 0);
        Simple2DelayThread thread2 = new Simple2DelayThread("thread2", 0);
        // Modificando las prioridades
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
    }
    
    public static void testHiloCPU() {
        HiloCPU hiloCPU = new HiloCPU();
        hiloCPU.start();
    }
    
    public static void testHiloInfoProcesos() {
        HiloInfoProcesos hiloIP = new HiloInfoProcesos();
        Thread hilo = new Thread(hiloIP);
        hilo.start();
    }
       
}
