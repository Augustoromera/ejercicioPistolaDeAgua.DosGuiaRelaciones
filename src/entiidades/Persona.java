
package entiidades;
public class Persona {
    String nombre;
    String apellido;
    Integer documento;
    Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", perro=" + perro + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }
    
    
}
