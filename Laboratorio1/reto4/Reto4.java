import java.util.*;
import java.util.Hashtable;
import java.util.stream.Collectors;
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
     *
     * @param treasureMap
     * @return la hashtable creada
     */
    public static Hashtable<String, Integer> createHashtableB(Map<String, Integer> treasureMap) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        // Usar lambda para procesar cada par
        treasureMap.forEach((key, value) -> {
            hashtable.putIfAbsent(key, value);
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

    /**
     * Función que convierte todas las claves a mayúsculas antes de imprimir
     *
     * @param mapa el mapa a procesar
     */
    public static void imprimirConMayusculas(Map<String, Integer> mapa) {
        mapa.entrySet().stream().map(e -> "Clave: " + e.getKey().toUpperCase() + " | Valor: " + e.getValue()).forEach(System.out::println);
    }

    /**
     * Función que ordena las claves de forma ascendente antes de imprimir
     *
     * @param mapa el mapa a procesar
     */
    public static void imprimirOrdenado(Map<String, Integer> mapa) {
        mapa.entrySet().stream().sorted(Map.Entry.comparingByKey()).map(e -> "Clave: " + e.getKey() + " | Valor: " + e.getValue())
                .forEach(System.out::println);
    }

    /**
     * FUNCIÓN FINAL UNIFICADA
     * Combina HashMap y Hashtable, prioriza Hashtable, convierte a mayúsculas
     * y ordena en forma ascendente usando Collectors.toMap() y lambda
     */
    public static void fusionFinal(Map<String, Integer> hashMap, Hashtable<String, Integer> hashtable) {
        Map<String, Integer> combinado = new HashMap<>(hashMap);
        combinado.putAll(hashtable);
        //requisito Collectors.toMap() con lambda
        combinado.entrySet().stream().collect(Collectors.toMap(e -> e.getKey().toUpperCase(),
                Map.Entry::getValue, (v1, v2) -> v2, TreeMap::new)).forEach((clave, valor) -> System.out.println("Clave: " + clave + "| Valor: " + valor));
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

        fusionFinal(hashMap, resultMap);
    }
}