package com.abc.validation;

public class Validate {
	
  public Validate() {
		super();
		// TODO Auto-generated constructor stub
	}

public int ROllValid(int roll)
  {
	  int c=0;
	  while(roll!=0)
	  {
		  c=c+1;
		  roll=roll/10;
	  }
	  return c;
  }
}
