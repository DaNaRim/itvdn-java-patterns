package L17_Iterator.binarytreeiterator;

import java.util.Iterator;

public class BinaryTree<T> implements Iterable<T> {

    private Node<T> root;

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator<>(root);
    }

}
