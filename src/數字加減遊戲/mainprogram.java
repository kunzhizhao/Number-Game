package �Ʀr�[��C��;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class mainprogram implements KeyListener{
	static Scanner scan;
	static frame fr;
	static JLabel lb1;
	static JLabel lb2;
	static JLabel lb3;
	static JLabel lb4;
	static TextField ans;
	static int anser;
	static mainprogram mp;
	
	//�D���H����ܳ]�w
	static int a =(int)(Math.random()*3)+1;
	
	//�D��
	static int num1=(int)(Math.random()*99);//�H���Ʀr1
	static int num2=(int)(Math.random()*99);//�H���Ʀr2
	static String number1= Integer.toString(num1);
	static String number2= Integer.toString(num2);
	
	//�D�ơB���T�B���~
	static int quest = 1;//�D�Ƴ]�w
	static int ok;//���T�p��
	static int ng;//���~�p��
	static String question = Integer.toString(quest);//�D�حp����r��
	static String correct = Integer.toString(ok);//���T�p����r��
	static String error = Integer.toString(ng);//���~�p����r��
	
	/*��L��J�ƥ�*/
	public void keyTyped(KeyEvent e){
		
		int key = e.getKeyChar();
		if(key == 10){//KeyEvent.VK_ENTER
			String st = ans.getText();
			anser = Integer.parseInt(st);
			System.out.print(quest+"."+anser);//�beclipse��X�D�ƩM����
			
			int i=1;
			while(i<2) {
			quest++;//�D�ƼW�[
			//�`���ɱN "int���D��" �� "�r��"
			question = Integer.toString(quest);
			lb1.setText("�D�ơG"+question);
			
			//�P�_���׬O�_���T
			if(anser==num1+num2 || anser==num1-num2) {
				System.out.print("���T");
				ok++;
				String correct = Integer.toString(ok);
				lb2.setText("���D���T�G"+correct);
			}else {
				System.out.print("���~");
				ng++;
				String error = Integer.toString(ng);
				lb3.setText("���D���~�G"+error);
			}
			ans.setText(null);//�M�ſ�J��
			//quest++;//�D�ƼW�[
			
			//�D��
			num1=(int)(Math.random()*99);//�H���Ʀr1
			num2=(int)(Math.random()*99);//�H���Ʀr2
			
			String number1= Integer.toString(num1);
			String number2= Integer.toString(num2);
			
			int a =(int)(Math.random()*2)+1;
			switch(a) {
			case 1:
				lb4.setText(number1+"+"+number2+"=");
				break;
			case 2:
				lb4.setText(number1+"-"+number2+"=");
				break;
			}
			i++;//��i�j��ε���2�ɷ|���Xwhile�j��
			}
		}
	}
	
	//�Τ���
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	
	
	public static void main(String[] args) {
		mp = new mainprogram();
		
		/*�s�W���*/
		fr = new frame();
		lb1 = new JLabel();
		lb2 = new JLabel();
		lb3 = new JLabel();
		lb4 = new JLabel();
		ans = new TextField();
		
		fr.setVisible(true);
		
		
		/*�D�ƭp�����*/
		lb1.setLocation(10,0);//x,y�y�СA�]�wlabel�b�������P��ت��Z��
		lb1.setSize(300,70);//�]�wlabel���j�p
		lb1.setText("�D�ơG"+question);
		lb1.setFont(new java.awt.Font("�s�ө���", 0, 18));
		fr.add(lb1);
		
		
		/* ���T�p����� */
		lb2.setLocation(140,0);//x,y�y�СA�]�wlabel�b�������P��ت��Z��
		lb2.setSize(300,70);//�]�wlabel���j�p
		lb2.setText("���D���T�G"+correct);
		lb2.setFont(new java.awt.Font("�s�ө���", 0, 18));
		fr.add(lb2);
		
		
		/* ���~�p����� */
		lb3.setLocation(270,0);//x,y�y�СA�]�wlabel�b�������P��ت��Z��
		lb3.setSize(300,70);//�]�wlabel���j�p
		lb3.setText("���D���~�G"+error);
		lb3.setFont(new java.awt.Font("�s�ө���", 0, 18));
		fr.add(lb3);
		
		
		
		/* �p���D��� */
		lb4.setLocation(50,100);//x,y�y�СA�]�wlabel�b�������P��ت��Z��
		lb4.setSize(205,70);//�]�wlabel���j�p
		//�H�����ͥ[�δ�p���D
		switch(a) {
		case 1:
			lb4.setText(number1+"+"+number2+"=");
			break;
		case 2:
			lb4.setText(number1+"-"+number2+"=");
			break;
		}
		lb4.setFont(new java.awt.Font("�s�ө���", 0, 70));//"�r��˦�"�A"�ʲ�(0�ӡA1��)"�A"�r��j�p"
		fr.add(lb4);
		
		
		/*���׿�J��*/
		ans.setBounds(290,100,140,65);//x,y�y�СA�]�wlabel�b�������P��ت��Z��
		ans.setFont(new java.awt.Font("�s�ө���", 0, 65));//"�r��˦�"�A"�ʲ�(0�ӡA1��)"�A"�r��j�p"
		fr.add(ans);//�N��J�ؿ�X�����
		
		ans.addKeyListener(mp);//�N��J��T�ǤJeclipse
	}
}
