package com;

import com.Electrodomestico.color;
import com.Electrodomestico.consumo;

public class main {
public static void main(String[] args) {



Electrodomestico ele1= new Electrodomestico(200, 55, Electrodomestico.color.Rojo, Electrodomestico.consumo.B);
Lavadora lavadora = new Lavadora(300, 40);

System.out.println("PRECIO FINAL: "+lavadora.getPrecioFinal());


}
}

