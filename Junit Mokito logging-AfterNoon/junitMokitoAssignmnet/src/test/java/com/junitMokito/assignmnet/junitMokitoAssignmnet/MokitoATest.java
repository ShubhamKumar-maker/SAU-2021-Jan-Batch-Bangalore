package com.junitMokito.assignmnet.junitMokitoAssignmnet;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.mockito.Mockito.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MokitoATest {
	
	MokitoA mA=null;
	
	 @BeforeEach
	    public void beforeEachTest()
	    {
		 this.mA=new MokitoA();
	    }
	 @AfterEach
	 public void afterEachTest()
	 {
		 this.mA=null;
	 }

	@Test
	void test1() {
		
		int result=mA.add(3,2);
		assertEquals(5,result);
		
	}
	
//	
	@Test
	void test2() {
		MokitoB mB=Mockito.mock(MokitoB.class);
		this.mA=new MokitoA(mB);
		when(mB.multi(2, 3)).thenReturn(6);
		assertEquals(12,mA.mokitoBmulti(2, 3));
		verify(mB).multi(2, 3);
		
	}

}
