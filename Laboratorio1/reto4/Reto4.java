package reto4;
import java.util.*;

public class Reto4
{
    public static Hashtable<String, Integer> createHashtableB(Map<String, Integer> treasureMap)
    {
        Hashtable<String, Integer> table = new Hashtable<>();
        for (Map.Entry<String,Integer> entrada : treasureMap.entrySet())
        {
            table.putIfAbsent(entrada.getKey(),entrada.getValue());
        }
        return table;
    }

    public static void main(String[] args)
    {
        Map<String, Integer> mapaEntrada = new HashMap<>();
        mapaEntrada.put("plata", 8);
        mapaEntrada.put("rubí", 4);
        mapaEntrada.put("oro", 12);
        mapaEntrada.put("esmeralda", 6);

        Hashtable<String, Integer> resultMap = createHashtableB(mapaEntrada);

        System.out.println("***Hashtable - EB***");
        resultMap.forEach((k,v)-> System.out.println(k + "|" + v));
    }
}