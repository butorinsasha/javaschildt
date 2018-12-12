package tests.test3_graph_20181101;


import java.util.ArrayList;
import java.util.List;

public class GraphNode<T> {
    private T data;
    List<GraphNode<?>> connections;
    boolean isChecked;

    GraphNode(T t) {
        data = t;
        connections = new ArrayList<>();
    }

    void addNode(GraphNode<?> node) {
        connections.add(node);
        node.connections.add(this);
    }

    void printData() {
        System.out.println(data + " is checked");
    }

}
