import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Random;
import java.util.Collection;

public class Reto5 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(3,9,12,6,1,2));
        System.out.println(generadorHashSet(lista));
    }
    public static HashSet<Integer> generadorHashSet() {
        return procesarHashSet(numerosAleatorios());
    }
    public static HashSet<Integer> generadorHashSet(Collection<Integer> coleccion) {
        return procesarHashSet(coleccion);
    }

    public static TreeSet<Integer> unionSets(HashSet<Integer> hash, TreeSet<Integer> tree) {
        TreeSet<Integer> union = new TreeSet<>();
        union.addAll(hash);
        union.addAll(tree);
        return union;
    }

    private static void imprimirResultados(TreeSet<Integer> tree) {
        tree.stream().forEach(n -> System.out.println("Numero en arena: " + n));
    }

    private static HashSet<Integer> procesarHashSet(Collection<Integer> coleccion) {
        return coleccion.stream().filter(n -> n % 3 != 0).collect(Collectors.toCollection(HashSet::new));
    }
    private static ArrayList<Integer> numerosAleatorios() {
        ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int numero = random.nextInt(20);
            numerosAleatorios.add(numero);
        }
        return numerosAleatorios;
    }
}