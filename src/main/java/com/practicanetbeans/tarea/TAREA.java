
package com.practicanetbeans.tarea;

import java.util.Scanner;

public class TAREA {

    public static void main(String[] args) {
              Scanner console = new Scanner(System.in);
        System.out.println("Ingrese una operacion con dos numeros");
        String num=console.nextLine();
   int tamaño = num.length();
    String A[] = new String[100];
    String operaciones[] = new String[100];
    int a = 0;
    int suma = 0;
    String aux = "";
    operaciones[0] = "+";
    int index_operacion = 1;
    for(int i = 0; i<tamaño ; i++)
    {
        if(num.charAt(i) == '+' || num.charAt(i) == '-'||num.charAt(i)=='*'||num.charAt(i)=='/')
        {
            A[a] = aux;
            operaciones[index_operacion] = String.valueOf(num.charAt(i));
            a++;   
            index_operacion++;
            aux = "";            
        }
        else
        {
            aux = aux + num.charAt(i);
        }        
    }
    A[a] = aux;
    a++;

    for(int i = 0; i<a; i++)
    {                  
        if(operaciones[i].equals("+")){
         suma=suma+Integer.parseInt(A[i]);    
        }else if (operaciones[i].equals("-")){
            suma=suma-Integer.parseInt(A[i]);            
        }  
        
    }
    System.out.println("=  "+suma);
    }
    }
