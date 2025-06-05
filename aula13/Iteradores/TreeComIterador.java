package aula13.Iteradores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Stack; // Usaremos Stack para o iterador de árvore

public class TreeComIterador  {

    public static void main(String[] args) {

        // ... (Seu código anterior para ArrayList, LinkedList, HashMap, HashSet pode ir aqui) ...

        System.out.println("--- Iterando em uma Árvore Binária Simples (In-Order) ---");
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        Iterator<Integer> iteradorArvore = tree.iterator();
        while (iteradorArvore.hasNext()) {
            Integer valor = iteradorArvore.next();
            System.out.println(valor);
        }
        System.out.println();
    }
}

// Classe para um Nó da Árvore Binária
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Classe para a Árvore Binária
class BinaryTree implements Iterable<Integer> {
    private TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    // Método para inserir um valor na árvore
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private TreeNode insertRecursive(TreeNode current, int data) {
        if (current == null) {
            return new TreeNode(data);
        }

        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        } else {
            // Valor já existe, pode-se ignorar ou tratar de outra forma
            return current;
        }
        return current;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new InOrderIterator(root);
    }

    // Classe interna para o Iterador In-Order
    private class InOrderIterator implements Iterator<Integer> {
        private Stack<TreeNode> stack;

        public InOrderIterator(TreeNode root) {
            stack = new Stack<>();
            pushAllLeft(root); // Preenche a pilha com os nós mais à esquerda
        }

        private void pushAllLeft(TreeNode node) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            TreeNode current = stack.pop();
            pushAllLeft(current.right); // Prepara a pilha para o próximo sub-nó
            return current.data;
        }

        @Override
        public void remove() {
            // A remoção em um iterador de árvore pode ser complexa e exige cuidado
            // Para este exemplo, deixamos como não suportada
            throw new UnsupportedOperationException("Remoção não suportada pelo iterador de árvore.");
        }
    }
}
