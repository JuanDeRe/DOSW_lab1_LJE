
import java.util.List;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

class Estudiante {

    private String nombre;
    private int edad;
    private String correo;
    private int semestre;

    public Estudiante(String nombre, int edad, String correo, int semestre) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public int getSemestre() {
        return semestre;
    }
}

public class Reto1 {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante(
                "Luiza Gonzales",
                22,
                "luiza.gonzalez-v@mail.escuelaing.edu.co",
                7
        );

        Estudiante e2 = new Estudiante(
                "Juan David Roa",
                22,
                "juan.roa-h@mail.escuelaing.edu.co",
                7
        );

        Estudiante e3 = new Estudiante(
                "Eduardo Rico",
                24,
                "eduardo.rico@mail.escuelaing.edu.co",
                7
        );

        List<Estudiante> estudiantes = Arrays.asList(e1, e2, e3);

        Function<Estudiante, String> mensajeBienvenida = e ->
                e.getNombre() + ", estudiante de " +
                e.getSemestre() + "° semestre de " +
                e.getEdad() + " años, correo: " +
                e.getCorreo();

        String mensajeFinal = estudiantes.stream()
                .map(mensajeBienvenida)
                .collect(Collectors.joining(", y "));

        System.out.println(
                "¡Hola, bienvenidos! Nosotros somos el grupo conformada por "
                + mensajeFinal + "."
        );
    }
}

