package com.example.tests;

import org.junit.jupiter.api.Test;

import com.example.tombola.Tombola;

class TombolaTest {

	@Test
	void tombolaEstraiTest() {
		Tombola t = new Tombola();
		for(int i = 0; i < 10; i++) {
			t.estrai();
		}
	}
}
