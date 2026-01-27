import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class CarreraParalela
{
    public static void main(String[] args)
    {
        System.out.println("Carrera en paralelo-LJE");
        List lista = new ArrayList(Arrays.asList(4,42,11,4,6,7,1));
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

    public static boolean verificarMultiploDeDos(Integer numero){
        boolean verificacion = (numero % 2 == 0) ? true : false;
        return verificacion;
    }

    public static Resultado calculoResultado(List<Integer> lista){
        Integer cant = cantidadElementos(lista);
        Integer max = numeroMax(lista);
        Integer min = numeroMin(lista);
        boolean verificacion = verificarMultiploDeDos(max);
        Resultado calculo = new Resultado(max, min, cant, verificacion);
        return calculo;
    }

    private static class Resultado {
        public Integer maximo;
        public Integer minimo;
        public Integer cantidad;
        public boolean maximoMultiploDeDos;

        public Resultado(Integer maximo, Integer minimo, Integer cantidad, boolean maximoMultiploDeDos) {
            this.maximo = maximo;
            this.minimo = minimo;
            this.cantidad = cantidad;
            this.maximoMultiploDeDos = maximoMultiploDeDos;
        }

        public void imprimir() {
            System.out.println("Maximo: " + maximo);
            System.out.println("Minimo: " + minimo);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("MaximoMultiploDeDos: " + maximoMultiploDeDos);
        }
    }
}
