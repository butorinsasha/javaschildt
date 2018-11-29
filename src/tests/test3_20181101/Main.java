package tests.test3_20181101;

public class Main {

//    static void dfs (GraphNode<?> node) {
//        if (node.isChecked) return;
//        node.printData();
//        node.isChecked = true;
//        for (GraphNode<?>  c : node.connections) dfs(c);
//    }

    public static void main(String[] args) {
        /*Create nodes*/
        GraphNode<String> node0 = new GraphNode<>("zero");
        GraphNode<Integer> node1 = new GraphNode<>(1);
        GraphNode<Double> node2 = new GraphNode<>(2.0);
        GraphNode<Character> node3 = new GraphNode<>('3');
        GraphNode<Boolean> node4 = new GraphNode<>(true);

        /**
         * Create graph
         * Making connections correctly: if "node1 is connected to node2" then "node2 is connected to node1" should be declared as well)
         * Will be fixed one day
         */
        node0.addNode(node1);
        node0.addNode(node4);

        node1.addNode(node0);
        node1.addNode(node2);
        node1.addNode(node3);

        node2.addNode(node1);

        node3.addNode(node1);

        node4.addNode(node0);

        /*Traverse graph*/
        GraphTraverse.dfs(node1);
    }
}
