public class Evaluation {
    public int evaluateTree(Node root){
        if (root == null) return 0;
        int left = evaluateTree(root.LeftChild);
        int right = evaluateTree(root.RightChild);

        switch (root.data){
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
                return left / right;
            default:
                return Integer.parseInt(root.data + "");
        }

    }
}
