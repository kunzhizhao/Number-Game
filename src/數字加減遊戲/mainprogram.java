package 數字加減遊戲;
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
	
	//題目隨機選擇設定
	static int a =(int)(Math.random()*3)+1;
	
	//題目
	static int num1=(int)(Math.random()*99);//隨機數字1
	static int num2=(int)(Math.random()*99);//隨機數字2
	static String number1= Integer.toString(num1);
	static String number2= Integer.toString(num2);
	
	//題數、正確、錯誤
	static int quest = 1;//題數設定
	static int ok;//正確計數
	static int ng;//錯誤計數
	static String question = Integer.toString(quest);//題目計數轉字串
	static String correct = Integer.toString(ok);//正確計數轉字串
	static String error = Integer.toString(ng);//錯誤計數轉字串
	
	/*鍵盤輸入事件*/
	public void keyTyped(KeyEvent e){
		
		int key = e.getKeyChar();
		if(key == 10){//KeyEvent.VK_ENTER
			String st = ans.getText();
			anser = Integer.parseInt(st);
			System.out.print(quest+"."+anser);//在eclipse輸出題數和答案
			
			int i=1;
			while(i<2) {
			quest++;//題數增加
			//循環時將 "int的題數" 轉 "字串"
			question = Integer.toString(quest);
			lb1.setText("題數："+question);
			
			//判斷答案是否正確
			if(anser==num1+num2 || anser==num1-num2) {
				System.out.print("正確");
				ok++;
				String correct = Integer.toString(ok);
				lb2.setText("答題正確："+correct);
			}else {
				System.out.print("錯誤");
				ng++;
				String error = Integer.toString(ng);
				lb3.setText("答題錯誤："+error);
			}
			ans.setText(null);//清空輸入框
			//quest++;//題數增加
			
			//題目
			num1=(int)(Math.random()*99);//隨機數字1
			num2=(int)(Math.random()*99);//隨機數字2
			
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
			i++;//當i大於或等於2時會跳出while迴圈
			}
		}
	}
	
	//用不到
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	
	
	public static void main(String[] args) {
		mp = new mainprogram();
		
		/*新增原件*/
		fr = new frame();
		lb1 = new JLabel();
		lb2 = new JLabel();
		lb3 = new JLabel();
		lb4 = new JLabel();
		ans = new TextField();
		
		fr.setVisible(true);
		
		
		/*題數計數顯示*/
		lb1.setLocation(10,0);//x,y座標，設定label在視窗內與邊框的距離
		lb1.setSize(300,70);//設定label的大小
		lb1.setText("題數："+question);
		lb1.setFont(new java.awt.Font("新細明體", 0, 18));
		fr.add(lb1);
		
		
		/* 正確計數顯示 */
		lb2.setLocation(140,0);//x,y座標，設定label在視窗內與邊框的距離
		lb2.setSize(300,70);//設定label的大小
		lb2.setText("答題正確："+correct);
		lb2.setFont(new java.awt.Font("新細明體", 0, 18));
		fr.add(lb2);
		
		
		/* 錯誤計數顯示 */
		lb3.setLocation(270,0);//x,y座標，設定label在視窗內與邊框的距離
		lb3.setSize(300,70);//設定label的大小
		lb3.setText("答題錯誤："+error);
		lb3.setFont(new java.awt.Font("新細明體", 0, 18));
		fr.add(lb3);
		
		
		
		/* 計算題顯示 */
		lb4.setLocation(50,100);//x,y座標，設定label在視窗內與邊框的距離
		lb4.setSize(205,70);//設定label的大小
		//隨機產生加或減計算題
		switch(a) {
		case 1:
			lb4.setText(number1+"+"+number2+"=");
			break;
		case 2:
			lb4.setText(number1+"-"+number2+"=");
			break;
		}
		lb4.setFont(new java.awt.Font("新細明體", 0, 70));//"字體樣式"，"粗細(0細，1粗)"，"字體大小"
		fr.add(lb4);
		
		
		/*答案輸入框*/
		ans.setBounds(290,100,140,65);//x,y座標，設定label在視窗內與邊框的距離
		ans.setFont(new java.awt.Font("新細明體", 0, 65));//"字體樣式"，"粗細(0細，1粗)"，"字體大小"
		fr.add(ans);//將輸入框輸出到視窗
		
		ans.addKeyListener(mp);//將輸入資訊傳入eclipse
	}
}
