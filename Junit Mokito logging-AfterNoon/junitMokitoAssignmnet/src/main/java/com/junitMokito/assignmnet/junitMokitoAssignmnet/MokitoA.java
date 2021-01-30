package com.junitMokito.assignmnet.junitMokitoAssignmnet;

public class MokitoA {
	
	MokitoB mB;
	MokitoA(MokitoB mB)
	{
		this.mB=mB;
	}
	MokitoA()
	{
		
	}
	
	public int add(int a,int b)
	{
		return a+b;
	}

	
	public int mokitoBmulti(int i,int j)
	{
		return mB.multi(i, j)*i; /////(i*i)*j
		
	}

}
