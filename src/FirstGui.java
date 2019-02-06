import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FirstGui 
{

	public static void main(String[] args) 
	{
		
		JFrame myFrame = new JFrame("My First Frame");
		myFrame.setBounds(400, 400, 350, 250);
		myFrame.setLayout(null);
		
		JTextField txtName = new JTextField();
		txtName.setSize(new Dimension(100,30));
		txtName.setLocation(new Point(210,30));
		myFrame.add(txtName);
		
		JTextField txtPhoneNum = new JTextField();
		txtPhoneNum.setSize(new Dimension(100,30));
		txtPhoneNum.setLocation(new Point(20,30));
		myFrame.add(txtPhoneNum);
		
		JLabel lbl1 = new JLabel("Name");
		lbl1.setBounds(20, 5, 100, 30);
		myFrame.add(lbl1);
		
		JLabel lbl2 = new JLabel("Phone Number");
		lbl2.setBounds(210, 5, 100, 30);
		myFrame.add(lbl2);
		
		JLabel lbl3 = new JLabel("");
		lbl3.setBounds(60, 100, 100, 30);
		myFrame.add(lbl3);
		
		JLabel lbl4 = new JLabel("");
		lbl4.setBounds(260, 100, 100, 30);
		myFrame.add(lbl4);
		
		JButton myButton = new JButton("command");
		myButton.setSize(new Dimension(100,30));
		myButton.setLocation(new Point(120,100));
		myButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						lbl4.setText(txtName.getText());
						lbl3.setText(txtPhoneNum.getText());
						
					}
				});
		myFrame.add(myButton);
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}
