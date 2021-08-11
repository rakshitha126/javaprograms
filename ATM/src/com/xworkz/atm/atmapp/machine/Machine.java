package com.xworkz.atm.atmapp.machine;
import com.xworkz.atm.atmapp.AtmException;
public class Machine {
public void withDraw(int amt) {
		
		if(amt > 20000 || amt <100 || amt % 100 != 0) {
			throw new AtmException();
		}else {
			System.out.println("Collect the cash");
		}
	}

}

