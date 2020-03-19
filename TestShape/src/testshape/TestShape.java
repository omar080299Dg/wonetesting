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
public class TestShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Shape s1;
        s1 = new Circle ("RED",false,5.5);
        System. out . println (s1 ); 
        System. out . println (s1 . getArea ());
        System. out . println (s1 . getPerimeter ());
        System. out . println (s1 . getColor ());
        System. out . println (s1 . isFilled ());
      // System. out . println (s1 . getRadius ()); dont  exit in the class shape  

        
        Circle c1 = ( Circle )s1 ;
System. out . println (c1 );
System. out . println (c1 . getArea ()); 
System. out . println (c1 . getPerimeter ()); 
System. out . println (c1 . getColor ()); 
System. out . println (c1 . isFilled ()); 
System. out . println (c1 . getRadius ());



 

//Shape s2 = new Shape ();is an abstract class so it can be instanied
Shape s3 = new Rectangle (1.0,2.0,"RED",false); 
System. out . println (s3 ); 
System. out . println (s3 . getArea ()); 
System. out . println (s3 . getPerimeter ()); 
System. out . println (s3 . getColor ()); 
//System. out . println (s3 . getLength ());this methode dont exits in the class

Rectangle r1 = (Rectangle )s3 ; 
System. out . println (r1 ); 
System. out . println (r1 . getArea ());
System. out . println (r1 . getColor ());
System. out . println (r1 .  getLenght ());

Shape s4 = new Square (6.6); // Upcast 
System. out . println (s4 );
System. out . println (s4 . getArea ()); 
System. out . println (s4 . getColor ()); 
//System. out . println (s4 . getSide ());  getLength ());this methode dont exits in the class


// Take note that we downcast Shape s4 to Rectangle ,
// which is a superclass of Square , instead of Square
Rectangle r2 = (Rectangle )s4 ;
System. out . println (r2 );
System. out . println (r2 . getArea ()); 
System. out . println (r2 . getColor ()); 
//System. out . println (r2 . getSide ()); getLength ());this methode dont exits in the class
System. out . println (r2 . getLenght ());


// Downcast Rectangle r2 to Square Square
Square sq1 = (Square)r2 ; 
System. out . println (sq1 );
System. out . println (sq1 . getArea ()); 
System. out . println (sq1 . getColor ()); 
System. out . println (sq1 . getSide ());
//System. out . println (sq1 . .getLenght ());  getLength ());this methode dont exits in the class
//What is the usage of the abstract method and abstract class?
/*
using absctract clas is important because sometimes you would like to define  a lots of mmethode in each class in a projetc,
declaring these methode will be painfull 
sp you can declare an abtract class where you will define these methodes, 
each class wich heits in this abstract class must have these methodes ans all methodes delacred in a abtract class are also absctract



*/


    }
    
}

        
        
        
        
        
    
    

