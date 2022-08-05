package pe.com.bootcamp;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import pe.com.bootcamp.Models.AFP;
import pe.com.bootcamp.bean.AFPResponse;
import pe.com.bootcamp.controller.AFPController;
import pe.com.bootcamp.service.rest.IAfp;

@RunWith(MockitoJUnitRunner.class)
public class ControllerTest {

	@InjectMocks
	AFPController controler;
	
	@Mock
	IAfp oAFP;
	
	@Before
	public void Setup() throws Exception{
		
	}
	
	@Test
	public void Test() throws Exception {
		AFPResponse respon = new AFPResponse();
		List<AFP> lista=new ArrayList<AFP>();
		lista.add(AFP.builder().Id(1).Name("AFP 1").build());
		respon.setAFPList(lista);
		Mockito.when(oAFP.Store()).thenReturn(respon);
		AFPResponse response=controler.AFPStore();
		assertNotNull(response);
	}
}
