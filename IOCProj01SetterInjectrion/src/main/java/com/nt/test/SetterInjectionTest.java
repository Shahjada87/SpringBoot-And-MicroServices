package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Locate and hold spring bean cfg file name and location
		FileSystemResource res= new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		//create IOC container (Bean Factory Container)
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		//get target spring bean class object
		Object obj = factory.getBean("wmg");
		
		//typecasting
		WishMessageGenerator generator =(WishMessageGenerator)obj;
		
		//invoke b method
		String result = generator.generateMessage("Shahjada");
		System.out.println(result);
		
	}

}
