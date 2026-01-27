
import java.util.*;
import java.util.function.Function;


public class CarreraParalela
{
    public static void main(String[] args)
    {
        System.out.println("Carrera en paralelo-LJE");
        List<Integer> array = new ArrayList<>(Arrays.asList(7,2,6,19,23,1,90));
        Resultado r = fusionarFunciones(array);
        System.out.println("Maximo: " + r.maximo);
        System.out.println("Minimo " + r.minimo);
        System.out.println("Cantidad"+ r.cantidad);
    }

    public static Integer numeroMax(List<Integer> lista){
        Function<List<Integer>,Integer> maximo = arreglo -> arreglo.stream().max(Integer::compareTo).orElse(null);
        Integer max = maximo.apply(lista);
        return max;
    }
    public static Integer numeroMin(List<Integer> lista){
        Function<List<Integer>,Integer> minimo = array -> array.stream().min(Integer::compareTo).orElse(null);
        Integer min = minimo.apply(lista);
        return min;
    }

    public static Integer cantidadElementos(List<Integer> lista){
        Function<List<Integer>,Integer> cantidad = array -> array.size();
        Integer cant = cantidad.apply(lista);
        return cant;
    }

    public static Resultado fusionarFunciones(List<Integer> lista)
    {
        Integer cantidad = cantidadElementos(lista);
        Integer minimo = numeroMin(lista);
        Integer maximo = numeroMax(lista);

        Resultado result = new Resultado(maximo,minimo,cantidad);
        return result;
    }
    private static class Resultado
    {
        public Integer maximo;
        public Integer minimo;
        public Integer cantidad;

        public Resultado(Integer maximo, Integer minimo, Integer cantidad)
        {
            this.maximo = maximo;
            this.minimo = minimo;
            this.cantidad = cantidad;
        }

    }
}
