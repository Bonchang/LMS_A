package main;
import javax.swing.JFrame;

public class LMain {
	
	private LMainFrame mainFrame;
	
	public LMain() {
		this.mainFrame = new LMainFrame();
	}
	
	public void initialize() {
		this.mainFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		LMain main = new LMain();
		main.initialize();
	}

}