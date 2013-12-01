/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase4.ejercicio1.practica;

/**
 *
 * @author alumno
 */
public class TestEncript3 {    
    public static void main(String[] args) {
        Encript3.setPassword("miguel");
        String palabrasecreta ="Hello World"; 
        
        try {
            
            System.out.println(palabrasecreta);
            Encript3.generateKey();
        
            byte[] encript = Encript3.encryptMsg(palabrasecreta, Encript3.getSecret());
            System.out.println(encript);
            
            String decrypt = Encript3.decryptMsg(encript, Encript3.getSecret());
            System.out.println(decrypt);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
        
    }    
}
