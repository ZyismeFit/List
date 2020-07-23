
public class TestList {
    public static void main(String[] args) {
        Node node = new Node("zy");
        Node node1 = new Node("is");
        Node node2 = new Node("me");
        node.setNext(node1);
        node1.setNext(node2);
        System.out.println(node.getNext().getNext().getData());
    }
}

