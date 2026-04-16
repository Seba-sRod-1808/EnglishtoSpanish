package tree;

import model.Association;

public class Node<K extends Comparable<K>, V> {

    public Association<K, V> data;
    public Node<K, V> left;
    public Node<K, V> right;

    public Node(Association<K, V> data) {
        this.data = data;
    }
}
