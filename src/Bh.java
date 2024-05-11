
public class Bh {
  
  

public static int getReverseNumber(int number,int result) {
	System.out.println("I am inside reverse number \n");
	while(number>0)
	{result=(result*10)+(number%10);
	number=number/10;
	}
	System.out.println("result=" +result);
	return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int person =23456;
	int result =0;
System.out.println("I am inside void main ");	
int output = getReverseNumber(person,result);
System.out.println("Function end ");			 
	}

}
