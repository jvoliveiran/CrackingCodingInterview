package br.com.jvoliveira.dfs.cellgrid;

public class Node {

	int row, column;
	int region;
	
	public Node(int row, int column){
		this.row = row;
		this.column = column;
	}
	
	public Node(int row, int column, int region){
		this.row = row;
		this.column = column;
		this.region = region;
	}
	
}
