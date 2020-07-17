package SwingTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CalTest extends JFrame 
				implements ActionListener {
	private JTextField tf1 ,tf2 ,tf3;
	
	public CalTest() {
	setTitle("계산기");
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	tf1=new JTextField(5);//숫자1
	tf2=new JTextField(5);//숫자2
	tf3=new JTextField(15);//결과

	JButton b1 =new JButton("+");
	JButton b2 =new JButton("-");
	JButton b3 =new JButton("*");
	JButton b4 =new JButton("/");
	add(new JLabel("숫자1"));
	add(tf1);
	add(new JLabel("숫자2"));
	add(tf2);
	add(b1); add(b2); add(b3); add(b4);
	add(new JLabel("결과"));
	add(tf3);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	
	setSize(600,150);
	setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {//ActionEvent가 어디에 받으냐(문자,버튼)에 따라 달라짐
		String str =e.getActionCommand();//문자로 가져옴
		try {
		int a=Integer.parseInt(tf1.getText());
		int b=Integer.parseInt(tf2.getText());
		switch (str) {
		case "+": tf3.setText(String.valueOf(a+b));break;
		case "-": tf3.setText(a-b+"");break;
		case "*": tf3.setText(a*b+"");break;
		case "/": tf3.setText(a/b+"");break;
		}
	}catch(NumberFormatException n) {
		tf3.setText("숫자입력하세요");
	}catch (ArithmeticException a) {
		tf3.setText("0으로 나눌수 없습니다");
	}
	}
	
	public static void main(String[] args) {
		new CalTest();

	}




}
