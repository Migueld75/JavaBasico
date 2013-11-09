package app.clase3.cadenas;

public class Cadena {

    public static void main(String[] args) {
        /*Cadena.concatenar();*/
        /*Cadena.extraccion();*/
        /*Cadena.extraccion2();*/
        /*Cadena.reemplazo();*/
        /*Cadena.metodoString();*/
        /*Cadena.Buffer();*/
        Cadena.Buffer1();
    }

    public static void concatenar() {
        String nombre = "James";
        String apellido = "Gosling";

        //La forma más usada
        if (nombre.equals("James")) {
            System.out.println(nombre + " " + apellido);
        }

        String completo = nombre.concat(" " + apellido);
        if (nombre.equals("James")) {
            System.out.println(completo);
        }
    }

    public static void extraccion() {
        String texto = "Tecsup";

        System.out.println("Número de Caracteres: " + texto.length() + "\n");

        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.substring(i, i + 1) + "\n");
        }
    }

    public static void extraccion2() {
        String texto = "Tecsup";

        System.out.println(texto.substring(1, 3));
        System.out.println(texto.substring(2));
    }

    public static void reemplazo() {
        String texto = "java permite crear java applets, javabeans y java servlets";
        texto = texto.replaceAll("java", "JAVA");
        System.out.println(texto);
    }

    public static void metodoString() {
        String miguel = "miguel diaz   ";

        System.out.println(miguel.toUpperCase());
        System.out.println(miguel.contains("diaz"));
        System.out.println(miguel.length());
        System.out.println(miguel.trim());
    }

    public static void Buffer() {
        StringBuffer sb = new StringBuffer("Java Basico Tecsup Lima");
        sb.insert(11, " en");
        sb.delete(21, sb.length());
        System.out.println(sb);
    }

    public static void Buffer1() {
        StringBuffer buffer = new StringBuffer("Tecsup");
        buffer.append(" - ");
        buffer.append(" Java ");
        buffer.insert(0, "Instituto ");
        buffer.delete(buffer.indexOf("Java"), buffer.length());
        buffer.reverse();
        System.out.println(buffer);
    }
}