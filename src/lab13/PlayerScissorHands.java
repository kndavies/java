package lab13;

import lab13.RoshamboApp.Roshambo;

public class PlayerScissorHands extends Player{
	private Roshambo r;
	
	
	public Roshambo generateRoshambo(String choice)
	{
		switch(choice)
		{
		case "r":
			r = Roshambo.ROCK;
			break;
		case "p":
			r = Roshambo.PAPER;
			break;
		case "s":
			r = Roshambo.SCISSORS;
			break;
		}
		return r;
	}


	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return Roshambo.PAPER;
	}
	
	@Override
	public Roshambo getRoshambo()
	{
		return r;
	}
}

