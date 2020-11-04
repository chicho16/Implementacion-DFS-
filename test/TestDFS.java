package test;

import data.structure.Graph;

public class TestDFS {

    static void testDFS() {
        Graph graph = new Graph(false);
        graph.readFileInput("test01.txt");
        graph.DFS();
       // graph.printGraph();     
        graph.printGraphDFS();
    }

    public static void main(String[] args) {
        testDFS();
    }
}