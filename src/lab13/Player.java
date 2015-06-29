package lab13;

import lab13.RoshamboApp.Roshambo;

public abstract class Player {
	//private Roshambo r;
	
	public Player()
	{
		//r = Roshambo.ROCK;
	}
	public abstract Roshambo generateRoshambo();
	public abstract Roshambo getRoshambo();
}
