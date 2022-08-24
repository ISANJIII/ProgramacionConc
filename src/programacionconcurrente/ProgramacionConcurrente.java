/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente;

import java.io.IOException;

/**
 *
 * @author cristopher.ovaillos
 */
public class ProgramacionConcurrente {

// Desde el siguiente cliente “main”:
    public static void main(String[] args) {
  
        
        p(0,10);
        
        
    }
    
    public static void p (int x, int y){
           try{
            q(x,y);
        }catch(ArithmeticException a){
                           System.out.println("Psadasdadasd");

        }finally{
               System.out.println("P");
        }
            
        
    }
    
      
    public static void q (int x, int y){
           try{
            r(x,y);
        }catch(ArrayIndexOutOfBoundsException e){
            
        }finally{
                System.out.println("Q");
              
            
        }
            
        
    }
    
      
    public static void r (int x, int y){
        int a;   
        try{
            a=y/x;
        }catch(ArrayIndexOutOfBoundsException e){
             System.out.println("as1111111111111111111sd");
        }finally{
                 System.out.println("R")                  ;
        }
                             System.out.println("fin r")                  ;

        
    }

}
