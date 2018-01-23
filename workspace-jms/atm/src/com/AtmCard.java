package com;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AtmCard extends Remote {
	public boolean isValid(Card card) throws RemoteException;
}
