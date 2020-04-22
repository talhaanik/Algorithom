package com.codility;

public class BainaryDistance {
	
	public static int getBainaryDistanceDivitByTwo(int num) {
		int max=0,count=0;
		boolean hasOne=false;
		while(num!=0) {
			int binDigt=num % 2;
			num=num / 2;
			if(binDigt==1) {
				hasOne=true;
				if(count>max) {
					max=count;
					count=0;
				}
			}else if(hasOne && binDigt==0) {
				count++;
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		System.out.println(getBainaryDistanceDivitByTwo(1058));

	}

}
