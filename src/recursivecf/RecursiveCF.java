/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivecf;

import java.text.DecimalFormat;
import java.util.ArrayList;
import recursive.Print;

/**
 *
 * @author Nilesh Solanki
 */
public class RecursiveCF {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
       //System.out.print("Testing - 1\n");
       //Pearson p = new Pearson();
       Pearson p = new Pearson();
       Print pp=new Print();
       
       ArrayList<Double> y = new ArrayList(); ArrayList<Double> z = new ArrayList();
       //ArrayList<Double> z = new ArrayList();
       ArrayList<Double> a1 = new ArrayList(); ArrayList<Double> a6 = new ArrayList(); ArrayList<Double> a7 = new ArrayList();
       ArrayList<Double> a2 = new ArrayList();ArrayList<Double> a4 = new ArrayList();ArrayList<Double> a5 = new ArrayList(); 
       
       ArrayList<ArrayList<Double>> a = new ArrayList<>();
      
       //Pearson Similarity ArrayList
       ArrayList<Double> ps = new ArrayList();
       //ArrayList<ArrayList<Double>> a = new ArrayList<ArrayList<Double>>();
      
       
       //x.addElement(5.0);
       
       y.add(3.0);
       y.add(1.0);        
       y.add(2.0);
       y.add(3.0);
       //y.add(3.0);
       /*
       z.add(4.0); 
       z.add(3.0); 
       z.add(4.0); 
       z.add(3.0); 
       */
       z.add(4.0); 
       z.add(3.0); 
       z.add(4.0); 
       z.add(3.0); 
       
       a1.add(3.0);
       a1.add(3.0);        
       a1.add(1.0);
       a1.add(5.0);
       
       a2.add(1.0);
       a2.add(5.0);
       a2.add(5.0);
       a2.add(2.0);
       //a2.add(1.0);
       
       a4.add(3.0);
       a4.add(3.0);
       a4.add(3.0);
       a4.add(5.0);
       
       a5.add(5.0);
       a5.add(2.0);
       a5.add(5.0);
       a5.add(4.0);
       
       a6.add(5.0);
       a6.add(3.0);
       a6.add(3.0);
       a6.add(3.0);
       
       a7.add(4.0);
       a7.add(3.0);
       a7.add(4.0);
       a7.add(4.0);
       
       a.add(y);
       a.add(z);
       a.add(a1);
       a.add(a2);
      // a.add(a3);
       a.add(a4);
       a.add(a5);
       a.add(a6);
       a.add(a7);
       
       //a.add(x);
       
       //a.add(a1);
       
       double d=0.0;
       //d=p.GetCorrelation(a.get(0),a.get(1);
       //System.out.println(a);
       
       DecimalFormat f = new DecimalFormat("##.00");
       //d=p.GetCorrelation(a.get(0),a.get(1));
       
       //Size of ArrayList of ArrayList
       int n=a.size()-1;
       //System.out.println("size"+x.size());
       Pred p1 =new Pred();
       double ans;
       for(int i=1;i<=n;i++)
       {
           //for(int k=0;k<n;k++)
           {
               d=p.GetCorrelation(a.get(0),a.get(i));
               ps.add(Double.parseDouble(f.format(d)));
               
           }
           //ans=p1.GetPrediction(ps,a);
          // System.out.print("ans="+ans);
       }
         //
       //d=p.GetCorrelation(x,z);
       //System.out.println(ps);
       
       ans =p1.GetPrediction(ps,a);
       //f.format(ans);
        
       //ps.clear(); 
       //System.out.print(ps);
       ans =p1.GetPrediction(ps,a);
       pp.predprint(a,ans);
// p1.GetPrediction(ps,a);
    }
   
}


