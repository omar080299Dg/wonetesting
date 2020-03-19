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
public class Rectangle extends Shape {
    protected double lenght;
    protected double width;
public Rectangle()
{
    super();
}
    public Rectangle(double lenght, double width) {
        super();
        this.lenght = lenght;
        this.width = width;
    }
    
    
    
    

    public Rectangle(double lenght, double width,String color, boolean filled) {
        
        super(color,filled);
        this.lenght = lenght;
        this.width = width;
    }
     

    public double getLenght() {
        return lenght;
    }    public double getWidth() {
        return width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }
     
      public double getArea()
     { double surface=this.getWidth()*this.getLenght();
         return surface;
     }
    public double getPerimeter()
    { double perimeter=2*(this.getWidth()+this.getLenght());
         return perimeter;
     }

    
    public String imprimer()
    {
        return "le rectngle de largeur "+this.getWidth()+" et de longueur "+this.getLenght()+" a comme perimetre "+getPerimeter()+" et a comme surface "+getArea();
    }

    
    
}
