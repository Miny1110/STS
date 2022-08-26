package com.exe.springdi3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageService {

	/**xml을 읽어와서 자동으로 객체가 생성되게끔 한다*/
	public void messageService() {
		
		/**BeanFactory 생성*/
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("app-context.xml");
		
		/**Bean 획득*/
		/**xml의 <bean id="message" class="com.exe.springdi3.MessageKr"/> 로 객체가 생성됨
		 * ms에는 MessageKr 객체가 들어있음*/
		Message ms = (Message)context.getBean("message");
		ms.sayHello("배수지");
	}
}
