import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Node {
    public int field;
    public Node left = null;
    public Node right = null;

    private boolean hasNext(Node node) {
        return left != null;
    }

    public Node (){}
    public Node(Integer field){
        this.field = field;
    }
}
