package app.clase4.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Collecciones {

    public static void main(String[] args) {
        //ejemploLoEstudiantes();
        //ejemplooLikedList();
        //ejemplooHashMap() 
        ejempooHashSet();
    }

    //No permite objetos duplicados    
    //evalua la referencia
    public static void ejempooHashSet() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata");
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta");
        Estudiante e3 = new Estudiante("Carlos", "Lopez");
        Estudiante e4 = new Estudiante("Carlos", "Lopez");

        HashSet<Estudiante> listado = new HashSet<Estudiante>();
        listado.add(e1);
        listado.add(e2);
        listado.add(e3);
        listado.add(e1);
        listado.add(e2);
        listado.add(e3);
        listado.add(e4);
        
        for (Estudiante estudiante : listado) {
            estudiante.printEstudiante();
        }
        System.out.println(listado.size());
    }
    
    public static void ejemplooHashMap() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata");
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta");
        Estudiante e3 = new Estudiante("Carlos", "Lopez");

        // HashMap
        HashMap<Integer, Estudiante> mapa = new HashMap<Integer, Estudiante>();
        mapa.put(100525, e1);
        mapa.put(100526, e2);
        mapa.put(100527, e3);
        Estudiante e = mapa.get(100526);
        System.out.println(e.getNombres());
        
        Collection<Estudiante> co = mapa.values();
        for (Estudiante es : co) {
            es.printEstudiante();
        }
    }

    public static void ejemplooLikedList() {

        Estudiante e1 = new Estudiante("Alberto", "Zapata");
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta");
        Estudiante e3 = new Estudiante("Carlos", "Lopez");

        LinkedList<Estudiante> listado = new LinkedList<Estudiante>();
        listado.add(e1);
        listado.add(e2);
        listado.add(e3);

        ListIterator<Estudiante> ite = listado.listIterator();
        while (ite.hasNext()) {
            Estudiante e = (Estudiante) listado.poll();
            e.printEstudiante();
        }
        System.out.println(listado.size());
    }

    public static void ejemploLoEstudiantes() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata");
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta");
        Estudiante e3 = new Estudiante("Carlos", "Lopez");

        // ArrayList
        List<Estudiante> listado = new ArrayList<Estudiante>();
        listado.add(e1);
        listado.add(e2);
        listado.add(e3);

        //acceder a un elemento de una lista
        listado.get(0).getApellidos();
        
        //inserta el elemento en la posición sino existe lo agrega a la derecha de la lista
        //listado.add(index, e3);
        
        for (Estudiante e : listado) {
            e.printEstudiante();
        }

        Collections.sort(listado);

        for (Estudiante e : listado) {
            e.printEstudiante();
        }
    }
}
