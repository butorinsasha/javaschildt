package tests.test20181101;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DFS {
    private static Set<GraphNode> tempGraphNodes;

    static {
        tempGraphNodes = new HashSet<>();
    }
    void addNode(GraphNode node) {
       // graphNodes.add(node);
    }

//    static Set<GraphNode> readGraph(GraphNode fromNode) {
//        Set<GraphNode> graphNodes = new HashSet<>();
//        Set<GraphNode> tempGraphNodes = new HashSet<>();
//        graphNodes.add(fromNode);
//
//        while (true)  {
//            for (GraphNode node : graphNodes) {
//                node.printData();
//                node.isChecked = true;
//                for (Object connection : node.connections) {
//                    tempGraphNodes.add((GraphNode) connection);
//                    System.out.println(tempGraphNodes);
//                }
//            }
//            if (graphNodes == tempGraphNodes) return tempGraphNodes;
//            else graphNodes = tempGraphNodes;
//        }
//    }


    static void readGraph(GraphNode... fromNodes) {
        for (GraphNode node : fromNodes) {
            tempGraphNodes.add(node);
            node.printData();
            node.isChecked = true;
            readGraph((GraphNode) node.connections);
        }
    }


    public void gfc() {

    }
}
