package com.kay.beans;

public class Vechile
{
		private Engine engine;
		
		public Vechile()
		{
			System.out.println("Vechile 0-param constructor");
		}
		
		public void setEngine(Engine engine) 
		{
			this.engine = engine;
		}
		
		public void start()
		{
			engine.startEngine();
			System.out.println("Vechile Started");
		}
		public void move(String startPoint,String stopedPoint)
		{
			System.out.println("jorunery startes from::"+startPoint);
			System.out.println("jorunery is going on....");
			try
			{
				Thread.sleep(10000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("Jorunery ended at  ::"+stopedPoint);
		}
		

		public void stop()
		{
			engine.stopEngine();
			System.out.println("Vechile Stoped");
		}
}
