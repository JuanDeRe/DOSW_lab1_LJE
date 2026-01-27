



import java.util.*;
import java.util.Hashtable;

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

    /**
     * Método que crea un Hashtable a partir de pares clave-valor
     * Ignora claves duplicadas (conserva el primer valor encontrado)
     * Asegura la sincronización
     * @param treasureMap
     * @return la hashtable creada
     */
    public static Hashtable<String, Integer> createHashtableB(Map<String, Integer> treasureMap)
    {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        // Usar lambda para procesar cada par
        treasureMap.forEach((key, value) -> {hashtable.putIfAbsent(key, value);
        });
        return hashtable;
    }

    // Método para combinar los mapas
    public static HashMap<String, Integer> combinarMapas(
            Map<String, Integer> hashMap,
            Hashtable<String, Integer> hashTable) {

        HashMap<String, Integer> resultado = new HashMap<>(hashMap);

        //Hashtable tiene prioridad
        hashTable.forEach((key, value) -> resultado.put(key, value));

        return resultado;
    }

    public static void main(String[] args) {

        List<Map.Entry<String, Integer>> entradasHashMap = List.of(
                Map.entry("oro", 5),
                Map.entry("plata", 3),
                Map.entry("oro", 7),
                Map.entry("diamante", 10)
        );

        Map<String, Integer> hashMap = crearHashMap(entradasHashMap);

        Map<String, Integer> mapaEntrada = new Hashtable<>();
        mapaEntrada.put("plata", 8);
        mapaEntrada.put("rubí", 4);
        mapaEntrada.put("oro", 12);
        mapaEntrada.put("esmeralda", 6);

        Hashtable<String, Integer> resultMap = createHashtableB(mapaEntrada);

        //Salida
        HashMap <String, Integer> mapafinal = combinarMapas(hashMap,resultMap);
        mapafinal.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(e -> "Clave: " + e.getKey() + " | Valor: " + e.getValue())
                .forEach(System.out::println);

}
}