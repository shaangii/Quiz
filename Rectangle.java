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
public class Rectangle extends Shape {
    private double width, length;

    
   public Rectangle(){
       
   }
   public Rectangle (double length, double width){
       this.width= width;
       this.length= length;
   }
   public Rectangle (double length){
       this.width= length;
       this.length= length;
   }
   public double getArea(){
       //A = length * width
       return length * width;
   }
   
   public double getPerimeter(){
       return 2* (length * width);
   }
   public String toString(){
       return String.format("I am a rectangle.\n My area is: %f.\n My perimeter is %f. \n", this.getArea(), this.getPerimeter() );
   }

}
