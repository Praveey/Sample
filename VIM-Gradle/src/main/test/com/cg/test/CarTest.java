package com.cg.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.cg.dao.impl.InMemoryCarDAO;

public class CarTest {

	@Test
	@Ignore
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testViewCarList(){
		
		InMemoryCarDAO carDAOObj = new InMemoryCarDAO();
		assertNotNull(carDAOObj.findAll());
		System.out.println("Null returned");
		
		
			
	}

}
