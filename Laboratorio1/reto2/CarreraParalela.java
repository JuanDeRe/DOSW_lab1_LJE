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

}