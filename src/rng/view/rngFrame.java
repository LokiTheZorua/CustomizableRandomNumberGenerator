package rng.view;

import rng.controller.rngController;
import javax.swing.JFrame;

public class rngFrame extends JFrame
{
	private rngController appController;
	private rngPanel appPanel;
	
	public rngFrame(rngController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new rngPanel(appController);
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("make a random number");
		this.setSize(600,600);
		this.setResizable(false);
		
		this.setVisible(true);
	}
}
