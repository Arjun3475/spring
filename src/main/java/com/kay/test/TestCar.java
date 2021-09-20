package com.kay.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.kay.beans.Vechile;

public class TestCar 
{
	public static void main(String[] args) 
	{
			//create BeanFactory IOC Container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/kay/cfgs/applicationContext.xml");
		
		//get target class object
		Vechile vachile=(Vechile)factory.getBean("vechile");
		//b.methods
		vachile.start();
		vachile.move("Patna","Hyd");
		vachile.stop();
	}
}
