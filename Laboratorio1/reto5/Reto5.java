package reto5;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Collection;

public class Reto5
{
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
    public static void main(String[] args)
    {
        List<Integer> numbersTreeSet = Arrays.asList(25,29,27,15,4,6,10,8,28);
        TreeSet<Integer> result = createTreeSetB(numbersTreeSet);
        printResults(result);
    }
}