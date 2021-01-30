package com.junitMokito.assignmnet.junitMokitoAssignmnet;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MokitoBTest {
	MokitoB mb=null;
	
	 @BeforeEach
	    public void beforeEachTest()
	    {
		 this.mb=new MokitoB();
	    }
	 @AfterEach
	 public void afterEachTest()
	 {
		 this.mb=null;
	 }
	 @Test
		void test1() {
			
			int result=mb.multi(2, 3);
			assertEquals(6,result);
			
		}
	 
	 @Test
		void test2() {
			MokitoA mA=Mockito.mock(MokitoA.class);
			this.mb=new MokitoB(mA);
			when(mb.mokitoAadd(2, 3)).thenReturn(5);
			assertEquals(10,mb.mokitoAadd(2, 3));
			verify(mA).add(2, 3);
			
		}

}
