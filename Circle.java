/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming101;

/**
 *
 * @author User
 */
public class Circle extends Shape {
    private double radius ;
    final double pi = Math.PI;
    
    public Circle (double radius){
        this.radius = radius;
    }
    public double getArea (){
        return pi * (radius *radius);
    }
    public double getPerimeter (){
        return 2 *pi *radius;
        
    }
    public String toString (){
       return String.format("I am a circle.\n My area is: %f.\n My perimeter is %f. \n", this.getArea(), this.getPerimeter() );
    }
    
}
