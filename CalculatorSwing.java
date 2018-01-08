package Calculator;
/* a simple swing calculator.
 Created by Siphiwe Khoza
 25 August 2017 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class CalculatorSwing {

	public CalculatorSwing() {
		JFrame f = new JFrame("Siphiwe`s Calc");
		f.setLocation(250, 100);
		//
		JLabel jcalc = new JLabel("Calculator");
		JPanel jpcalc = new JPanel();
		// c
		JLabel firstNum = new JLabel("First NO");
		JLabel SecondNum = new JLabel("Second NO");
		//JLabel answer = new JLabel("Answer");
		final JTextField jtext = new JTextField(5);
		final JTextField jtext1 = new JTextField(5);
		final JTextField jresult = new JTextField(10);

		JPanel jpcenter = new JPanel();
		JButton Add = new JButton("Add");
		JButton Mul = new JButton("Mul");
		JButton Sub = new JButton("Sub");
		JButton Div = new JButton("Div");
		JButton clear = new JButton("C");
		JPanel jbButons = new JPanel();

		jpcalc.setLayout(new FlowLayout(FlowLayout.CENTER));
		jpcenter.setLayout(new GridLayout(3, 2, 1, 4));

		jpcalc.add(jcalc);

		jpcenter.add(firstNum);
		jpcenter.add(jtext);
		jpcenter.add(SecondNum);
		jpcenter.add(jtext1);
		jpcenter.add(jresult);
		//jpcenter.add(answer);
		jbButons.add(Add);
		jbButons.add(Div);
		jbButons.add(Sub);
		jbButons.add(Mul);
		jbButons.add(clear);
		Container c = f.getContentPane();
		c.add(jpcalc, BorderLayout.NORTH);
		c.add(jpcenter, BorderLayout.CENTER);
		c.add(jbButons, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);

		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int x = Integer.parseInt(jtext.getText());
				int y = Integer.parseInt(jtext1.getText());
				jresult.setText(String.valueOf(x + y));
			}
		});
		Mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int x = Integer.parseInt(jtext.getText());
				int y = Integer.parseInt(jtext1.getText());
				jresult.setText(String.valueOf(x * y));
			}
		});
		Div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int x = Integer.parseInt(jtext.getText());
				int y = Integer.parseInt(jtext1.getText());
				jresult.setText(String.valueOf(x / y));
			}
		});

		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				jresult.setText("");
			}

		});

		Sub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int x = Integer.parseInt(jtext.getText());
				int y = Integer.parseInt(jtext1.getText());
				jresult.setText(String.valueOf(x - y));
			}

		});

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CalculatorSwing();
	}

}
