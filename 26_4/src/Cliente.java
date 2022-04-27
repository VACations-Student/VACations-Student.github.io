import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cliente
{
    private int id;
    private String nombre;
    private int edad;
    private ArrayList<Libro> libros_comprados;
    private HashMap<Libro, Integer> cantidades_compradas;

    public Cliente(int id, String nombre, int edad, ArrayList<Libro> libros_comprados, HashMap<Libro, Integer> c_p) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.libros_comprados = new ArrayList<Libro>(libros_comprados);
	    this.cantidades_compradas = new HashMap<Libro, Integer>(c_p);

    }

    public int get_id() {
        return id;
    }

    public void set_id(int id) {
        this.id = id;
    }

    public String get_nombre() {
        return nombre;
    }

    public void set_nombre(String nombre) {
        this.nombre = nombre;
    }

    public int get_edad() {
        return edad;
    }

    public void set_edad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Libro> get_libros_comprados() {
        return libros_comprados;
    }

    public void set_libros_comprados(ArrayList<Libro> libros_comprados) {
        this.libros_comprados = libros_comprados;
    }

    public HashMap<Libro, Integer> getCantidades_compradas() {
        return cantidades_compradas;
    }

    public void appendToCantidadesCompradas(Libro libro, Integer cantidad) {
        cantidades_compradas.put(libro, cantidad);
    }
}
