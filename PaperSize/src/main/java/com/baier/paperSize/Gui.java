package com.baier.paperSize;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Gui extends JFrame {
	private JComboBox<String> box;
	private TextField field;
	private File file = new File("src//main//resources//selectable.txt");
	private String[] listOfType = new String[19];
	private PaperSizes paperSizes;
	private Scanner scan;
	
	public Gui(){
		super("Paper Size Selector");
		setLayout(new FlowLayout());
		paperSizes = new PaperSizes();
		field = new TextField();
		field.setBackground(Color.LIGHT_GRAY);
		field.setPreferredSize(new Dimension(200, 24));
		
		field.setEditable(false);
		
		populateBox();
		box = new JComboBox<String>(listOfType);
		box.setSelectedIndex(9);
		box.addItemListener(
					new ItemListener() {
						
						public void itemStateChanged(ItemEvent event) {
							if(event.getStateChange() == ItemEvent.SELECTED){
								field.setText(paperSizes.getPaperSize(listOfType[box.getSelectedIndex()]));
								paperSizes.reset();
							}
							
						}
					}
		);
		
		add(box);
		add(field);
	}
	
	public void populateBox(){
		
		try {
			int i = 0;
			scan = new Scanner(file);
			while(scan.hasNextLine()){
				String line = scan.nextLine();
				listOfType[i] = line;
				i++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
