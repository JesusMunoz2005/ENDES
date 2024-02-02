package com;

import com.Electrodomestico.color;
import com.Electrodomestico.consumo;

public class Electrodomestico {
	protected static int precioBase;
	protected enum color{Blanco, Negro, Rojo, Gris};
	protected static color colorElect;
	protected enum consumo{A,B,C,D,E,F};
	protected static consumo consumoElect;
	protected static int peso;
	
	Electrodomestico(){
		precioBase=100;
		peso=5;
		colorElect=color.Blanco;
		consumoElect=consumo.F;
	}
	
	Electrodomestico(int precio, int peso){
		this.precioBase=precio;
		this.peso=peso;
		colorElect=color.Blanco;
		consumoElect=consumo.F;
	}
	
	Electrodomestico(int precio, int peso, color color, consumo consumo ){
		this.precioBase=precio;
		this.peso=peso;
		colorElect=color;
		consumoElect=consumo;
	}
	public int getPrecioBase() {
		return precioBase;
	}
	public color getColorElect() {
		return colorElect;
	}
	public consumo getConsumoElect() {
		return consumoElect;
	}
	public int getPeso() {
		return peso;
	}
	
	  public int getPrecioFinal() {
	  int precioFinal = precioBase;
	        switch(consumoElect){
	            case A:
	             precioFinal+=100;
	             break;
	            case B:
	              precioFinal+=80;
	                break;
	            case C:
	              precioFinal+=60;
	              break;
	            case D:
	              precioFinal+=50;
	              break;
	            case E:
	              precioFinal+=30;
	               break;
	            case F:
	              precioFinal+=10;
	              break;
	        }
	        if (peso >= 0 && peso <= 29) {
	            precioFinal+=10;
	        }else if (peso>=30 && peso<=49) {
	            precioFinal += 60;
	        }else if (peso>=50 && peso<=79) {
	            precioFinal+=80;
	        }else if (peso>=80) {
	            precioFinal+=100;
	        }
	        return precioFinal;
	    }
	    @Override
	    public String toString() {
	        return "Electrodomestico: Color del electrodomestico="+colorElect+", "
	        		+"Consumo electrico="+consumoElect+", Peso="+peso+"Kg" +", Precio final=" + getPrecioFinal()+"€";
	    }
	    
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Electrodomestico other = (Electrodomestico) obj;
	        return precioBase == other.precioBase &&
	               colorElect == other.colorElect &&
	               consumoElect == other.consumoElect &&
	               peso == other.peso;
	    }
}


