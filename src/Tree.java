public class Tree {
    public Node rootNode = null;
    public void insertNode(Integer field) {
        Node newNode = new Node(field);
        if (rootNode == null) {
            rootNode = newNode;
        } else {
            Node currentNode = rootNode;
            Node parentNode;
            while (true)
            {
                parentNode = currentNode;
                if (field.equals(currentNode.field)) {
                    return;
                } else if (field < currentNode.field) {
                    currentNode = currentNode.left;
                    if (currentNode == null) {
                        parentNode.left = newNode;
                        return;
                    }
                } else {
                    currentNode = currentNode.right;
                    if (currentNode == null) {
                        parentNode.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    public static void printTree(Node node){
        if (node != null) {
            System.out.println(node.field);
            printTree(node.left);
            printTree(node.right);
        }
    }
    public static int max(Node node) {
        if (node == null || node.checkForList()) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(Math.max(max(node.left), max(node.right)), node.field);
        }
    }
}
