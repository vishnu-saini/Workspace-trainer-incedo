package com.demo;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(mappedName="myTopic", activationConfig ={ 
	    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
	    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")
		})
		
		//Dont have synch consumption facility
public class ConsumerBean implements MessageListener {

   
    public ConsumerBean() { }
	
	
    public void onMessage(Message message) {
       if(message instanceof TextMessage){
    	   TextMessage tMessage=(TextMessage) message;
    	   try {
			System.out.println("got:"+tMessage.getText());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
    }

}