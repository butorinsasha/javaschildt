package tests.test20181101;


import java.util.List;

public class GraphNode<T> {
    T data;
    List<GraphNode<T>> connections;
    boolean isChecked;

    public GraphNode(T t) {
        this.data = t;
    }

    void addNode(GraphNode<T> node) {
        connections.add(node);
    }

    void print() {
        System.out.println(this.data + " is checked");
    }
}
