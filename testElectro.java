package com;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/*--------------------------------------------------------------------------------------------------------------------------------*/
	
	public class testElectro {
		
		
		/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		    /*----1. Diseño de la Clase Electrodomestico:----*/
		/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		
			@Test
		    @DisplayName("Comprobar que el constructor por defecto inicializa correctamente los valores")
		    public void testConstructor1() {
		        Electrodomestico ele1 = new Electrodomestico();
		        assertEquals(100, ele1.getPrecioBase());
		        assertEquals(Electrodomestico.color.Blanco, ele1.getColorElect());
		        assertEquals(Electrodomestico.consumo.F, ele1.getConsumoElect());
		        assertEquals(5, ele1.getPeso());
		    }


		    @Test
		    @DisplayName("Comprobar que el constructor con precio y peso asigna correctamente")
		    public void testConstructor2() {
		        Electrodomestico ele1 = new Electrodomestico(200, 10);
		        assertEquals(200, ele1.getPrecioBase());
		        assertEquals(10, ele1.getPeso());
		        assertEquals(Electrodomestico.color.Blanco, ele1.getColorElect());
		        assertEquals(Electrodomestico.consumo.F, ele1.getConsumoElect());
		    }

		    @Test
		    @DisplayName("Comprobar que el constructor completo asigna todos los atributos correctamente")
		    public void testConstructor3() {
		        Electrodomestico ele1 = new Electrodomestico(400, 15, Electrodomestico.color.Negro, Electrodomestico.consumo.A);
		        assertEquals(400, ele1.getPrecioBase());
		        assertEquals(15, ele1.getPeso());
		        assertEquals(Electrodomestico.color.Negro, ele1.getColorElect());
		        assertEquals(Electrodomestico.consumo.A, ele1.getConsumoElect());
    }
		    
/*--------------------------------------------------------------------------------------------------------------------------------*/
		    
		    /*----PRUEBAS PARA EL METODO GET----*/
		    
		    @Test
		    @DisplayName("Test getPrecioBase()")
		    public void testGetPrecioBase() {
		        Electrodomestico electrodomestico = new Electrodomestico(200, 10, Electrodomestico.color.Rojo, Electrodomestico.consumo.B);
		        assertEquals(200, electrodomestico.getPrecioBase());
		    }

		    @Test
		    @DisplayName("Test getColorElect()")
		    public void testGetColorElect() {
		        Electrodomestico electrodomestico = new Electrodomestico(200, 10, Electrodomestico.color.Rojo, Electrodomestico.consumo.B);
		        assertEquals(Electrodomestico.color.Rojo, electrodomestico.getColorElect());
		    }

		    @Test
		    @DisplayName("Test getConsumoElect()")
		    public void testGetConsumoElect() {
		        Electrodomestico electrodomestico = new Electrodomestico(200, 10, Electrodomestico.color.Rojo, Electrodomestico.consumo.B);
		        assertEquals(Electrodomestico.consumo.B, electrodomestico.getConsumoElect());
		    }

		    @Test
		    @DisplayName("Test getPeso()")
		    public void testGetPeso() {
		        Electrodomestico electrodomestico = new Electrodomestico(200, 10, Electrodomestico.color.Rojo, Electrodomestico.consumo.B);
		        assertEquals(10, electrodomestico.getPeso());
		    }
		    
/*--------------------------------------------------------------------------------------------------------------------------------*/
		    
		    /*----PRUEBAS PARA EL METODO GET_PRECIOFINAL----*/
		    
		    @Test
		    @DisplayName("Test getPrecioFinal() con consumo F y peso 5")
		    public void testGetPrecioFinal_ConsumoF_Peso5() {
		        Electrodomestico electrodomestico = new Electrodomestico(200, 5, Electrodomestico.color.Rojo, Electrodomestico.consumo.F);
		        assertEquals(220, electrodomestico.getPrecioFinal());
		    }

		    @Test
		    @DisplayName("Test getPrecioFinal() con consumo A y peso 25")
		    public void testGetPrecioFinal_ConsumoA_Peso25() {
		        Electrodomestico electrodomestico = new Electrodomestico(200, 25, Electrodomestico.color.Rojo, Electrodomestico.consumo.A);
		        assertEquals(310, electrodomestico.getPrecioFinal());
		    }

		    @Test
		    @DisplayName("Test getPrecioFinal() con consumo E y peso 40")
		    public void testGetPrecioFinal_ConsumoE_Peso40() {
		        Electrodomestico electrodomestico = new Electrodomestico(200, 40, Electrodomestico.color.Rojo, Electrodomestico.consumo.E);
		        assertEquals(290, electrodomestico.getPrecioFinal());
		    }

		    @Test
		    @DisplayName("Test getPrecioFinal() con consumo B y peso 55")
		    public void testGetPrecioFinal_ConsumoB_Peso55() {
		        Electrodomestico electrodomestico = new Electrodomestico(200, 55, Electrodomestico.color.Rojo, Electrodomestico.consumo.B);
		        assertEquals(360, electrodomestico.getPrecioFinal());
		    }
/*--------------------------------------------------------------------------------------------------------------------------------*/
		    
		    /*----PRUEBAS PARA EL METODO TO_STRING----*/
		    
		    @DisplayName("Test toString() con atributos y precio final")
		    public void testToString_Formatting() {
		        Electrodomestico electrodomestico = new Electrodomestico(200, 10, Electrodomestico.color.Rojo, Electrodomestico.consumo.B);
		        String expected = "Electrodomestico: Color del electrodomestico=Rojo, Consumo electrico=B, Peso=10Kg, Precio final=340€";
		        assertEquals(expected, electrodomestico.toString());
		    }
		    
/*--------------------------------------------------------------------------------------------------------------------------------*/

		    
		    
		    
		    
		    
		    
}

