

package boletin2_7;

import java.util.Scanner;


public class Boletin2_7 {

    
     public static void main(String[] args) {
        float precioPag, precioTar, descuento;
        Scanner obx= new Scanner(System.in);
        System.out.println("introduce el precio pagado : ");
        precioPag=obx.nextFloat();
        System.out.println ("introduce la tarifa : ");
        precioTar=obx.nextFloat();
        descuento=precioPag*((1+precioTar)/100);
        System.out.println("El descuento es de un : "+ descuento +" % ");
        
        
    }
    
}
