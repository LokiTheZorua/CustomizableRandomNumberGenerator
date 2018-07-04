package rng.controller;

import rng.view.rngFrame;
import rng.view.rngPanel;

public class rngController
{
	public void start()
	{
		
	}
	public double rngGenerator(double minNum, double maxNum, boolean decimal)
	{
		double range = maxNum - minNum;
		
		double randomNumb;
		
		if (decimal = true)
		{
			randomNumb = (Math.random() * range) + minNum;
		}
		else
		{
			randomNumb = (int) (Math.random() * range) + minNum;
		}
		return randomNumb;
	}
}
