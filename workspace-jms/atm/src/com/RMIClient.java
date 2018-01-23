package com;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
	public static void main(String[] args) throws RemoteException,
			NotBoundException {
		
		Registry registry = LocateRegistry.getRegistry("localhost", 5000);
		AtmCard card = (AtmCard) registry.lookup("obj");

		System.out.println(card.isValid(new Card("121")));

	}

}
