package com.demo;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;
//@ActivationConfigProperty(propertyName = "messageSelector", propertyValue = "age > 20 AND name LIKE 'R%'") })
@MessageDriven(mappedName = "myTopic", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")})
		
public class ConsumerBean implements MessageListener {

	public void onMessage(Message message) {
	       if(message instanceof MapMessage){
	    	   ObjectMessage tMessage=(ObjectMessage) message;
	    	   try {
				Foo f=(Foo) tMessage.getObject();
				System.out.println(f.getData());
				
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       }
	    }
}
