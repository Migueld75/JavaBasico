package app.clase3.objeto;

public class TestObjeto {

    public static void main(String[] args) {
        Socio s1 = new Socio(302, "Miguel", "Tecsup");
        Socio s2 = new Socio(302, "Miguel", "Tecsup");
        if (s1 == s2) {
            System.out.println("Comprobando referencia");
        }
        if (s1.equals(s2)) {
            System.out.println("Comprobando el valor");
        }
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
