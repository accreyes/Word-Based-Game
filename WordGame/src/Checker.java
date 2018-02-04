
public class Checker {
	
	
	Checker(){}
	
	public int check (String op1, String op2, String num1, String num2,String num3)
	{
		int answer = 0;
		int temp1;
		int temp2;
		//OP 1 EXOPONENT
		if(op1.equalsIgnoreCase("^"))
		{
			temp1 = (int) Math.pow(Integer.valueOf(num1), Integer.valueOf(num2));
			if(op2.equalsIgnoreCase("^"))
			{
				answer = (int) Math.pow(temp1, Integer.valueOf(num3));
			}
			else if(op2.equalsIgnoreCase("*"))
			{
				answer = temp1 * Integer.valueOf(num3);
			}
			else if(op2.equalsIgnoreCase("/"))
			{
				answer = temp1 / Integer.valueOf(num3);
			}
			else if(op2.equalsIgnoreCase("+"))
			{
				answer = temp1 + Integer.valueOf(num3);
			}
			else if(op2.equalsIgnoreCase("-"))
			{
				answer = temp1 - Integer.valueOf(num3);
			}
			else {}
		}
		//OP 2 EXPONENT
		else if (op2.equalsIgnoreCase("^"))
		{
			temp1 = (int) Math.pow(Integer.valueOf(num2), Integer.valueOf(num3));
			if(op1.equalsIgnoreCase("^"))
			{
				answer = (int) Math.pow(Integer.valueOf(num1),temp1 );
			}
			else if(op1.equalsIgnoreCase("*"))
			{
				answer = temp1 * Integer.valueOf(num1);
			}
			else if(op1.equalsIgnoreCase("/"))
			{
				answer = Integer.valueOf(num1)/temp1;
			}
			else if(op1.equalsIgnoreCase("+"))
			{
				answer = temp1 + Integer.valueOf(num1);
			}
			else if(op1.equalsIgnoreCase("-"))
			{
				answer = Integer.valueOf(num1)-temp1;
			}
		}
		//OP 1 MULTIPLY/DIVIDE
		else if (op1.equalsIgnoreCase("*")||op1.equalsIgnoreCase("/"))
		{
			if(op1.equalsIgnoreCase("*"))
			{
			temp1 = Integer.valueOf(num1)*Integer.valueOf(num2);
			}
			else
			{
			temp1 = Integer.valueOf(num1)/Integer.valueOf(num2);
			}
			
			if(op2.equalsIgnoreCase("*"))
			{
				answer = temp1 * Integer.valueOf(num3);
			}
			else if(op2.equalsIgnoreCase("/"))
			{
				answer = temp1 / Integer.valueOf(num3);
			}
			else if(op2.equalsIgnoreCase("+"))
			{
				answer = temp1 + Integer.valueOf(num3);
			}
			else if(op2.equalsIgnoreCase("-"))
			{
				answer = temp1 - Integer.valueOf(num3);
			}
			else {}
		}
		//OP 2 MULTIPLY/DIVIDE
		else if (op2.equalsIgnoreCase("*")||op2.equalsIgnoreCase("/"))
		{
			if(op2.equalsIgnoreCase("*"))
			{
			temp1 = Integer.valueOf(num2)*Integer.valueOf(num3);
			}
			else
			{
			temp1 = Integer.valueOf(num2)/Integer.valueOf(num3);
			}
			
			if(op1.equalsIgnoreCase("*"))
			{
				answer = temp1 * Integer.valueOf(num1);
			}
			else if(op1.equalsIgnoreCase("/"))
			{
				answer = Integer.valueOf(num1)/temp1;
			}
			else if(op1.equalsIgnoreCase("+"))
			{
				answer = temp1 + Integer.valueOf(num1);
			}
			else if(op1.equalsIgnoreCase("-"))
			{
				answer = Integer.valueOf(num1)-temp1;
			}
		}
		//OP 1 ADD/SUBTRACT
		else if (op1.equalsIgnoreCase("+")||op1.equalsIgnoreCase("-"))
		{
			if(op1.equalsIgnoreCase("+"))
			{
			temp1 = Integer.valueOf(num1)+Integer.valueOf(num2);
			}
			else
			{
			temp1 = Integer.valueOf(num1)-Integer.valueOf(num2);
			}
			
			if(op2.equalsIgnoreCase("+"))
			{
				answer = temp1 + Integer.valueOf(num3);
			}
			else if(op2.equalsIgnoreCase("-"))
			{
				answer = temp1 - Integer.valueOf(num3);
			}
			else {}
		}
		else
		{}
		
		return answer;
	}
	
}
