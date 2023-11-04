class SimpleInterest{
    double principal;
     double annualRate;
      int years;
     
      void getvalue(double p, double Rate, int time) 
      {
        principal = p;
        annualRate = Rate;
        years = time;
      }

     double calculateSimpleInterest(){
        double Interest = (principal * annualRate * years) / 100.0;
       return Interest;
    }
}

public class BankAccount {
    public static void main(String[] args) {
       

        SimpleInterest bobAccount = new SimpleInterest();
       bobAccount.getvalue(100000, 0.05, 5);
      double account = bobAccount.calculateSimpleInterest();

        System.out.println("Bob's Simple Interest after 5 years: "+ account);
        System.out.println("Bob's Simple Interest after 5 years: "+ account);
        
    }
}



