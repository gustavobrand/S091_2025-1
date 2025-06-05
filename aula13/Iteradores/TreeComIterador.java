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
import java.util.Stack; // Usaremos Stack para o iterador de �rvore

public class TreeComIterador  {

    public static void main(String[] args) {

        // ... (Seu c�digo anterior para ArrayList, LinkedList, HashMap, HashSet pode ir aqui) ...

        System.out.println("--- Iterando em uma �rvore Bin�ria Simples (In-Order) ---");
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

// Classe para um N� da �rvore Bin�ria
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

// Classe para a �rvore Bin�ria
class BinaryTree implements Iterable<Integer> {
    private TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    // M�todo para inserir um valor na �rvore
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
            // Valor j� existe, pode-se ignorar ou tratar de outra forma
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
            pushAllLeft(root); // Preenche a pilha com os n�s mais � esquerda
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
            pushAllLeft(current.right); // Prepara a pilha para o pr�ximo sub-n�
            return current.data;
        }

        @Override
        public void remove() {
            // A remo��o em um iterador de �rvore pode ser complexa e exige cuidado
            // Para este exemplo, deixamos como n�o suportada
            throw new UnsupportedOperationException("Remo��o n�o suportada pelo iterador de �rvore.");
        }
    }
}
