package L17_Iterator.binarytreeiterator;

public class Main {

    public static void main(String[] args) {
        Node<Integer> root = new Node<>(1);
        Node<Integer> leftNode = new Node<>(2);
        Node<Integer> rightNode = new Node<>(3);
        leftNode.setParent(root);
        rightNode.setParent(root);
        root.setLeft(leftNode);
        root.setRight(rightNode);
/*
        CustomIterator<Integer> it = new CustomIterator<>(root);

        while (it.hasNext()) {
            System.out.print("" + it.next() + "-");
        }
        System.out.println();*/

        BinaryTree<Integer> tree = new BinaryTree<>(root);
        for (int n : tree) {
            System.out.print(n + "-");
        }
        System.out.println();
    }
}
