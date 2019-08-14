package com.zensar.module;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListSpyTest {
	
	@Test
	public void testList() {
		List<String> flowers = Mockito.mock(List.class);
		Mockito.when(flowers.get(0)).thenReturn("Rose");
		assertEquals("Rose", flowers.get(0));
	}
	
	public void testSpyList() {
		List<String> flowers = new ArrayList<String>();
		List<String> spyFlowers = Mockito.spy(flowers);
		
		Mockito.when(spyFlowers.get(0)).thenReturn("Rose");
		assertEquals("Rose", spyFlowers.get(0));
	}
}
