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
public class Pred {
    
   public double GetPrediction(ArrayList<Double> ps,ArrayList<ArrayList<Double>> a) 
   {
       //Mean ArrayList
       ArrayList<Double> meanUser = new ArrayList();
       ArrayList<Double> absPS = new ArrayList();
       //ArrayList<Double> meanItem = new ArrayList();
       double meanItem=0.0;
       //System.out.println(ps.size());
       
       //Number of user item
       int n=3;
       
       //int i=0;
       
       //Number of Users 
       int m1=7;
       
       double m = 0.0;
       
       //To determine column mean
       for(int i=0;i<=m1;i++)
       {
           for(int j=0;j<=n;j++)
           {
               m += a.get(i).get(j);
               //System.out.println(m);
               //mean.add(m);
           }
           m/=n+1.00;
           //System.out.println(m);
           meanUser.add(m);
           m=0.0;
           //System.out.print(m);
       }
       
        //System.out.println(a.get(0).get(0));
        for(int i=0;i<=m1;i++)
           {
               m += a.get(i).get(3);
           }
           m /= n+1.00;
           //System.out.println(m);
           meanItem=m;
           
        double Value1=0.0,Value2=0.0;
        double val=0.0,val4=0.00;
        //Value = meanUser.get(0) + ps.get(0)*(a.get(0).get(3)-meanItem.get(0));
        Value1=2.25+(-.30*(.25)+.43*(1.75)+.89*(1.25))/(.30+.43+.89);
       // System.out.println(meanUser.get(0));
        
        double temp=0.0;
        //System.out.println(ps.get(2));
        for(int i=0;i<m1;i++)
        {
            temp=ps.get(i);
            absPS.add(Math.abs(temp));    
        }
   
        //val4=ps.get(0)+ps.get(1)+ -1*ps.get(2);
        
        //Loop to sum Pearson Similarity ArrayList
        for(int i=0;i<m1;i++)
        {
            val4+=absPS.get(i);
            //System.out.println(absPS.get(i));
        }
        
        int j;
        double sum=0.0;
        
        //Prediction Formula
        for(int i=0;i<n;i++)
        {
           //for(int j=1;j<a.size();j++)
            j=i;
            j++;
            {
                val=ps.get(i)*(a.get(j).get(3)-meanItem);
                //System.out.println("val="+val);
            } 
            sum+=val;
        }
        
        Value2=meanUser.get(0)+sum/val4;
           
       // System.out.println(Value1); 
       //System.out.println(Value2);
     
       return Value2;
   }
}
