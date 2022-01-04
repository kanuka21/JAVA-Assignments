class Bank{

    void totalMoneyInBank()
    {
        System.out.println("The Employee incremented salary is :" );

    }
  }
class SavingAcoount extends Bank{
    float fixedDeposits =30000;
    void totalMoneyInBank()
    {
        System.out.println("total money in savings account :" +((fixedDeposits)));
    }
}
class CurrentAcccount extends SavingAcoount{
    double cashCredit=45000;
    void totalMoneyInBank()
    {
        System.out.println("The total money in current account "+(cashCredit));


    }
}
public class totalcash
{
    public static void main(String args[]){

        CurrentAcccount m=new CurrentAcccount();
        SavingAcoount s=new SavingAcoount();



        System.out.println("Total money in the bank  is "+( m.fixedDeposits+m.cashCredit)); //displays total salary of emp in org//

    }
}