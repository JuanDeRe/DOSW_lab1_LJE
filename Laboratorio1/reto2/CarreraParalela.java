package reto2;

import java.util.List;


public class CarreraParalela
{
    public static void main(String[] args)
    {
        System.out.println("Carrera en paralelo-LJE")
    }

    public static Integer numeroMax(List<Integer> lista){
        Function<List<Integer>,Integer> maximo = arreglo -> arreglo.stream().max(Integer::compareTo);
        Integer max = maximo.apply(lista);
        return max;
    }
    public static Integer numeroMin(List<Integer> lista){
        Fuction<List<Integer>,Integer> minimo = array -> array.stream().min(Integer::compareTo);
        Integer min = minimo.apply(lista);
        return min;
    }

    public static Integer cantidadElementos(List<Integer> lista){
        Function<List<Integer>,Integer> cantidad = array -> array.size();
        Integer cant = cantidad.apply(lista);
        return cant;
    }
}