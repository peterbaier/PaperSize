package com.baier.paperSize;

import javax.swing.JFrame;

public class Runner {

	public static void main(String[] args) {
		Gui gui = new Gui();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(400,100);
		gui.setLocationRelativeTo(null);
		gui.setVisible(true);
	}

}
