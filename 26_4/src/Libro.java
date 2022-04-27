public class Libro
{
    private int id;
    private String nombre;
    private float precio;
    private String editorial;

    public Libro(int id, String nombre, float precio, String editorial) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.editorial = editorial;
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

    public float get_precio() {
        return precio;
    }

    public void set_precio(float precio) {
        this.precio = precio;
    }

    public String get_editorial() {
        return editorial;
    }

    public void set_editorial(String editorial) {
        this.editorial = editorial;
    }
}
