package assignment.bank1;
import java.util.*;
import java.util.logging.Logger;
class Bank
{
        private String name;
        private int accno;
        private double balance;
        public Bank()
        {
        }
        public Bank(String name,int accno,double balance)
        {
                this.name=name;
                this.accno=accno;
                this.balance=balance;
        }
        public void withDraw(double amount)
        {
                this.balance -= amount;
        }
        public void deposit(double amount)
        {
                this.balance += amount;

        }
        public double balance()
        {
                return this.balance;
        }

        public static void main(String []args)
        {
                Scanner sin=new Scanner(System.in);
				Logger l=Logger.getLogger("com.api.jar");

                l.info("Enter username\n");
                String name=sin.next();
                l.info("Enter account no\n");
                int accno=sin.nextInt();
                l.info("Enter your amount that your account has\n");
                double balance=sin.nextDouble();
                double amount;
                int ch=5;
                Bank b=new Bank(name,accno,balance);
                do
                {
                        l.info("\n1.User Details\n2.Deposit\n3.Withdrawl\n4.Check Balance\n5.Exit\n");
                        l.info("Enter your choice\n");
                        ch=sin.nextInt();
                        switch(ch)
                        {
                                case 1:l.info("Username: "+name+"\nAccount no: "+accno+"\nAmount: "+b.balance());
                                       break;
                                case 2:l.info("Enter the amount to be deposit\n");
                                       amount=sin.nextDouble();
                                       if(amount<100)
                                       {

                                               l.info("Minimum deposit is Rs.100. So, your deposit failed");
                                       }
                                       else
                                       {
                                                b.deposit(amount);
                                                l.info("Your total amount is... "+b.balance());
                                       }
                                        break;
                                case 3:l.info("Enter the amount to be withdrawl\n");
                                       amount=sin.nextDouble();
                                       if(amount<100)
                                       {

                                               l.info("Minimum withdrawl is Rs.100. Withdrawl failed");
                                       }
                                       else if(b.balance()==0)
                                       {
                                               l.info("\nNo amount to withdrawl\n");
                                       }
                                        else
                                       {
                                                b.withDraw(amount);
                                                l.info("Your current balance is... "+b.balance());
                                       }
                                        break;
                                case 4:l.info("Balance is... "+b.balance());
                                       break;
                                default:l.info("Enter valid input");
                                        break;
                        }
                }while(ch!=4);
        }
}
