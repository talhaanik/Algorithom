package com.codility;

public class BainaryDistance {

	public static int getBainaryDistanceDivitByTwo(int num) {
		int max = 0, count = 0;
		boolean hasOne = false;
		while (num != 0) {
			int binDigt = num % 2;
			num = num / 2;
			if (binDigt == 1) {
				hasOne = true;
				if (count > max) {
					max = count;
					count = 0;
				}
			} else if (hasOne && binDigt == 0) {
				count++;
			}
		}

		return max;
	}

	public static int getBinDisntcString(int intNum) {
		int max = 0, index = 0, preIndex = 0, distance;
		 String num = Integer.toBinaryString(intNum);
		 System.out.println(num);
		while (index < num.length()&& preIndex !=-1) {
			index = num.indexOf(49, index);

			//System.out.println(index);
			distance = index - preIndex - 1;
			if (distance > max) {
				max = distance;
			}
			preIndex = index;
			index++;
		}

		return max;
	}

	public static void main(String[] args) {

		// for (int a = 49; a < 80; a++) System.out.println((char) a);
		long st=System.currentTimeMillis();
			System.out.println(getBinDisntcString(32835));
			
			long et=System.currentTimeMillis();
			System.out.println(et-st);
		
	}

}
