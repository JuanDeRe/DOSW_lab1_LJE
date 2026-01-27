

import java.util.*;

public class Reto4 {

    // Estudiante A Eduardo Rico
    public static Map<String, Integer> crearHashMap(List<Map.Entry<String, Integer>> entradas) {

        Map<String, Integer> mapa = new HashMap<>();

        entradas.forEach(entrada -> {
            if (!mapa.containsKey(entrada.getKey())) {
                mapa.put(entrada.getKey(), entrada.getValue());
            }
        });

        return mapa;
    }

    // Método para combinar los mapas
    public static Map<String, Integer> combinarMapas(
            Map<String, Integer> hashMap,
            Hashtable<String, Integer> hashTable) {

        return new HashMap<>();
    }

    public static void main(String[] args) {

        List<Map.Entry<String, Integer>> entradasHashMap = List.of(
                Map.entry("oro", 5),
                Map.entry("plata", 3),
                Map.entry("oro", 7),
                Map.entry("diamante", 10)
        );

        Map<String, Integer> hashMap = crearHashMap(entradasHashMap);

        //Salida
        hashMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(e -> "Clave: " + e.getKey() + " | Valor: " + e.getValue())
                .forEach(System.out::println);
    }
}