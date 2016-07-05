package parser;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import test.customTag.User;

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	//Element 对应的类
	@Override
	protected Class<User> getBeanClass(Element element) {
		return User.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String userName = element.getAttribute("userName");
		if(!StringUtils.hasText(userName)){
			new RuntimeException("username not empty!");
		}
		builder.addPropertyValue("userName", userName);
		String email = element.getAttribute("email");
		if(StringUtils.hasText(email)){
			builder.addPropertyValue("email", email);
		}
	}

	

}
