package tests.test3_20181101;


import java.util.ArrayList;
import java.util.List;

public class GraphNode<T> {
    T data;
    List<GraphNode<?>> connections;
    boolean isChecked;

    GraphNode(T t) {
        data = t;
        connections = new ArrayList<>();
    }

    void addNode(GraphNode<?> node) {
        connections.add(node);
    }

    void printData() {
        System.out.println(data + " is checked");
    }

}
