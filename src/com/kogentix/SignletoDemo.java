package com.kogentix;

public class SignletoDemo {
	
	private static SignletoDemo instance_;
	
	private static Object syncObject_=new Object();
	
	
	public static SignletoDemo  getInstance()
	{if(instance_==null)
	{
		synchronized (syncObject_) {
			if(instance_==null)
			{
				instance_=new SignletoDemo();
			}
		}
	}
		
		
		return instance_;
		
	}
}
