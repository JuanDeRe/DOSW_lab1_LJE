import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class CarreraParalela
{
    public static void main(String[] args)
    {
        System.out.println("Carrera en paralelo-LJE");
        List lista = new ArrayList(Arrays.asList(4,42,11,4,6,7,1));
        List lista2 = new ArrayList(Arrays.asList(4,0,8,6,2));
        CarreraParalela carrera = new CarreraParalela();
        carrera.calculoResultado(lista).imprimir();
        carrera.calculoResultado(lista2).imprimir();
        carrera.calculoResultadoDosListas(lista,lista2);

    }

    public Integer numeroMax(List<Integer> lista){
        Function<List<Integer>,Integer> maximo = arreglo -> arreglo.stream().max(Integer::compareTo).orElse(null);
        Integer max = maximo.apply(lista);
        return max;
    }
    public Integer numeroMin(List<Integer> lista){
        Function<List<Integer>,Integer> minimo = array -> array.stream().min(Integer::compareTo).orElse(null);
        Integer min = minimo.apply(lista);
        return min;
    }

    public Integer cantidadElementos(List<Integer> lista){
        Function<List<Integer>,Integer> cantidad = array -> array.size();
        Integer cant = cantidad.apply(lista);
        return cant;
    }

    public boolean verificarMultiploDeDos(Integer numero){
        boolean verificacion = (numero % 2 == 0) ? true : false;
        return verificacion;
    }
    public boolean maximoDivisorDos(Integer numero){
        boolean verificacion = (( numero != 0 || numero != null) && (2 % numero == 0)) ? true : false;
        return verificacion;
    }
    public boolean verificacionCantidadImpar(Integer numero){
        boolean verificacion = (( numero != 0 || numero != null) && ( numero % 2 != 0)) ? true : false;
        return verificacion;
    }
    public void calculoResultadoDosListas(List<Integer> lista1, List<Integer> lista2) {

        Resultado resultadoL1 =  calculoResultado(lista1);
        Resultado resultadoL2 =  calculoResultado(lista2);
        Resultado resultadoTotal = new Resultado(resultadoL1,resultadoL2);
        resultadoTotal.imprimirPorLista();
    }


    public Resultado calculoResultado(List<Integer> lista){
        Integer cant = cantidadElementos(lista);
        Integer max = numeroMax(lista);
        Integer min = numeroMin(lista);
        boolean verificacion = verificarMultiploDeDos(max);
        boolean verificacionDivisor = maximoDivisorDos(max);
        boolean verificacionCantPar = verificarMultiploDeDos(cant);
        boolean verificacionCantidadImpar = verificacionCantidadImpar(cant);
        Resultado calculo = new Resultado(max, min, cant, verificacion, verificacionDivisor,verificacionCantPar,verificacionCantidadImpar);

        return calculo;
    }

    private class Resultado {
        public Integer maximo;
        public Integer minimo;
        public Integer cantidad;
        public boolean maximoMultiploDeDos;
        public boolean maximoDivisorDos;
        public boolean cantidadMultiploDeDos;
        public boolean cantidadImpar;
        public List<Integer> maximoPorLista;
        public List<Integer> minimoPorLista;
        public List<Integer> elementosPorLista;
        public List<String> divisibilidadMayorPorLista;
        public List<String> paridadElementosPorLista;



        public Resultado(Integer maximo, Integer minimo, Integer cantidad, boolean maximoMultiploDeDos, boolean maximoDivisorDos,boolean cantidadMultiploDeDos, boolean cantidadImpar) {
            this.maximo = maximo;
            this.minimo = minimo;
            this.cantidad = cantidad;
            this.maximoMultiploDeDos = maximoMultiploDeDos;
            this.maximoDivisorDos = maximoDivisorDos;
            this.cantidadImpar = cantidadImpar;
            this.cantidadMultiploDeDos = cantidadMultiploDeDos;
        }

        public Resultado(Resultado resultado1, Resultado resultado2) {
            this.maximoPorLista = new ArrayList<>(Arrays.asList(resultado1.maximo, resultado2.maximo));
            this.minimoPorLista = new ArrayList<>(Arrays.asList(resultado1.minimo, resultado2.minimo));
            this.elementosPorLista = new ArrayList<>(Arrays.asList(resultado1.cantidad, resultado2.cantidad));
            this.divisibilidadMayorPorLista = calcularDivisibilidadMayorPorLista(resultado1,resultado2);
            this.paridadElementosPorLista = new ArrayList<>(Arrays.asList(resultado1.cantidadMultiploDeDos ? "Es par" : "Es impar", resultado2.cantidadMultiploDeDos ? "Es par" : "Es impar"));
        }
        private ArrayList<String> calcularDivisibilidadMayorPorLista(Resultado resultado1, Resultado resultado2) {
            ArrayList<String> divisibilidadMayorPorLista = new ArrayList<>();
            divisibilidadMayorPorLista.add(
                    "Máximo múltiplo de 2: " + resultado1.maximoMultiploDeDos +
                            "\nMáximo divisor de 2: " + resultado1.maximoDivisorDos
            );
            divisibilidadMayorPorLista.add(
                    "Máximo múltiplo de 2: " + resultado2.maximoMultiploDeDos +
                            "\nMáximo divisor de 2: " + resultado2.maximoDivisorDos
            );
            return divisibilidadMayorPorLista;
        }



        public void imprimir() {
            System.out.println("Maximo: " + maximo);
            System.out.println("Minimo: " + minimo);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("MaximoMultiploDeDos: " + maximoMultiploDeDos);
            System.out.println("MaximoDivisorDos: " + maximoDivisorDos);
            System.out.println("CantidadMultiploDeDos: " + cantidadMultiploDeDos);
            System.out.println("CantidadImpar: " + cantidadImpar);
        }
        public void imprimirPorLista() {
            IntStream.range(0, maximoPorLista.size())
                    .forEach(i -> {
                        System.out.println("\nLista " + (i + 1) + ":");

                        System.out.println("  Máximo: " + maximoPorLista.get(i));
                        System.out.println("  Mínimo: " + minimoPorLista.get(i));
                        System.out.println("  Cantidad de elementos: " + elementosPorLista.get(i));
                        System.out.println("  Paridad de cantidad: " + paridadElementosPorLista.get(i));

                        System.out.println("  Divisibilidad del máximo:");
                        System.out.println("    " + divisibilidadMayorPorLista.get(i));
                    });
        }
    }
}