package test.customTag;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import test.TestService;

public class Test {
	public static void main(String[] args) {
		BeanFactory beanFactory = new FileSystemXmlApplicationContext("F:\\workspaces\\java2\\customTag\\application.xml");
		beanFactory.getBean(UserService.class).test();
		beanFactory.getBean(UserService.class).test2();
		beanFactory.getBean(UserService.class).test3();
		beanFactory.getBean(UserService.class).test4();
	}
}
