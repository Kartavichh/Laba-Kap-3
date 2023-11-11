import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Задача 23. Дано бинарное дерево.Вывести максимальное из значений его
//                   внутренних вершин (т. е. вершин, не являющихся листьями)
        Tree tree = new Tree();
        Scanner scanner = new Scanner(System.in);
        if (Objects.equals(scanner.nextLine(), "file")){
            File file = new File("C:\\Users\\sukha\\IdeaProjects\\Laba_kap3\\src\\text.txt");

            scanner = new Scanner(file);
            scanner.useDelimiter(" ");
            while (scanner.hasNext()) {
                tree.insertNode(scanner.nextInt());
            }
        }
        System.out.println("Введите значения Node, для выхода введите любую букву");
        while (scanner.hasNextInt()){
            tree.insertNode(scanner.nextInt());
        }
//        tree.insertNode(1);
//        tree.insertNode(2);
//        tree.insertNode(3);
//        tree.insertNode(4);
//        tree.insertNode(5);
//        tree.insertNode(6);
//        tree.insertNode(7);
//        tree.insertNode(10);
//        tree.insertNode(9);
//        Tree.printTree(tree.rootNode);
        System.out.printf("Mаксимальное значение его внутренних вершин %d", Tree.max(tree.rootNode));
    }
}