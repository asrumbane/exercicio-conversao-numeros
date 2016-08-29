package test;


import org.junit.Test;

import junit.framework.Assert;
import modelo.ModeloConversao;

public class ConversaoNumerosTest {
	
	@Test
			public void deveConverterQualquerNumeroDeUmANove(){
				
		ModeloConversao modeloConversao = new ModeloConversao();
			 
			 
				Assert.assertEquals(5, modeloConversao);
	}
}
