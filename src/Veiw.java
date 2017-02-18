import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Veiw extends JFrame implements ActionListener {

	
    public int number1,number2,operation;

	private boolean Flag1=false;
	public JButton[] buttons; // array of buttons
	private static final String[] names =
	{"7","8","9","/","4","5","6","*","1","2","3","+","0","%","=","-"};
	private JTextField result;
	private JPanel keys;
	
	
	public Veiw()
	{
	super( "MVC" );

	this.setVisible(true);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(400, 400);
	keys = new JPanel();
	keys.setLayout( new GridLayout(4,4)); // set JPanel layout
	buttons = new JButton[ names.length ]; // create array of JButtons
	for ( int count = 0; count < names.length; count++ )
	{
	buttons[ count ] = new JButton( names[ count ] );
	buttons[count].addActionListener(this);
	keys.add( buttons[ count ] ); // add button to JPanel
	}
	result = new JTextField("");
	result.setHorizontalAlignment(JTextField.RIGHT);
	result.setEditable(true);
	Font font1 = new Font("SansSerif", Font.BOLD, 20);
	result.setFont(font1);
	add(result, BorderLayout.NORTH);
	add(keys, BorderLayout.CENTER);
	}
	
	
	
	public void actionPerformed(ActionEvent event )

	{
		if(event.getSource()==buttons[0])
		{
			result.setText(result.getText()+7);
		}
		else if(event.getSource()==buttons[1])
		{
			result.setText(result.getText()+8);
		}
		else if(event.getSource()==buttons[2])
		{
			result.setText(result.getText()+9);
		}
		else if(event.getSource()==buttons[4])
		{
			result.setText(result.getText()+4);
		}
		
		else if(event.getSource()==buttons[5])
		{
			result.setText(result.getText()+5);
		}
		else if(event.getSource()==buttons[6])
		{
			result.setText(result.getText()+6);
		}
		
		else if(event.getSource()==buttons[8])
		{
			result.setText(result.getText()+1);
		}		
		
		else if(event.getSource()==buttons[9])
		{
			result.setText(result.getText()+2);
		}
		else if(event.getSource()==buttons[10])
		{
			result.setText(result.getText()+3);
		}
			
		else if(event.getSource()==buttons[12])
		{
			result.setText(result.getText()+0);
		}
//////////////////////////////////////////////////////////////////////////		
		else if(event.getSource()==buttons[3])
		{ 
			///
			
			try {
				number1 = Integer.parseInt(result.getText());
			} catch (NumberFormatException exeption) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(this,"Please enter a valid number");
			}
			result.setText("");
			operation=3;
			Flag1=true;
		}
		
		else if(event.getSource()==buttons[7])
		{ 
			//*
			
			try {
				number1 = Integer.parseInt(result.getText());
			} catch (NumberFormatException exeption) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(this,"Please enter a valid number");
			}
			result.setText("");
			operation=2;
			Flag1=true;
		}
		else if(event.getSource()==buttons[11])
		{ 
			//+
			
			try {
				number1 = Integer.parseInt(result.getText());
			} catch (NumberFormatException exeption) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(this,"Please enter a valid number");
			}
			result.setText("");
			operation=0;
			Flag1=true;
		}
		else if(event.getSource()==buttons[15])
		{ 
			//-
			
			
			try {
				number1 = Integer.parseInt(result.getText());
			} catch (NumberFormatException exeption) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(this,"Please enter a valid number");
			}
			result.setText("");
			operation=1;
			Flag1=true;
			
		}
		else if(event.getSource()==buttons[13])
		{ 
			//%
			
			
			try {
				number1 = Integer.parseInt(result.getText());
			} catch (NumberFormatException exeption) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(this,"Please enter a valid number");
			}
			result.setText("");
			operation=4;
			Flag1=true;
			
		}

			

			
		
		
		
		
	}
	public String getResult()
	{
		return result.getText();
	}
   
	 public int getOperation()
	   {
		   return operation;
	   }
	 
	 public int getnumber1()
	   {
		   return number1;
	   }
	 public int getnumber2()
	   {
		   return number2;
	   }
	 public void setResult(int value)
	 {
		 result.setText(""+value);
	 }
	 public boolean getFlag1()
	 {
		 return Flag1;
	 }

}

  