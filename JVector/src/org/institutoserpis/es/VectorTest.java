package org.institutoserpis.es;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class VectorTest {

//	@Test
//	void index_Of() {
//		int num1 = 50;
//		int[] array1=new int [] {16,12,15,14,17,num1};	
//		assertEquals(-1, Vector.index_Of(array1, 50));
//	}
//	@Test
//	void index_OfEmpty() {
//		int[] v = new int [] {};
//		assertEquals(-1, Vector.index_Of(v, 55));
//	}
	
	@Test
	void min() {
		assertEquals(12,Vector.min(new int[] {16,15,14,17,12} ));
		assertEquals(12,Vector.min(new int[] {16,15,14,12,17} ));
		assertEquals(12,Vector.min(new int[] {16,12,15,14,17} ));
		assertEquals(12,Vector.min(new int[] {16,15,12} ));
		assertEquals(12,Vector.min(new int[] {12} ));
		assertEquals(12,Vector.min(new int[] {60,12} ));

		
	}
	@Test
	void minPosition() {
		assertEquals(4,Vector.minPosition(new int[] {16,15,14,17,12} ));
		assertEquals(0,Vector.minPosition(new int[] {12} ));
		assertEquals(2,Vector.minPosition(new int[] {14,17,12} ));
		assertEquals(3,Vector.minPosition(new int[] {15,14,17,12} ));
		assertEquals(2,Vector.minPosition(new int[] {16,15,14} ));
	}
	@Test
	void sort() {
		int [] v = new int[] {12,28,27,26};
		Vector.sort(v);
		assertArrayEquals(new int[] {12,26,27,28},v);
		v = new int[] {12,27,26,27};
		Vector.sort(v);
		assertArrayEquals(new int[] {12,26,27,27},v);
		v =  new int []{35,90,67,54,32,1,98,75,64,97};
		Vector.sort(v);
		assertArrayEquals(new int[] {1,32,35,54,64,67,75,90,97,98},v);
		v = new int[] {};
		Vector.sort(v);
		assertArrayEquals(new int[] {},v);
		v = new int[] {1};
		Vector.sort(v);
		assertArrayEquals(new int[] {1},v);
		v = new int[] {-3,1};
		Vector.sort(v);
		assertArrayEquals(new int[] {-3,1},v);
		v = new int[] {0,1};
		Vector.sort(v);
		assertArrayEquals(new int[] {0,1},v);
	}
	@Test
	void sort2() {
		int [] v = new int[] {12,28,27,26};
		Vector.ordenarArray(v);
		assertArrayEquals(new int[] {12,26,27,28},v);
		v = new int[] {12,27,26,27};
		Vector.ordenarArray(v);
		assertArrayEquals(new int[] {12,26,27,27},v);
		v =  new int []{35,90,67,54,32,1,98,75,64,97};
		Vector.ordenarArray(v);
		assertArrayEquals(new int[] {1,32,35,54,64,67,75,90,97,98},v);
		v = new int[] {};
		Vector.ordenarArray(v);
		assertArrayEquals(new int[] {},v);
		v = new int[] {1};
		Vector.ordenarArray(v);
		assertArrayEquals(new int[] {1},v);
		v = new int[] {-3,1};
		Vector.ordenarArray(v);
		assertArrayEquals(new int[] {-3,1},v);
		v = new int[] {0,1};
		Vector.ordenarArray(v);
		assertArrayEquals(new int[] {0,1},v);
	}

}
