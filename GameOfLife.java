package CodePack;

import java.io.IOException;

public class GameOfLife {
	int[][] life;
	public static void main(String args[])
	{
		int [][] grid = 
			   {{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 1, 1, 1, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0}};
		GameOfLife game = new GameOfLife(grid);

	}
	GameOfLife(int [][]grid){
		life=grid;
		for(int y=0;y<grid.length; y++)
			{
			for(int z=0; z<grid[y].length;z++)
			{
				life[y][z]=grid[y][z];
			}
			}
		int[][] x = new int[grid.length][grid[0].length];
		for(int i=0; i<grid.length;i++)
		{
			for(int j=0; j<grid[i].length;j++)
			{
				if(IsAlive(i, j))
				{
					x[i][j]=1;
				}
				System.out.print(x[i][j]+"\t");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
		GameOfLife game = new GameOfLife(x);
	}
	
	public int GetNeighbours(int i, int j) {
		int count=0;
		for(int a=i-1; a<=i+1; a++)
		{
			for(int b=j-1; b<=j+1;b++)
			{
				if(a<0||b<0||a>=life.length||b>=life[a].length)
				{
					continue;
				}
				count += life[a][b];
			}
		}
		return count-life[i][j];
		
	}
	
	public boolean IsAlive(int i, int j)
	{
		int check = GetNeighbours(i,j);
		if(check<2||check>3)
		{
			return false;
		}
		else if(check==3)
		{
			return true;
		}
		else if(check==2)
		{
			return life[i][j]==1;
		}
		else 
		{
			return false;
		}
	}

}
