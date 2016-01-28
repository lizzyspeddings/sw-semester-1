import java.util.Random;

public class MineSweeper
{
	//attributes
	private String[][] board;
	private int numberOfMines;
	private Random generator;

	//constructor
	public MineSweeper(int numberOfMines)
	{
		board = new String[10][10];
		Random generator = new Random();
		
		//initialise the board with all 0's
		for(int i = 0; i < 10; i ++)
		{
			for(int j = 0; j < 10; j ++)
			{
				board[i][j] = "0";
			}
		}

		//place random mines on board but make sure they're not within 2 squares of each other
		int[][] mineLocations = new int[2][numberOfMines];
		for(int i = 0; i < numberOfMines; i ++)
		{
			int x = generator.nextInt(9);
			int y = generator.nextInt(9);
			boolean valid = false;
			while(valid == false)
				{
					if ((mineLocations[0][i] == (x - 1) && mineLocations[1][i] == y)||
						(mineLocations[0][i] == (x - 1) && mineLocations[1][i] == (y - 1))||
						(mineLocations[0][i] == (x) && mineLocations[1][i] == (y - 1))||
						(mineLocations[0][i] == (x + 1) && mineLocations[1][i] == (y - 1))||
						(mineLocations[0][i] == (x + 1) && mineLocations[1][i] == y)||
						(mineLocations[0][i] == (x) && mineLocations[1][i] == (y + 1))||
						(mineLocations[0][i] == (x + 1) && mineLocations[1][i] == (y + 1))||
						(mineLocations[0][i] == (x) && mineLocations[1][i] == y)||
						(mineLocations[0][i] == (x - 1) && mineLocations[1][i] == (y + 1)))
					{
						valid = false;
						x = generator.nextInt(9);
						y = generator.nextInt(9);
					}
					else
					{
						valid = true;
					}
				}

			board[x][y] = "x";
		}

		//go through board and see if it is a mine if yes then add to count 
		for(int x = 0; x < 10; x ++)
		{
			for(int y = 0; y < 10; y ++)
			{
				if(board[x][y].equals("x"))
				{
					if(x == 0 && y == 0)
					{
						board[x + 1][y] = Integer.toString(Integer.parseInt(board[x + 1][y]) + 1);
						board[x][y + 1] = Integer.toString(Integer.parseInt(board[x + 1][y]) + 1);
						board[x + 1][y + 1] = Integer.toString(Integer.parseInt(board[x + 1][y + 1]) + 1);
					}

					else if(x == 0 && y == 9)
					{
						board[x][y - 1] = Integer.toString(Integer.parseInt(board[x][y - 1]) + 1);
						board[x + 1][y - 1] = Integer.toString(Integer.parseInt(board[x + 1][y - 1]) + 1);
						board[x + 1][y] = Integer.toString(Integer.parseInt(board[x + 1][y]) + 1);
					}

					else if(x == 9 && y == 0)
					{
						board[x][y + 1] = Integer.toString(Integer.parseInt(board[x][y + 1]) + 1);
						board[x - 1][y + 1] = Integer.toString(Integer.parseInt(board[x - 1][y + 1]) + 1);
						board[x - 1][y] = Integer.toString(Integer.parseInt(board[x - 1][y]) + 1);
					}

					else if(x == 9 && y == 9)
					{
						board[x][y - 1] = Integer.toString(Integer.parseInt(board[x][y - 1]) + 1);
						board[x - 1][y - 1] = Integer.toString(Integer.parseInt(board[x - 1][y - 1]) + 1);
						board[x - 1][y] = Integer.toString(Integer.parseInt(board[x - 1][y]) + 1);
					}

					else if(x == 0 && y > 0 && y < 9)
					{
						board[x + 1][y] = Integer.toString(Integer.parseInt(board[x + 1][y]) + 1);
						board[x][y + 1] = Integer.toString(Integer.parseInt(board[x][y + 1]) + 1);
						board[x + 1][y + 1] = Integer.toString(Integer.parseInt(board[x + 1][y + 1]) + 1);
						board[x][y - 1] = Integer.toString(Integer.parseInt(board[x][y - 1]) + 1);
						board[x + 1][y - 1] = Integer.toString(Integer.parseInt(board[x + 1][y - 1]) + 1);
					}

					else if(x == 9 && y > 0 && y < 9)
					{
						board[x - 1][y] = Integer.toString(Integer.parseInt(board[x - 1][y]) + 1);
						board[x][y + 1] = Integer.toString(Integer.parseInt(board[x][y + 1]) + 1);
						board[x - 1][y + 1] = Integer.toString(Integer.parseInt(board[x - 1][y + 1]) + 1);
						board[x][y - 1] = Integer.toString(Integer.parseInt(board[x][y - 1]) + 1);
						board[x - 1][y - 1] = Integer.toString(Integer.parseInt(board[x - 1][y - 1]) + 1);
					}

					else if(y == 0 &&  x > 0 && x < 9)
					{
						board[x - 1][y] = Integer.toString(Integer.parseInt(board[x - 1][y]) + 1);
						board[x - 1][y + 1] = Integer.toString(Integer.parseInt(board[x - 1][y + 1]) + 1);
						board[x][y + 1] = Integer.toString(Integer.parseInt(board[x][y + 1]) + 1);
						board[x + 1][y + 1] = Integer.toString(Integer.parseInt(board[x + 1][y + 1]) + 1);
						board[x + 1][y] = Integer.toString(Integer.parseInt(board[x + 1][y]) + 1);
					}

					else if(y == 9 && x > 0 && x < 9)
					{
						board[x - 1][y] = Integer.toString(Integer.parseInt(board[x - 1][y]) + 1);
						board[x - 1][y - 1] = Integer.toString(Integer.parseInt(board[x - 1][y - 1]) + 1);
						board[x][y - 1] = Integer.toString(Integer.parseInt(board[x][y - 1]) + 1);
						board[x + 1][y - 1] = Integer.toString(Integer.parseInt(board[x + 1][y - 1]) + 1);
						board[x + 1][y] = Integer.toString(Integer.parseInt(board[x + 1][y]) + 1);
					}

					else
					{
						board[x - 1][y] = Integer.toString(Integer.parseInt(board[x - 1][y]) + 1);
						board[x - 1][y - 1] = Integer.toString(Integer.parseInt(board[x - 1][y - 1]) + 1);
						board[x][y - 1] = Integer.toString(Integer.parseInt(board[x][y - 1]) + 1);
						board[x + 1][y - 1] = Integer.toString(Integer.parseInt(board[x + 1][y - 1]) + 1);
						board[x + 1][y] = Integer.toString(Integer.parseInt(board[x + 1][y]) + 1);
						board[x][y + 1] = Integer.toString(Integer.parseInt(board[x][y + 1]) + 1);
						board[x + 1][y + 1] = Integer.toString(Integer.parseInt(board[x + 1][y + 1]) + 1);
						board[x - 1][y + 1] = Integer.toString(Integer.parseInt(board[x - 1][y + 1]) + 1);
					}
				}


		}
		}

		for(int i = 0; i < 10; i ++)
		{
			for(int j = 0; j < 10; j ++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}

	}

	//get methods

	//set methods
}