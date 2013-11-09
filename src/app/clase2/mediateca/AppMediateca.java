/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.mediateca;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AppMediateca {

    public static void main(String[] args) {
        CintaVideo cintaVideo = new CintaVideo("The Avengers", "Joss Whedon ", new ArrayList<String>() {
            {
                add("Robert Downey Jr");
                add("Chris Evans");
                add("Scarlett Johansson");
            }
        }, 143);
        CintaYCDAudio cintaYCDAudio = new CintaYCDAudio("Unforgettable fire", "U2", "cualquiera", 60);
        Libro libro = new Libro("Rayuela", "Julio Cortazar", 100, "9780380003723");
        //Libro libro2 = new Libro("La Palabra del Mudo", "Julio Ramon Ribeyro", 200, "9786124516573");

        Socio socio = new Socio("Miguel", "Diaz");

        Prestamo prestamo = new Prestamo();
        prestamo.setSocio(socio);
        prestamo.agregarSoporte(cintaVideo, 3);
        prestamo.agregarSoporte(cintaYCDAudio, 5);
        prestamo.agregarSoporte(libro, 15);
        //prestamo.agregarSoporte(libro2, 15);

        System.out.println(prestamo.getSocio().getNombre() + " pidió prestado " + prestamo.getSoportes().size() + " soporte(s) " + " deberá pagar " + prestamo.calcularPrecioTotal());

    }
}
