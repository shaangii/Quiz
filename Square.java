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
public class Square extends Rectangle {
    private double sides;
    
    public Square(double sides){
        this.sides = sides;
    }
    public double getArea(){
        return sides * sides;
    }
    public double getPerimeter(){
        return 4*sides;
    }
    public String toString (){
       return String.format("I am a square.\n  My area is: %f.\n My perimeter is %f. \n", this.getArea(), this.getPerimeter() );
}
}
