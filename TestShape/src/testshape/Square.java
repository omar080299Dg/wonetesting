/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testshape;

/**
 *
 * @author Oumar NIANG
 */
public class Square  extends Rectangle  
{ 
    public Square()
    {
        super();
    }
    public Square(double side)
    {   super(side,side);
         
    }
     public Square(double side,String color,boolean filled)
    {
         super(side,side,color,filled);
        
        
    }
     
     public  double getSide()
     {
         return this.lenght;
     }
     public void setSide(double side)
     {
         this.lenght=side;
         this.lenght=side;
     }
             
     public void setWidth(double side)
     {
          super.setWidth(side);
     }
     public void setLenght(double side)
     {
          super.setLenght(side);
     }
     
    
}
