
/* HelloWorld.java */

package my.test;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;

public class HelloWorld {
    
    private JFrame mMainFrame;
    private JMenuBar mMenuBar;
    private JMenu mMenuFile;
    private JMenuItem mMenuItemExit;
    private JSplitPane mSplitPane;
    
    public static void main(String[] args) {
        HelloWorld helloWorldApp = new HelloWorld();
    }
    
    public HelloWorld() {
        this.mMainFrame = new JFrame("EclipseGitTest");
        this.mMainFrame.setLocationRelativeTo(null);
        this.mMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mMainFrame.setVisible(true);
        
        this.mMenuBar = new JMenuBar();
        this.mMainFrame.setJMenuBar(this.mMenuBar);
        
        this.mMenuFile = new JMenu("File");
        this.mMenuFile.setMnemonic(KeyEvent.VK_F);
        this.mMenuBar.add(this.mMenuFile);
        
        this.mMenuItemExit = new JMenuItem("Exit");
        this.mMenuItemExit.setMnemonic(KeyEvent.VK_X);
        this.mMenuItemExit.addActionListener(e -> {
            this.mMainFrame.dispatchEvent(
                new WindowEvent(this.mMainFrame, WindowEvent.WINDOW_CLOSING));
        });
        this.mMenuFile.add(this.mMenuItemExit);
        
        this.mSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        this.mMainFrame.getContentPane().add(this.mSplitPane, BorderLayout.CENTER);

        this.mMainFrame.pack();
        this.mMainFrame.setSize(640, 480);
    }
}
