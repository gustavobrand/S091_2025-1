package aula13.Iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.sun.source.tree.Tree;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(5);
		arrayList.add(20);
		arrayList.add(100);
		
		Iterator<Integer> it = arrayList.iterator();
		
		while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }	

	}

}
