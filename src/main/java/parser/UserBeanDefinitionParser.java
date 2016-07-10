package parser;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import test.customTag.User;

public class UserBeanDefinitionParser implements BeanDefinitionParser {

	public BeanDefinition parse(Element element, ParserContext parserContext) {
		BeanDefinition definition = new GenericBeanDefinition();
		definition.setBeanClassName("factoryBean.RemoteFactoryBean");
		String className = element.getAttribute("class");
		System.out.println(className);
		definition.getPropertyValues().add("className",className );
		parserContext.getRegistry().registerBeanDefinition(element.getAttribute("id"), definition);
		return definition;
	}

	

}
