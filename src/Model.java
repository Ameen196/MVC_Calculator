import javax.swing.JOptionPane;

public class Model {
	
	private int num1;
	private int num2;
	private int result;
	
	
	public Model(){
		

		
	}
	
	public void setNumber(int x,int y){
		num1=x;
		num2=y;
		
	}
	
	public void setNumber1(int x){
		num1=x;
		
		
	}
	public void setNumber2(int y){
		
		num2=y;
		
	}
	
    public int getNumber1(){
		
		return num1;
	}
    public int getNumber2(){
	
	return num2;
    }

    public int getResult(int operation){
    	if(operation==0)
    		result=num1+num2;
    	
    	else if(operation==1)
    		result=num1-num2;
    	else if(operation==2)
    		result=num1*num2;
    	else if(operation==3)
    	{	
    		try {
				result = num1 / num2;
			} catch (ArithmeticException e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null,"you can not divide by zero!!");
			}
    	}
    	else if(operation==4)
    		result=num1%num2;
    	
    	return result;
    }
	

}
