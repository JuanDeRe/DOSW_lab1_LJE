import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class CarreraParalela
{
    public static void main(String[] args)
    {
        System.out.println("Carrera en paralelo-LJE");
        List lista = new ArrayList(Arrays.asList(4,43,11,4,6,7,1));
        calculoResultado(lista).imprimir();
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
    public static Resultado calculoResultado(List<Integer> lista){
        Integer cant = cantidadElementos(lista);
        Integer max = numeroMax(lista);
        Integer min = numeroMin(lista);
        Resultado calculo = new Resultado(cant, max, min);
        return calculo;
    }

    private static class Resultado {
        public Integer maximo;
        public Integer minimo;
        public Integer cantidad;

        public Resultado(Integer maximo, Integer minimo, Integer cantidad) {
            this.maximo = maximo;
            this.minimo = minimo;
            this.cantidad = cantidad;
        }

        public void imprimir() {
            System.out.println("Maximo: " + maximo);
            System.out.println("Minimo: " + minimo);
            System.out.println("Cantidad: " + cantidad);
        }
    }
}
