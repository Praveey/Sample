package com.cg.test;
import java.util.*;
import static org.junit.Assert.*;

import java.util.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.cg.ControllerServlet;
import com.cg.beans.CarDTO;
import com.cg.dao.CarDAO;

public class TestControllerServlet {

	@Test
	public void testProcessRequest() throws ServletException, IOException {
		//fail("Not yet implemented");
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
		
		//when-then pattern
			Mockito.when(request.getParameter("action")).thenReturn("viewCarList");
		//data-fixture
			List<CarDTO> carList = new LinkedList<>();
			
			CarDTO cars = new CarDTO();
			cars.setId(1);
			cars.setMake("new car");
			cars.setModel("new model");
			carList.add(cars);
			
			Mockito.when(daoRef.findAll().thenReturn(carList));
		ControllerServlet myServlet = new ControllerServlet();
		myServlet.setCarDAO(daoRef);
		
		//execution
		myServlet.processRequest(request, response);
		
		
	}
	
	private CarDAO daoRef;
	@Before
	public void setup() {
		daoRef = Mockito.mock(CarDAO.class);
		System.out.println("CarDAO is mocked.");
	}
	

}
