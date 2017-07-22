import java.util.Scanner;

public class MathProblemGenerator {

	public static void main(String[] args) {
		//寻问用户需要
		System.out.println("您需要多少道题？");
		Scanner userInput = new Scanner(System.in);
		
		//储存信息
		int numOfProblems = userInput.nextInt();
		
		//运用信息+循环打印题目
		for(int i = 0; i < numOfProblems; i++) {
			
			//随机两个数字
			int num1 = (int)(Math.random()*9)+1;
			int num2 = (int)(Math.random()*9)+1;
			//打印题目
			System.out.println(num1 + "+" + num2 + "=");
		}
	}

}
