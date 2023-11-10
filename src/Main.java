
public class Main {
    public static void main(String[] args) {
//        Задача 23. Дано бинарное дерево.Вывести максимальное из значений его
//                   внутренних вершин (т. е. вершин, не являющихся листьями)
        Tree tree = new Tree();
        tree.insertNode(1);
        tree.insertNode(2);
        tree.insertNode(3);
        tree.insertNode(4);
        tree.insertNode(5);
        tree.insertNode(6);
        tree.insertNode(7);
        tree.insertNode(8);
        tree.insertNode(9);
        tree.insertNode(3);
        tree.printTree(tree);
    }
}