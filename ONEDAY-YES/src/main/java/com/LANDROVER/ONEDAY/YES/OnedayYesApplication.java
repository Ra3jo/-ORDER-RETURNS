package com.LANDROVER.ONEDAY.YES;

import com.LANDROVER.ONEDAY.YES.ENTITY.OrderReturns;
import com.LANDROVER.ONEDAY.YES.REPOSITORY.OrderREPOSITORY;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnedayYesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OnedayYesApplication.class, args);
	}
	@Autowired
	private OrderREPOSITORY orderREPOSITORY;

	@Override
	public void run(String... args) throws Exception {
		OrderReturns orderReturns=new OrderReturns();
		orderReturns.setOrderName("MABAKURI 10");
		orderReturns.setLocation("MBEYA");
		orderREPOSITORY.save(orderReturns);

	}
}
