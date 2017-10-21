package br.com.jvoliveira.dfs.cellgrid;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CellGrid {
	
	int regionCounter = 0;
	Node[][] nodeMap;
	Map<Integer,Integer> regions = new HashMap<>();
	int totalRow, totalColumn;
	
	public int getBiggestRegion(int[][]matrix, int i, int j){
		nodeMap = new Node[i][j];
		totalRow = i;
		totalColumn = j;
		
		for(int row = 0; row < i; row++){
			for(int column = 0; column < j; column++){
				
				if(matrix[row][column] > 0){
					Node node = new Node(row,column);
					node.region = regionCounter;
					regionCounter++;
					lookAround(matrix, node, i, j);
				}
				
			}
		}
		
		return getBiggestRegion(); 
	}
	
	private void lookAround(int[][]matrix, Node node, int rowParent, int colParent) {
		nodeMap[node.row][node.column] = node;
		verifyRegion(node);
		matrix[node.row][node.column] = -1;
		
		if(node.column > 0 && matrix[node.row][node.column-1] > 0) //LEFT
			lookAround(matrix, new Node(node.row,node.column-1, node.region), node.row, node.column);
		
		if(node.column + 1 < totalColumn && matrix[node.row][node.column+1] > 0) //RIGHT
			lookAround(matrix, new Node(node.row,node.column+1, node.region), node.row, node.column);
		
		if(node.row > 0 && matrix[node.row-1][node.column] > 0) //TOP
			lookAround(matrix, new Node(node.row-1,node.column, node.region), node.row, node.column);
		
		if(node.row + 1 < totalRow && matrix[node.row+1][node.column] > 0) //BOTTON
			lookAround(matrix, new Node(node.row+1,node.column, node.region), node.row, node.column);
		
		if(node.row > 0 && node.column > 0 && matrix[node.row-1][node.column-1] > 0) //TOP-LEFT
			lookAround(matrix, new Node(node.row-1,node.column-1, node.region), node.row, node.column);
		
		if(node.row > 0 && node.column + 1 < totalColumn && matrix[node.row-1][node.column+1] > 0) //TOP-RIGHT
			lookAround(matrix, new Node(node.row-1,node.column+1, node.region), node.row, node.column);
		
		if(node.row + 1 < totalRow && node.column > 0 && matrix[node.row+1][node.column-1] > 0) //BOTTON-LEFT
			lookAround(matrix, new Node(node.row+1,node.column-1, node.region), node.row, node.column);
		
		if(node.row + 1 < totalRow && node.column + 1 < totalColumn && matrix[node.row+1][node.column+1] > 0) //BOTTON-RIGHT
			lookAround(matrix, new Node(node.row+1,node.column+1, node.region), node.row, node.column);
	}

	private void verifyRegion(Node node) {
		System.out.println("["+ node.row + " " + node.column + " " + node.region +"]");
		if(regions.containsKey(node.region))
			regions.put(node.region, regions.get(node.region)+1);
		else
			regions.put(node.region,1);
	}
	
	private int getBiggestRegion(){
		Iterator<Integer> regionsKeysIterator = this.regions.keySet().iterator();
		int biggestRegion = 0;
		while(regionsKeysIterator.hasNext()){
			int actualKey = regionsKeysIterator.next();
			if(regions.get(actualKey) > biggestRegion)
				biggestRegion = regions.get(actualKey);
		}
		return biggestRegion;
	}
}
