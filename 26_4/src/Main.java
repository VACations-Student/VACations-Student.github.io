import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Main
{
    public static void main(String[] args) {
        SistemaLibreria godeano = new SistemaLibreria(new ArrayList<Cliente>(), new ArrayList<Libro>(), new ArrayList<Integer>(), new ArrayList<Libro>(), "El pepe prankestein", new ArrayList<String>(), new ArrayList<Cliente>());

        godeano.set_clientes(new ArrayList<Cliente>((Collection<? extends Cliente>) new Cliente(1, "jkldvafjdalsñk", 21, new ArrayList<Libro>(), new HashMap<Libro, Integer>())));
    }
}
