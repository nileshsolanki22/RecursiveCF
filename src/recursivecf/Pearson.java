/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivecf;
import java.util.*;
/**
 *
 * @author Nilesh Solanki
 */

public class Pearson {

/**
  * Calculate the Pearson correlation coefficient of two lists, X and Y.
  *
  * 
     * @param x
     * @param y
  * @return measure of correlation between the two lists
  */
 
  public double GetCorrelation(ArrayList<Double> x, ArrayList<Double> y) {
    double meanX = 0.0, meanY = 0.0;
    for(int i = 0; i < x.size(); i++)
    {
        meanX += x.get(i);
        meanY += y.get(i);
    }

    meanX /= x.size();
    meanY /= y.size();

    double sumXY = 0.0, sumX2 = 0.0, sumY2 = 0.0;
    for(int i = 0; i < x.size(); i++)
    {
      sumXY += ((x.get(i) - meanX) * (y.get(i) - meanY));
      sumX2 += Math.pow(x.get(i) - meanX, 2.0);
      sumY2 += Math.pow(y.get(i) - meanY, 2.0);
    }
    
     //double d = sumXY / (Math.sqrt(sumX2) * Math.sqrt(sumY2));
    
    return (sumXY / (Math.sqrt(sumX2) * Math.sqrt(sumY2)));
  }//end: GetCorrelation(X,Y)
}

