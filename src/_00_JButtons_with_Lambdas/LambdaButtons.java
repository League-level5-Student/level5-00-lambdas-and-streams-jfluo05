package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		tellAJoke.addActionListener((ActionEvent e)->{
			String jokeAnswer=JOptionPane.showInputDialog("What do you call a fake noodle?");
			if (jokeAnswer.equalsIgnoreCase("impasta")||jokeAnswer.equalsIgnoreCase("an impasta")) {
				JOptionPane.showMessageDialog(null,"yay!");
			}else {
				JOptionPane.showMessageDialog(null,"Wrong!");
			}
		});
		addNumbers.addActionListener((ActionEvent e)->{
			String number1= JOptionPane.showInputDialog("Pick a number:");
			int num1= Integer.parseInt(number1);
			String number2= JOptionPane.showInputDialog("Pick another number:");
			int num2= Integer.parseInt(number2);
			int num3=0;
			
			num3=num1+num2;
			JOptionPane.showMessageDialog(null, "The sum of the two numbers you chose is: "+num3);
			
		});
		randNumber.addActionListener((ActionEvent e)->{
			Random r= new Random();
			String number1= JOptionPane.showInputDialog("Choose a number: ");
			int num1= Integer.parseInt(number1);
			JOptionPane.showMessageDialog(null, r.nextInt(num1));
		});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
