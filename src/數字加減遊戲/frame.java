package 數字加減遊戲;

import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import java.util.*;
import javax.swing.plaf.FontUIResource;

public class frame extends JFrame implements WindowListener{
	public frame() {
		this.setSize(500,250);//視窗大小(x,y)
		this.setLocation(100,50);//欄位位置設定
		this.setTitle("計算遊戲");//視窗標題
		this.setLayout(null);
	}
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}
