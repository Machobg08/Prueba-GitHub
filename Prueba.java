/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprender_java;

/**
 * @author macho
 */
public class Prueba {
    private int n1,n2,total;
    
      public Prueba(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }



    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
      
    public int suma(){
        this.total = n1 + n2;
        return 0;
        
    }
    
      
      
      
      
   
        
}
