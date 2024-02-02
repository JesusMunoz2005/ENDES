package com;

import com.Electrodomestico;
import com.Electrodomestico.color;
import com.Electrodomestico.consumo;

public class Lavadora extends Electrodomestico{
	private int carga;
	
	Lavadora(){
	super(precioBase, peso, colorElect, consumoElect);
	this.carga=5;
	this.peso=peso;
	this.precioBase=precioBase;
	this.colorElect=colorElect;
	this.consumoElect=consumoElect;
	}
	
	Lavadora(int precio, int peso){
		super();
		this.carga=5;
		this.peso=peso;
		this.precioBase=precio;
		this.colorElect=color.Blanco;
		this.consumoElect=consumo.F;
		}
	
	Lavadora(int carga){
		super(precioBase, peso, colorElect, consumoElect);
		this.carga=carga;
		this.peso=peso;
		this.precioBase=precioBase;
		this.colorElect=color.Blanco;
		this.consumoElect=consumo.F;
		}
	
	public int getCarga() {
		return carga;
	}
	
	
	@Override
   public int getPrecioFinal() {
   int precioFinal = super.getPrecioFinal();
   if (carga > 30) {
     precioFinal += 50;
   }
  
   return precioFinal;
   }
	
	public String toString() {
		
		return "Lavadora: Color del electrodomestico="+colorElect+", Consumo electrico="+consumoElect+", Peso="+peso+"Kg" +", Carga="+carga+
				", Precio final=" + getPrecioFinal()+"€";
	}
 
}

