public class main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Traversing t = new Traversing();

        System.out.print("Inorder:   ");
        t.Inorder(bt.BinaryTree("23*84/+"));
        System.out.println();

        System.out.print("PreOrder: ");
        t.Preorder(bt.BinaryTree("23*84/+"));
        System.out.println();

        System.out.print("Postorder: ");
        t.Postorder(bt.BinaryTree("23*84/+"));
        System.out.println();

        System.out.print("LevelOrder: ");
        int height = t.height(bt.BinaryTree("23*84/+"));
        for (int i = height; i > 0; i--) {
            t.printCurrentLevel(bt.BinaryTree("23*84/+") , i);
        }
    }
}
