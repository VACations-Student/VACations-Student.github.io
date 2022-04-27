import java.util.ArrayList;
import java.util.HashMap;

public class Alumno extends Persona{
    private String curso;
    private HashMap<String,ArrayList<Float>> notas_por_materia;

    public Alumno(){
        super();
        this.curso="1°A";
        this.notas_por_materia = new HashMap<>();
    }

    public Alumno(String curso, HashMap<String, ArrayList<Float>> notas_materia, String nombre, String apellido, int edad) {
        super(nombre, apellido);
        this.setEdad(edad);

        this.curso = curso;
        this.notas_por_materia = new HashMap<>(notas_materia);
    }

    public void agregar_nota(String materia, float nueva_nota) {
        notas_por_materia.get(materia).add(nueva_nota);
    }

    public float menor_nota(String materia) {
        float menor_nota = Float.MAX_VALUE;

        for (Float nota : notas_por_materia.get(materia)) {
            if (nota < menor_nota) {
                menor_nota = nota;
            }
        }

        return menor_nota;
    }

    public float mayor_nota(String materia){
        float mayor_nota = Float.MIN_VALUE;

        for(Float nota : notas_por_materia.get(materia)){
            if(nota > mayor_nota){
                mayor_nota = nota;
            }
        }

        return mayor_nota;
    }

    public float promedio_nota(String materia){
        float promedio = 0.f;

        for (Float n : notas_por_materia.get(materia)) {
            promedio += n;
        }

        promedio = promedio / notas_por_materia.get(materia).size();

        return promedio;
    }

    public void agregar_materia(String nombre_materia){
        notas_por_materia.put(nombre_materia, new ArrayList<Float>());
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
