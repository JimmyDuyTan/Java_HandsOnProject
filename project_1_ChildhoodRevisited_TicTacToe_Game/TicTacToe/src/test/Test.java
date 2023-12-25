package test;

import javax.swing.UIManager;

import view.Fdemo;

public class Test {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			Fdemo viDu = new Fdemo();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
