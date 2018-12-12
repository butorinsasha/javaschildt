package tests.test3_graph_20181101;

public class GraphTraverse {
    static void dfs (GraphNode<?> node) {
        if (node.isChecked) return;
        node.printData();
        node.isChecked = true;
        for (GraphNode<?> c : node.connections) dfs(c);
    }
}
