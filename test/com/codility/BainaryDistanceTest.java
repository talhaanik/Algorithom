package com.codility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BainaryDistanceTest {

	@Test
	void firstTest() {
		assertEquals(4, BainaryDistance.getBainaryDistanceDivitByTwo(1058));
	}

	@Test
	void secondTest() {
		assertEquals(8, BainaryDistance.getBainaryDistanceDivitByTwo(32835));
	}

}
