package com.exe.springdi4;

public class ServiceConsumer {

	MessageService ms;
	
	/**�����ڷ� ������ ����*/
	public ServiceConsumer(MessageService ms) {
		this.ms = ms;
	}
	
	public void consumerService() {
		
//		GenericXmlApplicationContext context = 
//				new GenericXmlApplicationContext("app-context.xml");
//		
//		MessageService ms = (MessageService)context.getBean("messageService");
		
		String message = ms.getMessage();
		System.out.println(message);
	}
	
}
