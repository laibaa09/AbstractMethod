/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author sp21-bse-041
 */
public class ShapeFactory {
        
   public  getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();         
      }else if (shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }	 
      else(shapeType.equalsIgnoreCase("Triangle")){
         return new Triangle();
     
    return null;
   }

    }
}
