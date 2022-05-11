import java.util.Locale;

public class Traversing {

    public void Preorder(Node root){
        if (root == null) return;
        System.out.print(root.data+" ");
        Preorder(root.LeftChild);
        Preorder(root.RightChild);
    }

    public void Postorder(Node root){
        if (root == null) return;
        Postorder(root.LeftChild);
        Postorder(root.RightChild);
        System.out.print(root.data+" ");
    }

    public void Inorder(Node root){
        if (root == null) return;
        Inorder(root.LeftChild);
        System.out.print(root.data+" ");
        Inorder(root.RightChild);
    }


    void printCurrentLevel(Node root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.LeftChild, level - 1);
            printCurrentLevel(root.RightChild, level - 1);
        }
    }

    int height(Node root)
    {
        if (root == null)
            return 0;
        else {
            int lheight = height(root.LeftChild);
            int rheight = height(root.RightChild);

            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }


}
