package com.junitMokito.assignmnet.junitMokitoAssignmnet;

public class MokitoB {
	
	MokitoA mA;

	MokitoB()
	{
		
	}
	MokitoB(MokitoA mA)
	{
		this.mA=mA;
	}
	
	public int mokitoAadd(int i,int j)
	{
		return mA.add(i, j)*i;          ///(i+j*i)
	}
	
	public int multi(int a,int b) {
	return (a*b);
	}

}
