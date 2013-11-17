package app.clase3.excepcion;

public class Excepcion {

    public static void main(String[] args) {
        //TestExcepcion();
        //TestExcepcion2();
        TestExceptcion3();
    }

    public static void TestExcepcion() {
        int dividendo = 10;
        int divisor = 0;

        try {
            int resultado = dividendo / divisor;
        } catch (Exception ex) {
            System.out.println("Error!!!! " + ex.getMessage());
            ex.printStackTrace();
        }

    }

    public static void TestExcepcion2() {

        try {
            //Error Arithmetical
            int dividendo = 10;
            int divisor = 0;
            int resultado = dividendo / divisor;

            //int resultado = dividendo / divisor;
            int[] array = new int[2];
            array[10] = 100;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error!!!! " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error!!!! " + e.getMessage());
        } finally {
            System.out.println("Fin de programa");
        }
    }

//    public static void TestExcepcion3() {
//        int x = (int) (Math.random() * 5);
//        int y = (int) (Math.random() * 10);
//        int[] z = new int[5];
//
//        try {
//            System.out.println("y/x gives " + (y / x));
//            System.out.println("y is " + y + " z[y] is " + z[y]);
//        } catch (ArithmeticException e) {
//            System.out.println("Arithmetic problem " + e);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Subscript problem " + e);
//        } finally {
//            System.out.println("Terminando la ejecución del método");
//        }
//        System.out.println("Continúa la ejecución del método....");
//    }
    
    public static void TestExceptcion3() {        
        
        try {
            //int[] numeros = null;
            int[] numeros = {11,22,33,44,55,66,77,88,99,2,2};
            
            for (int i = 0; i < 11; i++) {
                int j = numeros[i];
            }
            
        } catch (NullPointerException e) {
            System.out.println("Error array nulo");
            e.printStackTrace();
        }finally{
            System.out.println("Aplicacion terminada");
        }
    }
}
