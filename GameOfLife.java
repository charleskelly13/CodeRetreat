package CodePack;

public class GameOfLife {
	int[][] life;
	GameOfLife(int [][]grid){
		life=grid;
		for(int i=0; i<grid.length;i++)
		{
			for(int j=0; j<grid[i].length;j++)
			{
				GetNeighbours(i, j);
			}
		}
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
