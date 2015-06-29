package lab13;

import java.util.Scanner;

public class RoshamboApp {
	enum Roshambo
	{
		ROCK, PAPER, SCISSORS;
		public String toString()
		{
			switch(this)
			{
			case ROCK:
				return "rock";
			case PAPER:
				return "paper";
			case SCISSORS:
				return "scissors";
			default:
				return "";
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		String player2 = "";
		String team = "";
		String answer = "";
		Player r;
		PlayerScissorHands p = new PlayerScissorHands();
		Roshambo pick;
		Roshambo cpuPick;
		System.out.println("Welcome to rock, paper, scissors");
		name = Validator.getString(sc, "Please enter your name:");
		team = Validator.getTeam(sc, "Would you like to play against Rocky or Bagels? (r/b)");
		if(team.equalsIgnoreCase("r"))
		{
			r = new PlayerRocky();
			r = (PlayerRocky)r;
			player2 = "Rocky";
		}
		else if(team.equalsIgnoreCase("b"))
		{
			r = new Player2();
			r = (Player2)r;
			player2 = "bagels";
		}
		else
		{
			r = new PlayerRocky();
			r = (PlayerRocky)r;
		}
		do
		{
			
			answer = Validator.getSelection(sc, "Rock, paper or scissors? (R/P/S)");
			p.generateRoshambo(answer);
			r.generateRoshambo();
			pick = p.getRoshambo();
			cpuPick = r.getRoshambo();
			System.out.println(name + ": " + pick.toString());
			System.out.println(player2 + ": " + cpuPick.toString());
			if(pick == r.getRoshambo())
			{
				System.out.println("Draw");
			}
			else if(pick == Roshambo.PAPER)
			{
				if(cpuPick == Roshambo.ROCK)
				{
					System.out.println(name + " Wins!");
				}
				else if(cpuPick == Roshambo.SCISSORS)
				{
					System.out.println(player2 + " Wins!");
				}
			}
			
			else if(pick == Roshambo.ROCK)
			{
				if(cpuPick == Roshambo.SCISSORS)
				{
					System.out.println(name + " Wins!");
				}
				else if(cpuPick == Roshambo.PAPER)
				{
					System.out.println(player2 + " Wins!");
				}
			}
			
			else if(pick == Roshambo.SCISSORS)
			{
				if(cpuPick == Roshambo.PAPER)
				{
					System.out.println(name + " Wins!");
				}
				else if(cpuPick == Roshambo.ROCK)
				{
					System.out.println(player2 + " Wins!");
				}
			}
			answer = Validator.getAnswer(sc, "Would you like to play again?");
		}
		while(answer.equalsIgnoreCase("y"));

	}

}
