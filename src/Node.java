import org.jetbrains.annotations.Contract;

/**
 * Node类 节点信息
 * 保存数据与下一个节点信息
 */
public class Node {
    private String data;
    private Node next;
    @Contract(pure = true)
    public Node(String data)
    {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
