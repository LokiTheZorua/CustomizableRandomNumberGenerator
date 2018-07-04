package rng.view;

import rng.controller.rngController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class rngPanel extends JPanel
{
	private rngController appController;
	
	public rngPanel(rngController appController)
	{
		super();
		
		this.appController = appController;
	}
}
