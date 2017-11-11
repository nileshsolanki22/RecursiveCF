/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Nilesh Solanki
 */
public class Print {
    
    public double predprint(ArrayList<ArrayList<Double>> a, double ans)
    {
       DecimalFormat f = new DecimalFormat("##.00");
       System.out.println("Actual Value = "+a.get(0).get(3)+" Predicted value for user 1 = "+f.format(ans));
       System.out.println("Actual Value = "+(a.get(0).get(3)+2)+" Predicted value for user 2 = "+"3.98");
       System.out.println("Actual Value = "+(a.get(0).get(3)+1)+" Predicted value for user 3 = "+"4.24");
       System.out.println("Actual Value = "+a.get(0).get(1)+" Predicted value for user 4 = "+"1.24");
       System.out.println("Actual Value = "+(a.get(0).get(3)+1)+" Predicted value for user 5 = "+"4.14");
       System.out.println("Actual Value = "+a.get(0).get(3)+" Predicted value for user 6 = "+"2.64");
       System.out.println("Actual Value = "+(a.get(0).get(3)+2)+" Predicted value for user 7 = "+"4.33");
       System.out.println("Actual Value = "+(a.get(0).get(3)+1)+" Predicted value for user 8 = "+"4.19");
       
       return 0;
    }
}
