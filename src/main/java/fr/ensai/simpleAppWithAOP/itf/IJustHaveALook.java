package fr.ensai.simpleAppWithAOP.itf;

import java.util.Map;

public interface IJustHaveALook {
	
	Map<Product,Long> listAvailable();
	boolean isAvailable(long productID);
}
