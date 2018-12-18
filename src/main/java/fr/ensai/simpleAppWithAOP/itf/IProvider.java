package fr.ensai.simpleAppWithAOP.itf;

public interface IProvider {
	
	public boolean sendProduct(long productId, long quantity, String address);

}
