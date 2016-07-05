package test.customTag;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import test.TestService;

public class Test {
	public static void main(String[] args) {
		BeanFactory beanFactory = new FileSystemXmlApplicationContext("application.xml");
		System.out.println(beanFactory.getBean(User.class).getUserName());
	}
}
