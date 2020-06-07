package com.codility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BainaryDistanceTest {


	@Test
	void firstAlgoritham(){
		assertEquals(3, BainaryDistance.getBainaryDistanceDivitByTwo(2147473646));
	}
	
	@Test
	void secondAlgoritham(){
		assertEquals(3, BainaryDistance.getBinDisntcString(2147473646));
	}
	
	@Test
	void thirdAlgoritham(){
		assertEquals(3, BainaryDistance.masureGapUsingLog(2147473646));
	}
	

}
