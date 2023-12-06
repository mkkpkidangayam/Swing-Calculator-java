import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=false;
	double number,result;
	
	JFrame jf;
	JLabel displayLabel,label;
	int calculation;
	JButton SevenButton,EightButton,NineButton,FourButton,FiveButton,EqualtButton,
	SixtButton,OneButton,TwoButton,ThreetButton,DotButton,ZeroButton,DivsiontButton,
	MultitButton,MinusButton,PlusButton,clearButton;
	
	public Calculator() {
		jf=new JFrame("MKKP Calculator");
		jf.setLayout(null);
		jf.getContentPane().setBackground(new Color(10, 65, 100));
		jf.setSize(400, 630);
		jf.setLocation(200, 150);
		
		
		
		
		displayLabel=new JLabel();
		displayLabel.setFont(new Font("Arial",Font.CENTER_BASELINE, 50));
		displayLabel.setBounds(30, 50, 330, 70);
		displayLabel.setBackground(Color.WHITE);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.BLACK);
		jf.add(displayLabel);
		
		label=new JLabel();
		label.setBounds(300, 10, 330, 50);
		label.setFont(new Font("Arial",Font.CENTER_BASELINE, 20));
		label.setForeground(Color.WHITE);
		jf.add(label);
		
		SevenButton=new JButton("7");
		SevenButton.setBounds(30, 160, 60, 60);
		SevenButton.addActionListener(this);
		SevenButton.setFont(new Font("Arial",Font.CENTER_BASELINE, 30));
		jf.add(SevenButton);
		
		EightButton=new JButton("8");
		EightButton.setBounds(120, 160, 60, 60);
		EightButton.addActionListener(this);
		EightButton.setFont(new Font("Arial",Font.CENTER_BASELINE, 30));
		jf.add(EightButton);
		
		NineButton=new JButton("9");
		NineButton.setBounds(210, 160, 60, 60);
		NineButton.addActionListener(this);
		NineButton.setFont(new Font("Arial",Font.CENTER_BASELINE, 30));
		jf.add(NineButton);
		
		FourButton=new JButton("4");
		FourButton.setBounds(30, 250, 60, 60);
		FourButton.addActionListener(this);
		FourButton.setFont(new Font("Arial",Font.CENTER_BASELINE, 30));
		jf.add(FourButton);
		
		FiveButton=new JButton("5");
		FiveButton.setBounds(120, 250, 60, 60);
		FiveButton.addActionListener(this);
		FiveButton.setFont(new Font("Arial",Font.CENTER_BASELINE, 30));
		jf.add(FiveButton);
		
		SixtButton=new JButton("6");
		SixtButton.setBounds(210, 250, 60, 60);
		SixtButton.addActionListener(this);
		SixtButton.setFont(new Font("Arial",Font.CENTER_BASELINE, 30));
		jf.add(SixtButton);
		
		OneButton=new JButton("1");
		OneButton.setBounds(30, 340, 60, 60);
		OneButton.addActionListener(this);
		OneButton.setFont(new Font("Arial",Font.CENTER_BASELINE, 30));
		jf.add(OneButton);
		
		TwoButton=new JButton("2");
		TwoButton.setBounds(120, 340, 60, 60);
		TwoButton.addActionListener(this);
		TwoButton.setFont(new Font("Arial",Font.CENTER_BASELINE, 30));
		jf.add(TwoButton);
		
		ThreetButton=new JButton("3");
		ThreetButton.setBounds(210, 340, 60, 60);
		ThreetButton.addActionListener(this);
		ThreetButton.setFont(new Font("Arial",Font.CENTER_BASELINE, 30));
		jf.add(ThreetButton);
		
		DotButton=new JButton(".");
		DotButton.setBounds(30, 430, 60, 60);
		DotButton.addActionListener(this);
		DotButton.setFont(new Font("Arial",Font.CENTER_BASELINE, 30));
		jf.add(DotButton);
		
		ZeroButton=new JButton("0");
		ZeroButton.setBounds(120, 430, 60, 60);
		ZeroButton.addActionListener(this);
		ZeroButton.setFont(new Font("Arial",Font.CENTER_BASELINE, 30));
		jf.add(ZeroButton);
		
		EqualtButton=new JButton("=");
		EqualtButton.setBounds(210, 430, 60, 60);
		EqualtButton.addActionListener(this);
		EqualtButton.setFont(new Font("Arial",Font.CENTER_BASELINE, 30));
		jf.add(EqualtButton);
		
		DivsiontButton=new JButton("÷");
		DivsiontButton.setBounds(300, 160, 60, 60);
		DivsiontButton.addActionListener(this);
		DivsiontButton.setFont(new Font("Arial",Font.CENTER_BASELINE, 30));
		jf.add(DivsiontButton);
		
		MultitButton=new JButton("x");
		MultitButton.setBounds(300, 250, 60, 60);
		MultitButton.addActionListener(this);
		MultitButton.setFont(new Font("Arial",Font.CENTER_BASELINE, 30));
		jf.add(MultitButton);
		
		MinusButton=new JButton("-");
		MinusButton.setBounds(300, 340, 60, 60);
		MinusButton.addActionListener(this);
		MinusButton.setFont(new Font("Arial",Font.CENTER_BASELINE, 40));
		jf.add(MinusButton);
		
		PlusButton=new JButton("+");
		PlusButton.setBounds(300, 430, 60, 60);
		PlusButton.addActionListener(this);
		PlusButton.setFont(new Font("Arial",Font.CENTER_BASELINE, 30));
		jf.add(PlusButton);
		
		clearButton=new JButton("Clear");
		clearButton.setBounds(30, 520, 330, 40);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Arial",Font.CENTER_BASELINE, 30));
		jf.add(clearButton);
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
	   new Calculator();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		if(e.getSource()== SevenButton) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");

			}
			
		}else if(e.getSource()== EightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");

			}
		}else if(e.getSource()== NineButton) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");

			}
		}else if(e.getSource()== FourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");

			}
		}else if(e.getSource()== FiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");

			}
		}else if(e.getSource()== SixtButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");

			}
		}else if(e.getSource()== OneButton) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");

			}
		}else if(e.getSource()== TwoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");

			}
		}else if(e.getSource()== ThreetButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");

			}
		}else if(e.getSource()== ZeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");

			}
		}else if(e.getSource()== DotButton) {
			if(displayLabel.getText().contains(".")) {
				return;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}

		}else if(e.getSource()== DivsiontButton) {
			String str=displayLabel.getText();
			number = Double.parseDouble(displayLabel.getText());
			displayLabel.setText("");
			label.setText(str+"÷");
			calculation=4;

			
			
		}else if(e.getSource()== MultitButton) {
			number = Double.parseDouble(displayLabel.getText());String str=displayLabel.getText();
			number = Double.parseDouble(displayLabel.getText());
			displayLabel.setText("");
			label.setText(str+"x");
			calculation=3;

			
		}else if(e.getSource()== MinusButton) {
			String str=displayLabel.getText();
			number = Double.parseDouble(displayLabel.getText());
			displayLabel.setText("");
			label.setText(str+"-");
			calculation=2;

			
		}else if(e.getSource()== PlusButton) {
			String str=displayLabel.getText();
			number = Double.parseDouble(displayLabel.getText());
			displayLabel.setText("");
			label.setText(str+"+");
			calculation=1;
		}else if(e.getSource()== EqualtButton) {
		    switch(calculation) {
			case 1:
				result=number + Double.parseDouble(displayLabel.getText());
				displayLabel.setText(Double.toString(result));
				label.setText("");
				break;
				
			case 2:
				result=number - Double.parseDouble(displayLabel.getText());
				displayLabel.setText(Double.toString(result));
				label.setText("");
				break;
			case 3:
				result=number * Double.parseDouble(displayLabel.getText());
				displayLabel.setText(Double.toString(result));
				label.setText("");
				break;
			case 4:	
				result=number / Double.parseDouble(displayLabel.getText());
				displayLabel.setText(Double.toString(result));
				label.setText("");
				break;
			}
			
				
			
			
			
		}else if(e.getSource()== clearButton) {
			displayLabel.setText("");
		}
	}

}
