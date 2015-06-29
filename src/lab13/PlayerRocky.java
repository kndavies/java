package lab13;

import lab13.RoshamboApp.Roshambo;

public class PlayerRocky extends Player{
	private Roshambo r;
	
	@Override
	public Roshambo generateRoshambo()
	{
		r = Roshambo.ROCK;
		return r;
	}
	@Override
	public Roshambo getRoshambo()
	{
		return r;
	}
}
