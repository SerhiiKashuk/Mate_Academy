package academy.mate;

import java.util.Arrays;

public class Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 30;
		int[] months = new int[12];
		for (int i = 0; i < months.length; i++) {
		  if (i <= 6) {
			if (i % 2 == 1) {
			  if (i == 1) {
				months[i] = temp - 2;
			  } else {
				months[i] = temp;
			    }
			} else {
				months[i] = temp + 1;
				}
		  } else {
			if (i % 2 == 1) {
			  months[i] = temp + 1;
			} else {
			  months[i] = temp;
			  }
			}
		}
		System.out.println(Arrays.toString(months));
	}
}
