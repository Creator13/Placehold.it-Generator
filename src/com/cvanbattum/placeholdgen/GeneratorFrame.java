package com.cvanbattum.placeholdgen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSpinner;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;

public class GeneratorFrame extends JFrame {

	private static final long serialVersionUID = 4890337735795827072L;
	
	private JPanel contentPane;
	private JTextField outputField;
	private Generator generator;

	/**
	 * Launch the application.
	 */
	public void launch() {
		setVisible(true);
		
	}

	/**
	 * Create the frame.
	 */
	public GeneratorFrame() {
		// The following code was generated using the WindowBuilder plugin for Eclipse,
		// with the exception of ActionListeners.
		setTitle("Placehold.it Generator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel titleLabel = new JLabel("Placehold.it Generator");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		contentPane.add(titleLabel, BorderLayout.NORTH);
		
		JPanel settingsPanel = new JPanel();
		settingsPanel.setBorder(new EmptyBorder(25, 25, 0, 0));
		contentPane.add(settingsPanel, BorderLayout.CENTER);
		GridBagLayout gbl_settingsPanel = new GridBagLayout();
		gbl_settingsPanel.columnWidths = new int[]{0, 0, 0, 30, 0, 0};
		gbl_settingsPanel.rowHeights = new int[]{0, 0, 0};
		gbl_settingsPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_settingsPanel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		settingsPanel.setLayout(gbl_settingsPanel);
		
		JLabel widthLabel = new JLabel("Width:");
		GridBagConstraints gbc_widthLabel = new GridBagConstraints();
		gbc_widthLabel.insets = new Insets(0, 0, 5, 5);
		gbc_widthLabel.gridx = 0;
		gbc_widthLabel.gridy = 0;
		settingsPanel.add(widthLabel, gbc_widthLabel);
		
		JSpinner widthSpinner = new JSpinner();
		widthSpinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		widthSpinner.setPreferredSize(new Dimension(60, 20));
		GridBagConstraints gbc_widthSpinner = new GridBagConstraints();
		gbc_widthSpinner.insets = new Insets(0, 0, 5, 5);
		gbc_widthSpinner.gridx = 1;
		gbc_widthSpinner.gridy = 0;
		settingsPanel.add(widthSpinner, gbc_widthSpinner);
		
		JLabel pixelLabelWidth = new JLabel("px");
		GridBagConstraints gbc_pixelLabelWidth = new GridBagConstraints();
		gbc_pixelLabelWidth.insets = new Insets(0, 0, 5, 5);
		gbc_pixelLabelWidth.gridx = 2;
		gbc_pixelLabelWidth.gridy = 0;
		settingsPanel.add(pixelLabelWidth, gbc_pixelLabelWidth);
		
		JButton moreOptionsBtn = new JButton("More options...");
		moreOptionsBtn.setFocusable(false);
		GridBagConstraints gbc_moreOptionsBtn = new GridBagConstraints();
		gbc_moreOptionsBtn.insets = new Insets(0, 0, 5, 0);
		gbc_moreOptionsBtn.gridx = 4;
		gbc_moreOptionsBtn.gridy = 0;
		settingsPanel.add(moreOptionsBtn, gbc_moreOptionsBtn);
		
		JLabel heightLabel = new JLabel("Height:");
		GridBagConstraints gbc_heightLabel = new GridBagConstraints();
		gbc_heightLabel.insets = new Insets(0, 0, 0, 5);
		gbc_heightLabel.gridx = 0;
		gbc_heightLabel.gridy = 1;
		settingsPanel.add(heightLabel, gbc_heightLabel);
		
		JSpinner heightSpinner = new JSpinner();
		heightSpinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		heightSpinner.setPreferredSize(new Dimension(60, 20));
		GridBagConstraints gbc_heightSpinner = new GridBagConstraints();
		gbc_heightSpinner.insets = new Insets(0, 0, 0, 5);
		gbc_heightSpinner.gridx = 1;
		gbc_heightSpinner.gridy = 1;
		settingsPanel.add(heightSpinner, gbc_heightSpinner);
		
		JLabel pixelLabelHeight = new JLabel("px");
		GridBagConstraints gbc_pixelLabelHeight = new GridBagConstraints();
		gbc_pixelLabelHeight.insets = new Insets(0, 0, 0, 5);
		gbc_pixelLabelHeight.gridx = 2;
		gbc_pixelLabelHeight.gridy = 1;
		settingsPanel.add(pixelLabelHeight, gbc_pixelLabelHeight);
		
		JPanel outputPanel = new JPanel();
		contentPane.add(outputPanel, BorderLayout.SOUTH);
		outputPanel.setLayout(new BorderLayout(0, 0));
		
		outputField = new JTextField();
		outputField.setFocusable(false);
		outputField.setHorizontalAlignment(SwingConstants.CENTER);
		outputPanel.add(outputField, BorderLayout.CENTER);
		outputField.setColumns(10);
		
		JPanel linkActionsPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) linkActionsPanel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		outputPanel.add(linkActionsPanel, BorderLayout.SOUTH);
		
		JButton copyToClipboardBtn = new JButton("Copy to clipboard");
		linkActionsPanel.add(copyToClipboardBtn);
		
		JButton openLinkBtn = new JButton("Visit link");
		linkActionsPanel.add(openLinkBtn);
		
		JPanel generateButtonPanel = new JPanel();
		outputPanel.add(generateButtonPanel, BorderLayout.NORTH);
		
		JButton rawLinkGenerateBtn = new JButton("Generate raw link!");
		rawLinkGenerateBtn.setPreferredSize(new Dimension(140, 30));
		generateButtonPanel.add(rawLinkGenerateBtn);
		
		JButton htmlTagGenerateBtn = new JButton("Generate <img> tag!");
		htmlTagGenerateBtn.setPreferredSize(new Dimension(140, 30));
		generateButtonPanel.add(htmlTagGenerateBtn);
		//WindowBuilder code ends here
	}

}
