package com;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testLava {

	/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		    /*----2. Diseño de la Clase Lavadora:----*/
	/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		    

    @Test
    @DisplayName("Constructor por defecto inicializa la carga")
    public void testDefaultConstructor() {
        Lavadora lavadora = new Lavadora();
        assertEquals(5, lavadora.getCarga());
    }

    @Test
    @DisplayName("Constructor con precio y peso asigna la carga")
    public void testConstructorPrecioPeso() {
        Lavadora lavadora = new Lavadora(200, 10);
        assertEquals(5, lavadora.getCarga());
    }

    @Test
    @DisplayName("Constructor con carga asigna la carga")
    public void testConstructorCarga() {
        Lavadora lavadora = new Lavadora(8);
        assertEquals(8, lavadora.getCarga());
    }
/*--------------------------------------------------------------------------------------------------------------------------------*/
        
    	/*----PRUEBAS PARA EL METODO GET_PRECIOFINAL----*/

    
        @Test
        @DisplayName("Precio final sin aumento por carga")
        public void testGetPrecioFinal_LowCarga() {
            Lavadora lavadora = new Lavadora(300, 20);
            assertEquals(320, lavadora.getPrecioFinal());
        }

        @Test
        @DisplayName("Precio final con aumento por carga")
        public void testGetPrecioFinal_HighCarga() {
            Lavadora lavadora = new Lavadora(300, 40);
            assertEquals(370, lavadora.getPrecioFinal());
        }
   

}

