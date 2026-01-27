import java.util.HashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Random;
import java.util.Collection;

public class Reto5 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        HashSet<Integer> listaH= generadorHashSet(lista);

        List<Integer> numbersTreeSet = Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4);
        TreeSet<Integer> listaT = createTreeSetB(numbersTreeSet);

        TreeSet<Integer> result = unionSets(listaH, listaT);
        printResults(result);
    }
    public static HashSet<Integer> generadorHashSet() {
        return procesarHashSet(numerosAleatorios());
    }
    public static HashSet<Integer> generadorHashSet(Collection<Integer> coleccion) {
        return procesarHashSet(coleccion);
    }
    public static TreeSet<Integer> createTreeSetB(Collection<Integer> coleccion)
    {
        return coleccion.stream().filter(n -> n % 5 != 0).collect(Collectors.toCollection(TreeSet::new));
    }
    private static void printResults(TreeSet<Integer> tree)
    {
        tree.forEach(n -> System.out.println("Número en arena: " + n));
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