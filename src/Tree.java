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
                if (field.equals(currentNode.getField())) {
                    return;
                } else if (field < currentNode.getField()) {
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
//    public Tree printTree(Tree tree){
//        fot
//        return tree;
//    }
}
