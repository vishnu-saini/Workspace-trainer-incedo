package com;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AtomCardImp extends UnicastRemoteObject implements AtmCard,
		Serializable {

	protected AtomCardImp() throws RemoteException {
		super();
	}

	@Override
	public boolean isValid(Card card) throws RemoteException {
		Integer val = Integer.parseInt(card.getCardNo());
		if (val % 2 == 0)
			return false;
		else
			return true;
	}

}