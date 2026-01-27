package reto3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Reto3 {

    public static void main(String[] args) {

        String mensaje = "Hola";
        Function<String, String> repetidor = eco -> (repetir(eco));
        System.out.println(repetidor.apply(mensaje));
        System.out.println(supereco(mensaje));
    }

    /**
     * Método del Estudiante A(Eduardo Rico)
     * Usa StringBuilder y InTstream() para repetir el mensaje 3 veces
     */
    public static String repetir(String mensaje) {
        StringBuilder sb = new StringBuilder(mensaje);
        IntStream.range(0,2)
                .forEach(i-> sb.append(" ").append(mensaje));
        return sb.toString();

    }

    public static String supereco(String mensaje) {
        Function<String, String> crearEco = texto -> invertir(repetir(texto));
        String eco = crearEco.apply(mensaje);
        return eco;
    }

    public static String invertir(String mensaje){
        return "ss";
    }


}
