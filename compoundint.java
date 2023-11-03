class compound{
    double principal;
     double annualRate;
      int years;
      int month;
     
      void getvalue(double p, double Rate, int time, int mon) 
      {
        principal = p;
        annualRate = Rate;
        years = time;
        month = mon;

      }

     double calculateSimpleInterest(){
        double cInterest = principal*(Math.pow((1+annualRate/years),(years*annualRate)));
       return cInterest;
    }
}

public class compoundint {
    public static void main(String[] args) {
       

        compound myCompound = new compound();
       myCompound.getvalue(500000, 0.18,3,12 );
      double Cint = myCompound.calculateSimpleInterest();

        System.out.println("Bob's compound Interest after 3 years: "+ Cint);
    }
}




