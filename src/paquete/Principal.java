
package paquete;

import entiidades.Perro;
import entiidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
         ArrayList<Persona> personas = new ArrayList();
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         String res="";
         do{
             Persona p = new Persona();
             System.out.println("Ingrese el nombre, apellido, documento");
             p.setNombre(leer.next());
             p.setApellido(leer.next());
             p.setDocumento(leer.nextInt());
             System.out.println("Ingrese la mascota: Nombre, raza, edad, tamaño ");
             p.setPerro(new Perro(leer.next(),leer.next(),leer.nextInt(),leer.next()));
             System.out.println("Desea seguir ingresando personas?");
             res=leer.next();
             personas.add(p);
         }while(res.equalsIgnoreCase("si"));
         for (Persona persona : personas) {
             System.out.println(persona.toString());
        }
         
    }
}
