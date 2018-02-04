
public class Evaluator {
	
	private String op1;
	private String op2;
	private String op3;
	private String op4;
	private String num1;
	private String num2;
	private String num3;
	private String ans;
	private String status;
	private int roundNum=1;
	private boolean arrow1= true;
	private boolean arrow2= false;
	
	Checker check = new Checker();
	Promoter promote = new Promoter();
	
	Evaluator(){}
	
	public String getOp1() {
		return op1;
	}

	public void eval (String input, String op1, String op2, String num1, String num2,String num3, String ans, int roundNum)
	{
		this.op1 = op1;
		this.op2 = op2;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.ans = ans;
		String set[] = input.split("\\s");
		for(int i =0;i<set.length;i++)
		{
//-----------------------------------------------------PUT FUNCTION -----------------------------------------------------//			
			if(set[0].equalsIgnoreCase("put")||set[0].equalsIgnoreCase("place")||set[0].equalsIgnoreCase("set"))
			{	
				while(i<set.length)
				{
					//PLUS SUBFUNCTION
					if(set[i].equalsIgnoreCase("plus")||set[i].equalsIgnoreCase("add")||set[i].equalsIgnoreCase("+"))
					{
						while(i<set.length)
						{
							if(set[i].equalsIgnoreCase("box")||set[i].equals("carton")||set[i].equals("container"))
							{
								while(i<set.length)
								{
										if(set[i].equalsIgnoreCase("one")||set[i].equals("1"))
										{
											if(op1.equals(""))
											{
												this.op1 = "+";
												this.status = "";
												i=set.length;
											}
											else
											{
												this.status = "<html>Operator box is not empty, <br/> use empty function first </html>";
												i=set.length;
											}
										}
										else if(set[i].equalsIgnoreCase("two")||set[i].equals("2"))
										{
											if(op2.equals(""))
											{
												this.op2 = "+";
												this.status = "";
												i=set.length;
											}
											else
											{
												this.status = "<html>Operator box is not empty, <br/> use empty function first </html>";
												i=set.length;
											}
										}
										else {
											invalid(set, i);
											i++;
										}
								}
							}
							else {
								invalid(set, i);
								i++;
							}
						}
					}
					//MINUS SUBFUNCTION 
					else if (set[i].equalsIgnoreCase("minus")||set[i].equalsIgnoreCase("subtract")||set[i].equalsIgnoreCase("-"))
					{
						while(i<set.length)
						{
							if(set[i].equalsIgnoreCase("box")||set[i].equals("carton")||set[i].equals("container"))
							{
								while(i<set.length)
								{
									
										if(set[i].equalsIgnoreCase("one")||set[i].equals("1"))
											{
												if(op1.equals(""))
												{
													this.op1 = "-";
													this.status = "";
													i=set.length;
												}
												else
												{
													this.status = "<html>Operator box is not empty, <br/> use empty function first </html>";
													i=set.length;
												}
											}
										else if(set[i].equalsIgnoreCase("two")||set[i].equals("2"))
										{
											if(op2.equals(""))
											{
												this.op2 = "-";
												this.status = "";
												i=set.length;
											}
											else
											{
												this.status = "<html>Operator box is not empty, <br/> use empty function first </html>";
												i=set.length;
											}
										}
										else {
											invalid(set, i);
											i++;
										}
								}
							}
							else {
								invalid(set, i);
								i++;
							}
							
						}
					}
					// MULTIPLY
					else if (set[i].equalsIgnoreCase("multiply")||set[i].equalsIgnoreCase("times")||set[i].equalsIgnoreCase("*"))
					{
						while(i<set.length)
						{
							if(set[i].equalsIgnoreCase("box")||set[i].equals("carton")||set[i].equals("container"))
							{
								while(i<set.length)
								{
									if(set[i].equalsIgnoreCase("one")||set[i].equals("1"))
									{
										if(op1.equals(""))
										{
											this.op1 = "*";
											this.status = "";
											i=set.length;
										}
										else
										{
											this.status = "<html>Operator box is not empty, <br/> use empty function first </html>";
											i=set.length;
										}
									}
									else if(set[i].equalsIgnoreCase("two")||set[i].equals("2"))
									{
										if(op2.equals(""))
										{
											this.op2 = "*";
											this.status = "";
											i=set.length;
										}
										else
										{
											this.status = "<html>Operator box is not empty, <br/> use empty function first </html>";
											i=set.length;
										}
									}
									else {
										invalid(set, i);
										i++;
									}
								}
							}
							else {
								invalid(set, i);
								i++;
							}
						}
					}
					//DIVIDE
					else if (set[i].equalsIgnoreCase("divide")||set[i].equalsIgnoreCase("fraction")||set[i].equalsIgnoreCase("/"))
					{
						while(i<set.length)
						{
							if(set[i].equalsIgnoreCase("box")||set[i].equals("carton")||set[i].equals("container"))
							{
								while(i<set.length)
								{
									if(set[i].equalsIgnoreCase("one")||set[i].equals("1"))
									{
										if(op1.equals(""))
										{
											this.op1 = "/";
											this.status = "";
											i=set.length;
										}
										else
										{
											this.status = "<html>Operator box is not empty, <br/> use empty function first </html>";
											i=set.length;
										}
									}
									else if(set[i].equalsIgnoreCase("two")||set[i].equals("2"))
									{
										if(op2.equals(""))
										{
											this.op2 = "/";
											this.status = "";
											i=set.length;
										}
										else
										{
											this.status = "<html>Operator box is not empty, <br/> use empty function first </html>";
											i=set.length;
										}
									}
									else {
										invalid(set, i);
										i++;
									}
								}
							}
							else {
								invalid(set, i);
								i++;
							}
						}
					}
					//EXPONENT
					else if (set[i].equalsIgnoreCase("exponent")||set[i].equalsIgnoreCase("power")||set[i].equalsIgnoreCase("^"))
					{
						while(i<set.length)
						{
							if(set[i].equalsIgnoreCase("box")||set[i].equals("carton")||set[i].equals("container"))
							{
								while(i<set.length)
								{
									if(set[i].equalsIgnoreCase("one")||set[i].equals("1"))
									{
										if(op1.equals(""))
										{
											this.op1 = "^";
											this.status = "";
											i=set.length;
										}
										else
										{
											this.status = "<html>Operator box is not empty, <br/> use empty function first </html>";
											i=set.length;
										}
									}
									else if(set[i].equalsIgnoreCase("two")||set[i].equals("2"))
									{
										if(op2.equals(""))
										{
											this.op2 = "^";
											this.status = "";
											i=set.length;
										}
										else
										{
											this.status = "<html>Operator box is not empty, <br/> use empty function first </html>";
											i=set.length;
										}
									}
									else {
										invalid(set, i);
										i++;
									}
								}
							}
							else {
								invalid(set, i);
								i++;
							}
						}
					}
					else {
						invalid(set, i);
						i++;
						}
				}
			}
			
			
//----------------------------------------------------EMPTY FUNCTION---------------------------------------------------------//
			else if(set[0].equalsIgnoreCase("empty")||set[0].equalsIgnoreCase("vacate")||set[0].equalsIgnoreCase("free"))
			{	

						while(i<set.length)
						{
							if(set[i].equalsIgnoreCase("box")||set[i].equals("carton")||set[i].equals("container"))
							{
								while(i<set.length)
								{
									if(set[i].equalsIgnoreCase("one")||set[i].equals("1"))
									{
										if(op1.equals(""))
										{
										this.status = "Box is already empty";
										i=set.length;
										}
										else
										{
										this.op1 = "";
										this.status = "";
										i=set.length;
										}
									}
									else if(set[i].equalsIgnoreCase("two")||set[i].equals("2"))
									{
										if(op2.equals(""))
										{
										this.status = "Box is already empty";
										i=set.length;
										}
										else
										{
										this.op2 = "";
										this.status = "";
										i=set.length;
										}
									}
									else {
										invalid(set, i);
										i++;
									}
								}
							}
							else {
								invalid(set, i);
								i++;
								}
							
						}
			}
			

//------------------------------------------------------- SWAP FUNCTION -----------------------------------------------------//
			else if(set[0].equalsIgnoreCase("swap")||set[0].equalsIgnoreCase("switch")||set[0].equalsIgnoreCase("exchange"))
			{	
				while(i<set.length)
				{
					//FIRST
					if(set[i].equalsIgnoreCase("1st")||set[i].equals("first"))
					{
						while(i<set.length)
						{
							if(set[i].equals("2nd")||set[i].equals("second"))
							{
								this.num1=num2;
								this.num2=num1;
								i=set.length;
								this.status = "";
							}
							else if(set[i].equals("3rd")||set[i].equals("third"))
							{
								this.num1=num3;
								this.num3=num1;
								i=set.length;
								this.status = "";
							}
							else 
							{
								invalid(set, i);
								i++;
							}
						}
					}
					//SECOND
					else if(set[i].equals("2nd")||set[i].equals("second"))
					{
						while(i<set.length)
						{
							if(set[i].equals("1st")||set[i].equals("first"))
							{
								this.num1=num2;
								this.num2=num1;
								i=set.length;
								this.status = "";
							}
							else if(set[i].equals("3rd")||set[i].equals("third"))
							{
								this.num2=num3;
								this.num3=num2;
								i=set.length;
								this.status = "";
							}
							else 
							{
								invalid(set, i);
								i++;
							}
						}
					}
					//THIRD
					else if(set[i].equalsIgnoreCase("3rd")||set[i].equals("third"))
					{
						while(i<set.length)
						{
							if(set[i].equals("2nd")||set[i].equals("second"))
							{
								this.num3=num2;
								this.num2=num3;
								i=set.length;
								this.status = "";
							}
							else if(set[i].equals("1st")||set[i].equals("first"))
							{
								this.num1=num3;
								this.num3=num1;
								i=set.length;
								this.status = "";
							}
							else 
							{
								invalid(set, i);
								i++;
							}
						}
					}
					else 
						{
						invalid(set, i);
						i++;
						}
				}
				
			}
			
//--------------------------------------------------------- CHECK FUNCTION -----------------------------------------------------//
			else if(set[0].equalsIgnoreCase("check")||set[0].equalsIgnoreCase("verify")||set[0].equalsIgnoreCase("confirm"))
			{	
				while(i<set.length)
				{
					if(set[i].equalsIgnoreCase("answer")||set[i].equalsIgnoreCase("equation")||set[i].equalsIgnoreCase("formula"))
					{
						if(op1.equalsIgnoreCase("")||op2.equalsIgnoreCase(""))
						{
							this.status="<html>there are undeclared operators,<br/> please try again</html>";
							i=set.length;
						}
						else
						{
							int answer = check.check(op1, op2, num1, num2, num3);
							if(answer == Integer.valueOf(ans))
							{
								if(roundNum==5)
								{
									this.status = "Your answer is correct, you have finished the game";
									i=set.length;
								}
								else
								{
									this.status = "Your answer is correct, proceed to the next level";
									i=set.length;
								}
							}
							else
							{
								this.status = "Your answer is wrong, try again";
								i=set.length;
							}
						}
					}
					else
					{
						invalid(set, i);
						i++;
					}

			}
		}
			
//---------------------------------------------------------- NEXT FUNCTION -----------------------------------------------------//
			else if(set[0].equalsIgnoreCase("go")||set[0].equalsIgnoreCase("continue")||set[0].equalsIgnoreCase("proceed"))
			{	
				while(i<set.length)
				{
					if(set[i].equalsIgnoreCase("next")||set[i].equalsIgnoreCase("following")||set[i].equalsIgnoreCase("succeeding"))
					{
						int temp = roundNum+1;
						if(temp==1)
						{
							promote.Round(1);
							copier();
							this.status = "Welcome to round 1";
							this.roundNum = 1;
							i=set.length;
						}
						else if(temp==2)
						{
							promote.Round(2);
							copier();
							this.status = "Welcome to round 2";
							this.roundNum = 2;
							i=set.length;
						}
						else if(temp==3)
						{
							promote.Round(3);
							copier();
							this.status = "Welcome to round 3";
							this.roundNum = 3;
							i=set.length;
						}
						else if(temp==4)
						{
							promote.Round(4);
							copier();
							this.status = "Welcome to round 4";
							this.roundNum = 4;
							i=set.length;
						}
						else if(temp==5)
						{
							promote.Round(5);
							copier();
							this.status = "Welcome to round 5";
							this.roundNum = 5;
							i=set.length;
						}
						else 
						{
							this.status = "You have reached the last level (stage 5).";
							i++;
						}
						
					}
					else if(set[i].equalsIgnoreCase("round")||set[i].equalsIgnoreCase("level")||set[i].equalsIgnoreCase("stage"))
					{
						while(i<set.length)
						{
							if(set[i].equalsIgnoreCase("one")||set[i].equals("1"))
							{
								promote.Round(1);
								copier();
								this.status = "Welcome to round 1";
								this.roundNum = 1;
								i=set.length;
							}
							else if(set[i].equalsIgnoreCase("two")||set[i].equals("2"))
							{
								promote.Round(2);
								copier();
								this.status = "Welcome to round 2";
								this.roundNum = 2;
								i=set.length;
							}
							else if(set[i].equalsIgnoreCase("three")||set[i].equals("3"))
							{
								promote.Round(3);
								copier();
								this.status = "Welcome to round 3";
								this.roundNum = 3;
								i=set.length;
							}
							else if(set[i].equalsIgnoreCase("four")||set[i].equals("4"))
							{
								promote.Round(4);
								copier();
								this.status = "Welcome to round 4";
								this.roundNum = 4;
								i=set.length;
							}
							else if(set[i].equalsIgnoreCase("five")||set[i].equals("5"))
							{
								promote.Round(5);
								copier();
								this.status = "Welcome to round 5";
								this.roundNum = 5;
								i=set.length;
							}
							else 
							{
								this.status = "invalid command or round number, try again";
								i++;
							}
						}
					}
					else 
					{
						invalid(set, i);
						i++;
					}
				}

			}
			
//----------------------------------------------- ARROW POINTER --------------------------------------------------------------//
		
			else if(set[0].equalsIgnoreCase("locate")||set[0].equalsIgnoreCase("point")||set[0].equalsIgnoreCase("find"))
			{	

						while(i<set.length)
						{
							if(set[i].equalsIgnoreCase("box")||set[i].equals("carton")||set[i].equals("container"))
							{
								while(i<set.length)
								{
									if(set[i].equalsIgnoreCase("one")||set[i].equals("1"))
									{
										this.arrow1 = true;
										this.arrow2 = false;
										i=set.length;
										this.status = "Arrow is pointing at box 1.";
									}
									else if(set[i].equalsIgnoreCase("two")||set[i].equals("2"))
									{
										this.arrow2 = true;
										this.arrow1 = false;
										i=set.length;
										this.status = "Arrow is pointing at box 2.";
									}
									else {
										invalid(set, i);
										i++;
									}
								}
							}
							else {
								invalid(set, i);
								i++;
								}
							
						}
			}
			
			else {invalid(set, i);}
			

			
	}//for-loop closing bracket
		
}//eval closing bracket

