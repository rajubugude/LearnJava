package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void pathVisitingAllNodes(int n, ArrayList<ArrayList<Integer>> edgeList) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        System.out.println("Edge list");
        for (ArrayList<Integer> edge : edgeList) {

            System.out.println(edge);
        }
        // Build adjacency list from edge list
        for (ArrayList<Integer> edge : edgeList) {
            int edgeS = edge.get(0); // edge start
            int edgeE = edge.get(1); // edge end
            adjList.get(edgeS).add(edgeE);
            adjList.get(edgeE).add(edgeS);
        }
        System.out.println("Adjacency list");
        for (ArrayList<Integer> edge : adjList) {

            System.out.println(edge);
        }
    }

    public static void main(String[] args) {
        // Example: 4 nodes, with edges connecting all nodes in a cycle
        int n = 4;
        ArrayList<ArrayList<Integer>> edgeList = new ArrayList<>();
        edgeList.add(new ArrayList<>(List.of(0, 1)));
        edgeList.add(new ArrayList<>(List.of(1, 2)));
        edgeList.add(new ArrayList<>(List.of(2, 3)));
        edgeList.add(new ArrayList<>(List.of(3, 0)));

        // Check if there is a path visiting all nodes
        pathVisitingAllNodes(n, edgeList);
    }
}
