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
public class DoubledborderedShapeFactory {
     if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new DoubledborderedRectangle();         
      }
      else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new DoubledborderedSquare();
      }	 
      else if(shapeType.equalsIgnoreCase("TRIANGLR")){
         return new DoubledborderedTriangle();
      }	
      return null;
}
