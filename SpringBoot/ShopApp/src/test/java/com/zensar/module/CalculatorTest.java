package com.zensar.module;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class CalculatorTest {
	
	@Mock
	private Calculator calculator ;
	
	@Rule
	public MockitoRule rule = new MockitoJUnit().rule();
	
	@Test
	public void additionTest() {
		
		Mockito.when(calculator.add(6, 4)).thenReturn(18);
		
		assertEquals(18, calculator.add(6, 4));
	}
}	
