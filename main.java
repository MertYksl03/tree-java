public class main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);

        tree.insert( 2);
        tree.insert( 3);
        tree.insert( 4);
        tree.insert( 5);
        tree.insert( 6);
        tree.insert( 7);
        tree.insert( 8);
        tree.insert( 9);
        tree.insert( 10);
        tree.insert( 11);
        tree.insert( 12);
        tree.insert( 13);
        tree.insert( 13);

        System.out.println("In Order:");
        tree.printInOrder(tree.root);
        System.out.println("\nPre Order:");
        tree.printPreOrder(tree.root);
        System.out.println("\nPost Order:");
        tree.printPostOrder(tree.root);
    }
}