package tests.test3_graph_20181101;

public class Main {

    public static void main(String[] args) {
        /*Create nodes*/
        GraphNode<String> node0 = new GraphNode<>("zero");
        GraphNode<Integer> node1 = new GraphNode<>(1);
        GraphNode<Double> node2 = new GraphNode<>(2.0);
        GraphNode<Character> node3 = new GraphNode<>('3');
        GraphNode<Boolean> node4 = new GraphNode<>(true);

        node0.addNode(node4);

        node1.addNode(node0);
        node1.addNode(node2);
        node1.addNode(node3);

        /*Traverse graph*/
        GraphTraverse.dfs(node1);
    }
}
