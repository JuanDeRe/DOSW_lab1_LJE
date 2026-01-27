package reto4;
import java.util.*;

public class Reto4
{
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

    public static void main(String[] args)
    {
        Map<String, Integer> mapaEntrada = new HashMap<>();
        mapaEntrada.put("plata", 8);
        mapaEntrada.put("rubí", 4);
        mapaEntrada.put("oro", 12);
        mapaEntrada.put("esmeralda", 6);

        Hashtable<String, Integer> resultMap = createHashtableB(mapaEntrada);

        System.out.println("Hashtable - EB");
        resultMap.forEach((k,v)-> System.out.println(k + "|" + v));
    }
}