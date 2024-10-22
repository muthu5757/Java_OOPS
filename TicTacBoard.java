import java.util.Scanner;
class TicTacToe
{
	static char[][] board;
	public TicTacToe()
	{
		board = new char[3][3];
		initboard();
	}	
	void initboard()
	{
		for(int i=0; i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				board[i][j]=' ' ;
			}
		}
	}
	  void displayboard()
	{
		System.out.println("----------");
		for(int i=0; i<board.length;i++)
		{
			System.out.print("| ");
			for(int j=0;j<board[i].length;j++)
			{
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("----------");
		}
	}
	static void placeMark(int row,int col,char mark)
	{
		if(row >=0 && row <=2 && col >=0 && col <=2)
		{
			board[row][col]=mark;
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
	static boolean checkcolWon()
	{
		for(int j = 0;j<=2;j++)
		{
			if(board[0][j] != ' ' && board[0][j]==board[1][j] && board[1][j]==board[2][j])
			{
				return true;
			}
		}
		return false;
	}
	static boolean checkrowWon()
	{
		for(int i = 0;i<=2;i++)
		{
			if(board[i][0]!=' ' && board[i][0]==board[i][1] && board[i][1]==board[i][2])
			{
				return true;
			}
		}
		return false;
	}
	static boolean checkdiagnalWon()
	{
		 if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2] || 
            board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }
	
}
class HumanPlayer
{
	String name;
	char mark;
	Scanner s = new Scanner(System.in);
	int row,col;
	HumanPlayer(String name,char mark)
	{
		this.name = name;
		this.mark = mark;
	}
	void makemove()
	{
		do{
			System.out.println("Enter row and column: ");
			row=s.nextInt();
			col=s.nextInt();
		}while(!isValidmove(row,col));
		TicTacToe.placeMark(row , col , mark);
	}
	 boolean isValidmove(int row,int col)
	{
		if(row >= 0 && row <= 2 && col >= 0 && col <= 2)
		{
			if(TicTacToe.board[row][col]==' ')
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		TicTacToe t = new TicTacToe();
		HumanPlayer p1 = new HumanPlayer("Arun",'X');
		HumanPlayer p2 = new HumanPlayer("Jeya",'O');
		HumanPlayer cp;
		cp=p1;
		while(true)
		{
			System.out.println(cp.name + " Turn");
			cp.makemove();
			t.displayboard();
			if(TicTacToe.checkcolWon() ||  TicTacToe.checkrowWon() || TicTacToe.checkdiagnalWon())
			{
				System.out.println(cp.name + " has won");
				break;
			}
			else
			{
				if(cp==p1)
				{
					cp=p2;
				}	
				else
				{
					cp=p1;
				}
			}	
		}
	}
}
