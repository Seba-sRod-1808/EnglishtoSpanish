package tree;

import model.Association;

public class BinaryTree<K extends Comparable<K>, V> {

    private Node<K, V> root;

    public void insert(Association<K, V> value) {
        root = insertRec(root, value);
    }

    private Node<K, V> insertRec(Node<K, V> node, Association<K, V> value) {

        if (node == null) return new Node<>(value);

        if (value.compareTo(node.data) < 0) {
            node.left = insertRec(node.left, value);
        } else {
            node.right = insertRec(node.right, value);
        }

        return node;
    }

    public V search(K key) {
        return searchRec(root, key);
    }

    private V searchRec(Node<K, V> node, K key) {

        if (node == null) return null;

        int cmp = key.compareTo(node.data.getKey());

        if (cmp == 0) return node.data.getValue();
        if (cmp < 0) return searchRec(node.left, key);

        return searchRec(node.right, key);
    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node<K, V> node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.println(node.data);
            inOrderRec(node.right);
        }
    }
}
