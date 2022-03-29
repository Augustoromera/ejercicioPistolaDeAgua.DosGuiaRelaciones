
package entiidades;
public class Perro {
    String nombre;
    String Raza;
    Integer edad;
    String tamaño;

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", Raza=" + Raza + ", edad=" + edad + ", tama\u00f1o=" + tamaño + '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Perro(String nombre, String Raza, Integer edad, String tamaño) {
        this.nombre = nombre;
        this.Raza = Raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Perro() {
    }
    
}
