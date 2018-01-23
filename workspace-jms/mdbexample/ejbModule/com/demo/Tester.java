package com.demo;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;

@Singleton
@LocalBean
@Startup
public class Tester {

	@Resource(name = "myTopicCF")
	private ConnectionFactory connectionFactory;

	@Resource(name = "myTopic")
	private Destination destination;

	public Tester() {

	}

	@PostConstruct
	public void Producter() {
		Connection con = null;
		try {
			Connection connection = connectionFactory.createConnection();
			Session session = connection.createSession(false,
					Session.AUTO_ACKNOWLEDGE);
			MessageProducer producer = session.createProducer(destination);

			Foo foo=new Foo("information ...");
			ObjectMessage objMessage=session.createObjectMessage();
			objMessage.setObjectProperty("foo", foo);
			/*TextMessage message = session
					.createTextMessage("Created an message!!!");*/
			producer.send(objMessage);

			System.out.println("Message send.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
