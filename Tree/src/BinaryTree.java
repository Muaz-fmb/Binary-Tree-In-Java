import java.util.Stack;

public class BinaryTree {

    public boolean isoperator ( char c){
        if (c == '+' || c == '-' || c == '*' || c == '/') {
            return true;
        }
        return false;
    }

  public Node BinaryTree(String postfix) {
      Stack<Node> stack = new Stack<Node>();
      Node temp;

      for (int i = 0; i < postfix.length(); i++) {
          if (!isoperator(postfix.charAt(i))) {
              temp = new Node(postfix.charAt(i)+"");
              stack.push(temp);
          }else {
                temp = new Node(postfix.charAt(i)+"");
                temp.RightChild = stack.pop();
                temp.LeftChild = stack.pop();
                stack.push(temp);
          }
      }
      temp = stack.pop();
      return temp;
  }







}
