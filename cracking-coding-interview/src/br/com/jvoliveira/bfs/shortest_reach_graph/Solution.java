package br.com.jvoliveira.bfs.shortest_reach_graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	
	public static class Node {
		int id;
		List<Node> conectedNodes;
		private boolean visited;
		
		public Node(int id){
			this.id = id;
			conectedNodes = new ArrayList<>();
		}
		
		@Override
		public String toString() {
			return String.valueOf(id);
		}
		
		public void setVisited(){
			visited = true;
		}
		
		public boolean isVisited(){
			return visited;
		}
	}

	public static class Graph {
        
		Map<Integer,Node> nodesInGraph = new HashMap<>();
		List<Integer> bfs = new ArrayList<>();
		int size;
        
        public Graph(int size) {
        	this.size = size;
            for(int i = 1; i <= size; i++){
            	Node node = new Node(i);
            	nodesInGraph.put(i, node);
            }
        }

        public void addEdge(int first, int second) {
            Node firstNode = nodesInGraph.get(first);
            Node secondNode = nodesInGraph.get(second);
            firstNode.conectedNodes.add(secondNode);
            secondNode.conectedNodes.add(firstNode);
        }
        
        public int[] shortestReach(int startId) {
            Node root = nodesInGraph.get(startId);
            root.setVisited();
            int[] distances = new int[size];
            int edgeLength = 6;
            
            Set<Integer> nodesId = new HashSet<>();
            for(Node conectedNode : root.conectedNodes)
            	nodesId.add(conectedNode.id);
            bfs.addAll(nodesId);
            
            shortestReach(edgeLength, distances);
            return distances;
        }

		private void shortestReach(int edgeLength, int[] distances) {
			if(bfs.isEmpty())
				return;
			
			Set<Integer> nodesId = new HashSet<>();
			Set<Integer> nextNodesId = new HashSet<>();
			while(!bfs.isEmpty())
				nodesId.add(bfs.remove(0));
			
			for(Integer nodeId : nodesId){
				Node node = nodesInGraph.get(nodeId);
				node.setVisited();
				distances[node.id-1] = edgeLength;
			}
			
			for(Integer nodeId : nodesId){
				Node node = nodesInGraph.get(nodeId);
				for(Node nextNode : node.conectedNodes){
					Node nextNodeInMap = nodesInGraph.get(nextNode.id);
					if(!nextNodeInMap.isVisited())
						nextNodesId.add(nextNodeInMap.id);
				}
			}
			bfs.addAll(nextNodesId);
			
			shortestReach(edgeLength+6,distances);
		}
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int queries = scanner.nextInt();
        List<int[]> results = new ArrayList<>();
        List<Integer> startedIds = new ArrayList<>();
        
        for (int t = 0; t < queries; t++) {
            
            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();
            
            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                
                // add each edge to the graph
                graph.addEdge(u, v);
            }
            
            // Find shortest reach from node s
            int startId = scanner.nextInt();
            int[] distances = graph.shortestReach(startId);
            startedIds.add(startId);
            results.add(distances);            
        }
        
        scanner.close();
        
        for(int[] distances : results){
        	Iterator<Integer> startedIdsIterator = startedIds.iterator();
        	int startId = startedIdsIterator.next();
	        for (int i = 0; i < distances.length; i++) {
	        	if (i+1 != startId) {
	               int value = distances[i];
	               if(value == 0) value = -1;
	               System.out.print(value);
	               System.out.print(" ");
	        	}
	        }
	        System.out.println();
	        startedIdsIterator.remove();
        }
        System.out.println();        
    }
	
}

