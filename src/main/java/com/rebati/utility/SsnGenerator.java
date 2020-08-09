package com.rebati.utility;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class SsnGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		int firstNum = Math.abs(new Random().nextInt(999));
		int secondNum = Math.abs(new Random().nextInt(99));
		int thirdNum = Math.abs(new Random().nextInt(9999));
		return firstNum+" "+secondNum+" "+thirdNum;
	}

}
