import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Controller {
      
	private Veiw V = new Veiw();
	private Model M;
	private int answer,num2;
	
	public Controller(){
		
		V = new Veiw();
		M = new Model();
		
		V.buttons[14].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(V.getFlag1())
				try {
					
					M.setNumber1(V.getnumber1());
					num2 = Integer.parseInt(V.getResult());
					M.setNumber2(num2);
					
					answer=M.getResult(V.getOperation());
					V.setResult(answer);
				
				} catch (NumberFormatException exeption) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(V,"Please enter a valid number");	
				}		
				
			}
				
			});
	  }
}
	

