package handler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

import parser.UserBeanDefinitionParser;

/**
 * 将组建注册到spring 容器
 * @author zzzz
 *
 */
public class MyNameSpaceHandler extends NamespaceHandlerSupport {

	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
		
	}

}
