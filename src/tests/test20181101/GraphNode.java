package tests.test20181101;


import java.util.ArrayList;
import java.util.List;

public class GraphNode<T> {
    T data;
    List<GraphNode<T>> connections;
    boolean isChecked;

    GraphNode(T t) {
        data = t;
        connections = new ArrayList<>();
    }

    void addNode(GraphNode<T> node) {
        connections.add(node);
    }

    void printData() {
        System.out.println(data + " is checked");
    }

    @Override
    public String toString() {
        return "GraphNode{" +
                "data=" + data + "}";
    }
}
