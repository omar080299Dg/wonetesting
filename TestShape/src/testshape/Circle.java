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
public class Circle extends Shape {
    protected double raduis;

    public Circle( String color, boolean filled,double raduis) {
        
        this.raduis = raduis;
    }
     public double getArea()
     { double surface=this.raduis*4*Math.PI;
         return surface;
     }
    public double getPerimeter()
    { double perimeter=this.raduis*4*Math.PI;
         return perimeter;
     }

    
    public String imprimer()
    {
        return "le cercle de rayon "+this.raduis+" a comme perimetre "+getPerimeter()+" et a comme surface "+getArea();
    }


}

