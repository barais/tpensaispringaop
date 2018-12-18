package fr.ensai.simpleAppWithAOP.impl;

import org.springframework.stereotype.Component;

import fr.ensai.simpleAppWithAOP.itf.IProvider;
@Component

public class Provider implements IProvider{

	@Override
	public boolean sendProduct(long productId, long quantity, String address) {
		System.err.println("send product" + productId);
		return true;
	}

}
