package aula13.Iteradores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sun.source.tree.Tree;

public class Teste {

	public static void main(String[] args) {
		// 1. ArrayList (implementa List)
        System.out.println("--- Iterando em um ArrayList ---");
        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Abacaxi");

        Iterator<String> iteradorFrutas = frutas.iterator();
        while (iteradorFrutas.hasNext()) {
            String fruta = iteradorFrutas.next();
            System.out.println(fruta);
        }
        System.out.println();

        // 2. LinkedList (implementa List)
        System.out.println("--- Iterando em um LinkedList ---");
        List<Integer> numeros = new LinkedList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        Iterator<Integer> iteradorNumeros = numeros.iterator();
        while (iteradorNumeros.hasNext()) {
            Integer numero = iteradorNumeros.next();
            System.out.println(numero);
        }
        System.out.println();

        // 3. HashMap (implementa Map)
        System.out.println("--- Iterando em um HashMap (entradas) ---");
        Map<String, String> capitais = new HashMap<>();
        capitais.put("Brasil", "Brasília");
        capitais.put("Argentina", "Buenos Aires");
        capitais.put("Portugal", "Lisboa");
        capitais.put("Espanha", "Madri");

        // Para iterar em um Map, você pode iterar sobre o conjunto de entradas (entrySet)
        Iterator<Map.Entry<String, String>> iteradorCapitais = capitais.entrySet().iterator();
        while (iteradorCapitais.hasNext()) {
            Map.Entry<String, String> entrada = iteradorCapitais.next();
            System.out.println("País: " + entrada.getKey() + ", Capital: " + entrada.getValue());
        }
        System.out.println();

        // Você também pode iterar sobre as chaves (keySet) ou os valores (values)
        System.out.println("--- Iterando em um HashMap (apenas chaves) ---");
        Iterator<String> iteradorChaves = capitais.keySet().iterator();
        while (iteradorChaves.hasNext()) {
            String pais = iteradorChaves.next();
            System.out.println("País: " + pais);
        }
        System.out.println();

        System.out.println("--- Iterando em um HashMap (apenas valores) ---");
        Iterator<String> iteradorValores = capitais.values().iterator();
        while (iteradorValores.hasNext()) {
            String capital = iteradorValores.next();
            System.out.println("Capital: " + capital);
        }
        System.out.println();

        // 4. HashSet (implementa Set)
        System.out.println("--- Iterando em um HashSet ---");
        Set<Double> precos = new HashSet<>();
        precos.add(19.99);
        precos.add(9.50);
        precos.add(25.00);
        precos.add(9.50); // Elementos duplicados não são adicionados em um HashSet

        Iterator<Double> iteradorPrecos = precos.iterator();
        while (iteradorPrecos.hasNext()) {
            Double preco = iteradorPrecos.next();
            System.out.println(preco);
        }
        System.out.println();
        
        
    }	

}

