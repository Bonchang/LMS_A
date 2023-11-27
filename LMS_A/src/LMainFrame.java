import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class LMainFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    private JPanel directoryPanel;
    private JTree directoryTree;
    private LMenuBar menuBar;
    private LMainPanel mainPanel;

    public LMainFrame() {
        // Set attributes
        this.setSize(800, 600); // 사이즈를 조금 더 크게 조정

        this.setLayout(new BorderLayout());

        // Directory panel
        this.directoryTree = new JTree(); // 디렉토리 구조를 표시할 JTree
        this.directoryPanel = new JPanel();
        this.directoryPanel.setLayout(new BorderLayout());
        this.directoryPanel.add(directoryTree, BorderLayout.CENTER);
        this.add(this.directoryPanel, BorderLayout.WEST); // 왼쪽에 패널 추가

        // Menu bar
        this.menuBar = new LMenuBar();
        this.add(this.menuBar, BorderLayout.NORTH);

        // Main panel
        this.mainPanel = new LMainPanel();
        this.add(this.mainPanel, BorderLayout.CENTER);
    }
}

