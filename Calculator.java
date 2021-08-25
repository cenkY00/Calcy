import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

	JFrame frame;
	JTextField textField;
	JButton[] numberButtons = new JButton[10];
	JButton[] functinonsButtons = new JButton[8];
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, delButton, clrButton;
	JPanel panel;
	
	Font myFont = new Font("Ink Free", Font.BOLD, 30);
	
	double num1=0,num2=0,result=0;
	char operator;
	
	Calculator() {
		
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0;i<10;i++) {
			if(e.getSource() == numberButtons[i]) {
				textField.setText(textField.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource()==decButton) {
			textField.setText(textField.getText().concat("."));
		}
		if(e.getSource()==addButton) {
			num1 = Double.parseDouble(textField.getText());
			operator ='+';
			textField.setText("");
		}
		if(e.getSource()==subButton) {
			num1 = Double.parseDouble(textField.getText());
			operator ='-';
			textField.setText("");
		}
		if(e.getSource()==mulButton) {
			num1 = Double.parseDouble(textField.getText());
			operator ='*';
			textField.setText("");
		}
		if(e.getSource()==divButton) {
			num1 = Double.parseDouble(textField.getText());
			operator ='/';
			textField.setText("");
		}
		if(e.getSource()==equButton) {
			num2=Double.parseDouble(textField.getText());
			
			switch(operator) {
			case'+':
				result=num1+num2;
				break;
			case'-':
				result=num1-num2;
				break;
			case'*':
				result=num1*num2;
				break;
			case'/':
				result=num1/num2;
				break;
			}
			textField.setText(String.valueOf(result));
			num1=result;
		}
		if(e.getSource()==clrButton) {
			textField.setText("");
		}
		if(e.getSource()==delButton) {
			String string = textField.getText();
			textField.setText("");
			for(int i=0;i<string.length()-1;i++) {
				textField.setText(textField.getText()+string.charAt(i));
			}
		}
		if(e.getSource()==negButton) {
			double temp = Double.parseDouble(textField.getText());
			temp*=-1;
			textField.setText(String.valueOf(temp));
		}
	}

}
