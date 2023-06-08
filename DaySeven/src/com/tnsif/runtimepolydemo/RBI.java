package com.tnsif.runtimepolydemo;

public class RBI {
	
	public float getROI()
	{
		return 6.6f;
	}

}

class SBI extends RBI
{
	@Override
	public float getROI()
	{
		return 7.0f;
	}
}

class HDFC extends RBI
{
	@Override
	public float getROI()
	{
		return 8.0f;
	}
}

class Axis extends RBI
{
	@Override
	public float getROI()
	{
		return 8.5f;
	}
}
