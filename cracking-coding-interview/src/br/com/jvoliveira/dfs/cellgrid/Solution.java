package br.com.jvoliveira.dfs.cellgrid;

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        CellGrid cellgrid = new CellGrid();
        System.out.println(cellgrid.getBiggestRegion(grid,n,m));
    }
}
