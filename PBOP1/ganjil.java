/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOP1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ganjil {
    public static void main(String []args){
       int nim [] = {2,1,4,1,7,6,2,0,3,3};
       
       int i = 0;
       int n;
       while (i<4){
           int j = 0;
           while (j <= i){
               System.out.print(nim[i]);
               j++;
           }
           System.out.println();
           i++;
       }
    }
}
