package assignment.bank1;
import java.util.*;
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

        public static void main(String args[])
        {
                Scanner sin=new Scanner(System.in);
                System.out.print("Enter username\n");
                String name=sin.next();
                System.out.print("Enter account no\n");
                int accno=sin.nextInt();
                System.out.print("Enter your amount that your account has\n");
                double balance=sin.nextDouble();
                double amount;
                int ch=5;
                Bank b=new Bank(name,accno,balance);
                do
                {
                        System.out.print("\n1.User Details\n2.Deposit\n3.Withdrawl\n4.Check Balance\n5.Exit\n");
                        System.out.print("Enter your choice\n");
                        ch=sin.nextInt();
                        switch(ch)
                        {
                                case 1:System.out.println("Username: "+name+"\nAccount no: "+accno+"\nAmount: "+b.balance());
                                       break;
                                case 2:System.out.println("Enter the amount to be deposit\n");
                                       amount=sin.nextDouble();
                                       if(amount<100)
                                       {

                                               System.out.println("Minimum deposit is Rs.100. So, your deposit failed");
                                       }
                                       else
                                       {
                                                b.deposit(amount);
                                                System.out.println("Your total amount is... "+b.balance());
                                       }
                                        break;
                                case 3:System.out.println("Enter the amount to be withdrawl\n");
                                       amount=sin.nextDouble();
                                       if(amount<100)
                                       {

                                               System.out.println("Minimum withdrawl is Rs.100. Withdrawl failed");
                                       }
                                       else if(b.balance()==0)
                                       {
                                               System.out.print("\nNo amount to withdrawl\n");
                                       }
                                        else
                                       {
                                                b.withDraw(amount);
                                                System.out.println("Your current balance is... "+b.balance());
                                       }
                                        break;
                                case 4:System.out.println("Balance is... "+b.balance());
                                       break;
                                default:System.out.println("Enter valid input");
                                        break;
                        }
                }while(ch!=4);
        }
}
