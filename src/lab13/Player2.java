package lab13;

import lab13.RoshamboApp.Roshambo;

public class Player2 extends Player{
	private Roshambo r;
	
	@Override
	public Roshambo generateRoshambo()
	{
		r = Roshambo.values()[(int)(Math.random() * 3)];
		return r;
	}
	
	@Override
	public Roshambo getRoshambo()
	{
		return r;
	}
}
