package L17_Iterator.binarytreeiterator;

class Node<T> {

    public Node<T> left;
    public Node<T> right;
    public Node<T> parent;
    public T value;

    public Node(T value) {
        this.value = value;
    }

    public Node(Node<T> left, Node<T> right, T value) {
        this.left = left;
        this.right = right;
        this.value = value;

        right.parent = this;
        left.parent = this;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
