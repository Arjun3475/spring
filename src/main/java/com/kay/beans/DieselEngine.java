package com.kay.beans;

public class DieselEngine implements Engine 
{
		public DieselEngine()
		{
			System.out.println("DeiselEngine 0-param Constructor");
		}

		@Override
		public void startEngine() 
		{
			System.out.println("DieselEngine started");
		}

		@Override
		public void stopEngine() 
		{
			System.out.println("DieselEngine stoped");
		}
}