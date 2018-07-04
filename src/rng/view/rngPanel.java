package rng.view;

import rng.controller.rngController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class rngPanel extends JPanel
{
	private rngController appController;
	private SpringLayout appLayout;
	private JButton generateButton;
	private JTextField minField;
	private JTextField maxField;
	private JCheckBox decimalBox;
	private JTextArea numberPresenter;
	
	public rngPanel(rngController appController)
	{
		super();
		
		this.appController = appController;
		appLayout = new SpringLayout();
		
		generateButton = new JButton("Generate");
		
		minField = new JTextField();
		maxField = new JTextField();
		decimalBox = new JCheckBox();
		numberPresenter = new JTextArea();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setBackground(Color.LIGHT_GRAY);
		this.add(generateButton);
		this.add(minField);
		this.add(maxField);
		this.add(decimalBox);
		this.add(numberPresenter);
	}
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
