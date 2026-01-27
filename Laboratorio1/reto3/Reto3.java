import java.util.function.Function;

public class Reto3 {
    public static void main(String[] args) {
        String mensaje = "Hola";
        System.out.println(supereco(mensaje));
    }

    public static String repetir(String texto) {
        return "a";
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