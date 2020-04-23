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
	public static int log(int x, int base)
	{
	    return (int) (Math.log(x) / Math.log(base));
	}
	public static int masureGapUsingLog(int num) {
		
		int max=0;
		int pp=0;
		while(num>0) {
			int numPow=log(num,2);
			int dis=pp-numPow-1;
			if(dis>max) {
				max=dis;
			}
			pp=numPow;
			
			int cnum=(int) Math.pow((double) 2, (double) numPow);
			num=num-cnum;
			
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
