package com.app.service.ejb;

import javax.ejb.Stateless;

@Stateless
public class AtmVerify implements AtmVerifyRemote {

    public AtmVerify() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
	public boolean isValid(String card) {
		Integer val = Integer.parseInt(card);
		if (val % 2 == 0)
			return false;
		else
			return true;
	}

}
