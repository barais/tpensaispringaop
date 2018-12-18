package fr.ensai.simpleAppWithAOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import fr.ensai.simpleAppWithAOP.itf.IFastLane;
import fr.ensai.simpleAppWithAOP.itf.IJustHaveALook;

@SpringBootApplication
@ComponentScan
public class SimpleAppWithAopApplication implements CommandLineRunner {

	@Autowired
	IFastLane lane;
	@Autowired
	IJustHaveALook look;
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleAppWithAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (args.length > 0)
			System.out.println("ok" + args[0]);
		lane.buyProduct(25, 30);
		look.isAvailable(1);
	}
}

