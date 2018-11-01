package tests.test20181101;

public class Main {
    public static void main(String[] args) {
        GraphNode<String> node1 = new GraphNode<>("n1");
        GraphNode<String> node2 = new GraphNode<>("n2");
        GraphNode<String> node3 = new GraphNode<>("n3");
        GraphNode<String> node4 = new GraphNode<>("n4");
        GraphNode<String> node5 = new GraphNode<>("n5");

        node1.addNode(node2);
        node1.addNode(node5);

        node2.addNode(node1);
        node2.addNode(node3);

        node3.addNode(node2);
        node3.addNode(node4);

        node4.addNode(node3);
        node4.addNode(node5);

        node5.addNode(node4);
        node5.addNode(node1);
    }
}
