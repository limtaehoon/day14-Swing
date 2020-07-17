package SwingTest;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class SwingTest extends JFrame implements ActionListener {
	private JTextField tfl;
	private  JTextArea ta;
	public SwingTest() {
		setTitle("연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		 tfl =new JTextField(20);
		JButton btn =new JButton("클릭");
		 ta =new JTextArea(5,50);
		btn.addActionListener(this);
		add(tfl);
		add(btn);
		add(ta);
		setSize(500,500);
		setVisible(true);
		
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ta.append(tfl.getText()+"\n");
		tfl.setText("");
}
		
	
	public static void main(String[] args) {
		new SwingTest();

	

	}


}
