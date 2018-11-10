package CodePack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test2 {
	
	@Test
	void testGetNeighbours() {
		int [][] grid = 
			   {{1, 0, 0, 1},
				{0, 1, 0, 0},
				{0, 1, 0, 1},
				{0, 0, 1, 1}};
		GameOfLife game = new GameOfLife(grid);
		
		assertTrue(game.GetNeighbours(0, 0) == 1);
		assertTrue(game.GetNeighbours(0, 1) == 2);
		assertTrue(game.GetNeighbours(0, 2) == 2);
		assertTrue(game.GetNeighbours(0, 3) == 0);
		assertTrue(game.GetNeighbours(1, 0) == 3);
		assertTrue(game.GetNeighbours(1, 1) == 2);
		assertTrue(game.GetNeighbours(1, 2) == 4);
		assertTrue(game.GetNeighbours(1, 3) == 2);
		assertTrue(game.GetNeighbours(3, 3) == 2);
	}
	
	@Test
	void testIsAlive() {
		int [][] grid = 
			   {{1, 0, 0, 1},
				{0, 1, 0, 0},
				{0, 1, 0, 1},
				{0, 0, 1, 1}};
		GameOfLife game = new GameOfLife(grid);
		assertFalse(game.IsAlive(0, 0));
		assertFalse(game.IsAlive(0, 1));
		assertFalse(game.IsAlive(0, 2));
		assertFalse(game.IsAlive(0, 3));
		assertTrue(game.IsAlive(1, 0));
		assertTrue(game.IsAlive(1, 1));
		assertFalse(game.IsAlive(1, 2));
		assertFalse(game.IsAlive(1, 3));
		assertFalse(game.IsAlive(2, 2));
		assertTrue(game.IsAlive(3, 3));
	}

	void printing()
	{
		int [][] grid = 
			   {{1, 0, 0, 1},
				{0, 1, 0, 0},
				{0, 1, 0, 1},
				{0, 0, 1, 1}};
		GameOfLife game = new GameOfLife(grid);

	}
}
