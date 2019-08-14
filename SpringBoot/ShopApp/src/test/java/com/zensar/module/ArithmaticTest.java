package com.zensar.module;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class ArithmaticTest {
	
	@Mock
	private Calculator calculator;
	
	@Rule
	public MockitoRule rule = new MockitoJUnit().rule();
	
	@InjectMocks
	private Arithmatic arithmatic;
	
	public void testAddition() {
		Mockito.when(arithmatic.doAddition(10, 20)).thenReturn(30);
		assertEquals(30, arithmatic.doAddition(10, 20));
	}
}
