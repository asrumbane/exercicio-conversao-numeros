package test;


import org.junit.Test;

import junit.framework.Assert;
import modelo.ModeloConversao;

public class ConversaoNumerosTest {
	
	@Test
			public void deveConverterQualquerNumeroDeUmANove(ModeloConversao unidades){
				
		ModeloConversao modeloConversao = new ModeloConversao();
			modeloConversao.unidade = 5;
			modeloConversao.unidades = "V";
			 
			modeloConversao.converte(5);
			 
			 
				Assert.assertEquals("V", modeloConversao);
	}
}
