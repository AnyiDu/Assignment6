import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame {



	public static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		// create JLabel1
		JLabel label1 = new JLabel("Total Assignment Points: ");
		label1.setBounds(10,20,80,25);
		panel.add(label1);
		JTextField textField1 = new JTextField(16);
		textField1.setBounds(100,20,165,25);
		panel.add(textField1);

		// creat Jlable2
		JLabel label2 = new JLabel("Earned Points: ");
		label2.setBounds(10,50,80,25);
		panel.add(label2);
		JTextField textField2 = new JTextField(16);
		textField2.setBounds(100,50,165,25);
		panel.add(textField2);

		//creat label3
		JLabel label3 = new JLabel("Percentage of class: ");
		label3.setBounds(10,80,80,25);
		panel.add(label3);
		JTextField textField3 = new JTextField(16);
		textField3.setBounds(100,80,165,25);
		panel.add(textField3);

		// creat Jlabel4

		JLabel label4 = new JLabel("Weighted Score: ");
		label4.setBounds(10,110,80,25);
		panel.add(label4);
		JTextField textField4 = new JTextField(16);
		textField4.setBounds(100,110,165,25);
		panel.add(textField4);

		JButton DButton = new JButton("Calcuate grade");
		DButton.setBounds(100, 180, 165, 25);
		DButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String s1 = textField1.getText();
				String s2 = textField2.getText();
				String s3 = textField3.getText();

				double pT = Double.valueOf(s1.toString());
				double eP = Double.valueOf(s2.toString());

				boolean flag = s3.contains("%");//judge whether input contains %
				double A;
				if(flag) A = (double) Double.parseDouble(s3.substring(0, s3.length() - 1));//if input a percentage
				else A = (double) Double.parseDouble(s3);//if input a double
				student stu = new student();
				stu.setPointTotal(pT);
				stu.setEarnedPoint(eP);
				stu.setAssignment(A);
				stu.setTotalWeightedGrade();
				String g = String.valueOf(stu.getTotalWeightedGrade());
				textField4.setText(g);

			}
		} );
		panel.add(DButton);
	}
}