package �Ʀr�[��C��;

import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import java.util.*;
import javax.swing.plaf.FontUIResource;

public class frame extends JFrame implements WindowListener{
	public frame() {
		this.setSize(500,250);//�����j�p(x,y)
		this.setLocation(100,50);//����m�]�w
		this.setTitle("�p��C��");//�������D
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
