import java.util.*;

public class SistemaLibreria
{
    private ArrayList<Cliente> clientes;
    private HashSet<Cliente> todos_los_clientes;
    private ArrayList<Libro> libros_venta;
    private ArrayList<Integer> libros_oferta;
    private ArrayList<Libro> libros_vendidos;
    private HashSet<String> editoriales_con_descuento;
    private String nombre;
    private HashMap<Cliente, Double> ventas;

    public SistemaLibreria(ArrayList<Cliente> clientes, ArrayList<Libro> libros, ArrayList<Integer> ofertas, ArrayList<Libro> vendidos, String nombre, ArrayList<String> editoriales_descuento, ArrayList<Cliente> todos_los_cliente) {
        this.clientes = new ArrayList<Cliente>(clientes);
        this.libros_venta = new ArrayList<Libro>(libros);
        this.libros_oferta = new ArrayList<Integer>(ofertas);
        this.libros_vendidos = new ArrayList<Libro>(vendidos);
        this.nombre = nombre;
	    this.editoriales_con_descuento = new HashSet<String>(editoriales_descuento);
	    this.ventas = new HashMap<Cliente, Double>();
	    this.todos_los_clientes = new HashSet<Cliente>(todos_los_cliente);

    }

    public ArrayList<Cliente> get_clientes() {
        return clientes;
    }

    public void set_clientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Libro> get_libros_venta() {
        return libros_venta;
    }

    public void set_libros_venta(ArrayList<Libro> libros_venta) {
        this.libros_venta = libros_venta;
    }

    public ArrayList<Integer> get_libros_oferta() {
        return libros_oferta;
    }

    public void set_libros_oferta(ArrayList<Integer> libros_oferta) {
        this.libros_oferta = libros_oferta;
    }

    public ArrayList<Libro> get_libros_vendidos() {
        return libros_vendidos;
    }

    public void set_libros_vendidos(ArrayList<Libro> libros_vendidos) {
        this.libros_vendidos = libros_vendidos;
    }

    public String get_nombre() {
        return nombre;
    }

    public void set_nombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> get_clientes_frecuentes() {
        ArrayList<Cliente> clientes_frecuentes = new ArrayList<Cliente>();

        for (Cliente cliente : clientes) {
            if (cliente.get_libros_comprados().size() > 10) {
                clientes_frecuentes.add(cliente);
            }
        }

        return clientes_frecuentes;
    }

    /*
    // Hacer deuwuspues
    public ArrayList<Libro> get_libros_mas_vendidos() {
        HashMap<Libro, Integer> ventas_libros = new HashMap<>();


    }*/

    public ArrayList<Integer> get_edad_clientes_frecuentes() {
        ArrayList<Integer> edades = new ArrayList<>();

        for (Cliente cliente_frecuente : this.get_clientes_frecuentes()) {
            edades.add(cliente_frecuente.get_edad());
        }

        return edades;
    }

    public ArrayList<Libro> get_libros_caros() {
        ArrayList<Libro> libros_caros = new ArrayList<>();

        for(Libro libro : libros_venta){
            if(libro.get_precio() > 5500.5){
                libros_caros.add(libro);
            }
        }
        return libros_caros;
    }

    public void test_venta() {
        Libro new_libro = new Libro(0, "La Increible Historia Del Coito Que Tuve Con Tu Progenitora", 69.69f, "Kapelusz");

        libros_vendidos.add(new_libro);

    }

    public ArrayList<Libro> get_libro_segun_letra(char c) {
        ArrayList<Libro> libros = new ArrayList<>();

        for (Libro libro : libros_venta) {
            if (libro.get_nombre().charAt(0) == c) {
                libros.add(libro);
            }
        }

        return libros;

    }

    public float precio_final(Cliente cliente) {
        float abono_final = 0.f;

        for (Libro libro : cliente.get_libros_comprados()) {
            switch (libro.get_editorial()) {
                case "ElAteneo", "Interzona", "Sur", "Alianza" -> abono_final += libro.get_precio() / 2;
                default -> abono_final += libro.get_precio();
            }

        }

        return abono_final;

    }

    public void cambiar_precio_libro(int id, float porcentaje_descuento) {
        for (Libro libro : libros_venta) {
            if (libro.get_id() == id) {
                libro.set_precio( libro.get_precio() - (libro.get_precio() * porcentaje_descuento) );
            }
        }

    }

    public void cambiar_precios_navidad() {
        for (Libro libro : libros_venta) {
            if (libro.get_id() % 2 == 0) {
                libro.set_precio( libro.get_precio() - (libro.get_precio() * 0.25f) );

            } else {
                libro.set_precio( libro.get_precio() - (libro.get_precio() * 0.35f) );
            }
        }
    }

    public void agregar_editorial_descuento(String editorial_descuento) {
	editoriales_con_descuento.add(editorial_descuento);
    }

    public void datos_compra_cliente(Cliente cliente) {
	    for (Libro libro : cliente.get_libros_comprados()) {
            for (Integer cantidades : cliente.getCantidades_compradas().values()) {
                if (Objects.equals(cliente.getCantidades_compradas().get(libro), cantidades))
                    System.out.printf("Libro: (%d, %s, %f, %d)", libro.get_id(), libro.get_nombre(), ventas.get(cliente), cantidades);
            }
	    }
    }

    public HashSet<Cliente> getTodos_los_clientes() {
        return todos_los_clientes;
    }

    public void setTodos_los_clientes(HashSet<Cliente> todos_los_clientes) {
        this.todos_los_clientes = todos_los_clientes;
    }
}
