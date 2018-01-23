package com;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		AtomCardImp obj=new AtomCardImp();
		
		Registry registry=LocateRegistry.createRegistry(5000);//pass port no
		registry.bind("obj", obj);
		System.out.println("service is bound!");
		
	}

}
