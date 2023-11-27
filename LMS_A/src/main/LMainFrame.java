package main;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class LMainFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    private LDirectoryPanel directoryPanel;
    private LMenuBar menuBar;
    private LMainPanel mainPanel;

    public LMainFrame() {
        // Set attributes
        this.setSize(800, 600);

        this.setLayout(new BorderLayout());

        // Directory panel
        this.directoryPanel = new LDirectoryPanel();
        this.add(this.directoryPanel, BorderLayout.WEST);

        // Menu bar
        this.menuBar = new LMenuBar();
        this.add(this.menuBar, BorderLayout.NORTH);

        // Main panel
        this.mainPanel = new LMainPanel();
        this.add(this.mainPanel, BorderLayout.CENTER);
    }

    // 필요한 경우 추가 메소드 구현
}