	public int getRoundNum() {
		return roundNum;
	}

	public void setRoundNum(int roundNum) {
		this.roundNum = roundNum;
	}

	public String getNum1() {
		return num1;
	}

	public void setNum1(String num1) {
		this.num1 = num1;
	}

	public String getNum2() {
		return num2;
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}

	public String getNum3() {
		return num3;
	}

	public void setNum3(String num3) {
		this.num3 = num3;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	private void copier() {
		this.op1="";
		this.op2="";
		this.num1 = promote.getNum1();
		this.num2 = promote.getNum2();
		this.num3 = promote.getNum3();
		this.ans = promote.getAns();
	}

	private void invalid(String[] set, int i) {
		if(i+1==set.length)
		{
			this.status = "invalid command, try again";
		}
	}
	
	public void setOp1(String op1) {
		this.op1 = op1;
	}

	public String getOp2() {
		return op2;
	}

	public void setOp2(String op2) {
		this.op2 = op2;
	}

	public String getOp3() {
		return op3;
	}

	public void setOp3(String op3) {
		this.op3 = op3;
	}

	public String getOp4() {
		return op4;
	}

	public void setOp4(String op4) {
		this.op4 = op4;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isArrow1() {
		return arrow1;
	}

	public void setArrow1(boolean arrow1) {
		this.arrow1 = arrow1;
	}

	public boolean isArrow2() {
		return arrow2;
	}

	public void setArrow2(boolean arrow2) {
		this.arrow2 = arrow2;
	}
	
}
