package com.baier.paperSize;

import static org.junit.Assert.*;

import javax.swing.JFrame;

import org.junit.Before;
import org.junit.Test;

public class PaperSizeTest {
	PaperSizes paperTypes;
	
	@Before
	public void setUp() throws Exception {
		paperTypes = new PaperSizes();
		
	}

	@Test
	public void test() {
		assertEquals("A2: 420 x 594",paperTypes.getPaperSize("A2"));
	}
	
	@Test
	public void GuiTest() {
		Gui gui = new Gui();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(200,200);
		gui.setVisible(true);
	}
}
