package Ex01;

import java.util.Random;

public class SubGame implements operaterGame {
	int num1 = 0;
	int num2 = 0;

	@Override
	public int random() {
		Random rd = new Random();
		int num = rd.nextInt(10)+1;
		return num;
	}

	@Override
	public String getQuizMsg() {
		num1 = random();
		num2 = random();

		// 더 큰 수를 판단하고 큰수에서 작은수를 뺼수 있도록 하자!

		if (num2 > num1) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
		}
		return num1 + " - " + num2 + " = ";
	}

	@Override
	public boolean checkAnswer(int ans) {
		if (ans == (num1 - num2)) {
			return true;
		} else {
			return false;
		}
	}

}
