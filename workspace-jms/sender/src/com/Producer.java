package com;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;

public class Producer {

	public static void main(String[] args) {
		Connection con = null;
		try {
			InitialContext ctx = new InitialContext();
			ConnectionFactory cf = (ConnectionFactory) ctx.lookup("myTopicCF");
			Destination destination = (Destination) ctx.lookup("myTopic");

			con = cf.createConnection();

			Session session = con
					.createSession(false, Session.AUTO_ACKNOWLEDGE);

			MessageProducer producer = session.createProducer(destination);

			TextMessage msg = session.createTextMessage("hi from jms...");

			producer.send(msg);
			System.out.println("message send...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}
