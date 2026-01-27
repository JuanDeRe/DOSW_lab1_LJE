import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Reto3 {
    public static void main(String[] args) {
        String mensaje = "Hola";
        System.out.println(supereco(mensaje));
    }

    public static String repetir(String mensaje) {
        StringBuilder sb = new StringBuilder(mensaje);
        IntStream.range(0,2)
                .forEach(i-> sb.append(" ").append(mensaje));
        return sb.toString();

    }
    public static String invertir(String mensaje) {
        StringBuffer sb = new StringBuffer(mensaje);
        String inverso = sb.reverse().toString();
        return inverso;
    }
    public static String supereco(String mensaje) {
        Function<String, String> crearEco = texto -> invertir(repetir(texto));
        String eco = crearEco.apply(mensaje);
        return eco;
    }
}