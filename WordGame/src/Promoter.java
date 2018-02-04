
public class Promoter {

	private String num1;
	private String num2;
	private String num3;
	private String ans;
	private int roundNum;
	

	Promoter(){}
	
	public void Round(int roundNum)
	{
		if(roundNum==1)
		{
			num1 = "1";
			num2 = "2";
			num3 = "3";
			ans = "6";
		}
		else if (roundNum==2)
		{
			num1 = "12";
			num2 = "7";
			num3 = "3";
			ans = "28";
		}
		else if (roundNum==3)
		{
			num1 = "7";
			num2 = "6";
			num3 = "13";
			ans = "85";
		}
		else if (roundNum==4)
		{
			num1 = "5";
			num2 = "5";
			num3 = "2";
			ans = "5";
		}
		else if (roundNum==5)
		{
			num1 = "2";
			num2 = "3";
			num3 = "3";
			ans = "12";
		}
		else
		{}
		
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
	public int getRoundNum() {
		return roundNum;
	}

	public void setRoundNum(int roundNum) {
		this.roundNum = roundNum;
	}
}
