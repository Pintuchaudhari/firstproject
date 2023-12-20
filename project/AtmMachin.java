package project;



import java.util.Scanner;



public class AtmMachin {

    public static void main(String args[]) throws Exception {

        long accNumber ;

        long balance = 50000, withdraw, deposit;

        boolean case0Used = false; 

        Scanner sc = new Scanner(System.in);



        while (true) {

            System.out.println("ATM Bank Machine");

            System.out.println("Choose 0 to use ATM");

            System.out.println("Choose 1 for Withdraw");

            System.out.println("Choose 2 for Deposit");

            System.out.println("Choose 3 for Check Balance");

            System.out.println("Choose 4 for EXIT");

            System.out.print("Choose the operation you want to perform:");



            int choice = sc.nextInt();

            switch (choice) {

                case 0:

                    System.out.println("Enter your account no");

                    accNumber = sc.nextInt();

                   

                        System.out.println("Your number is=" + accNumber +

                                "\nBalance is=" + balance + "$");

                        case0Used = true;

                     

                    break;

                case 1:

                    if (!case0Used) {

                        System.out.println("Please choose 0 and type account number");

                    } else {

                        System.out.print("Enter money to be withdrawn:");

                        withdraw = sc.nextInt();



                        if (balance >= withdraw) {

                            balance -= withdraw;

                            System.out.println("Please collect your money" + withdraw + "$");

                        } else {

                            System.out.println("Insufficient Balance");

                        }

                    }

                    System.out.println("");

                    break;



                case 2:

                    if (!case0Used) {

                        System.out.println("Please choose 0 and type account number");

                    } else {

                        System.out.print("Enter money to be deposited:");

                        deposit = sc.nextInt();

                        balance += deposit;

                        System.out.println("Your " + deposit + "$ has been successfully deposited");

                    }

                    System.out.println("");

                    break;



                case 3:

                    if (!case0Used) {

                    	  System.out.println("Please choose 0 and type account number");

                    } else {

                        System.out.println("Balance : " + balance + "$");

                    }

                    System.out.println("");

                    break;



                case 4:

                    System.exit(0);

            }

			Thread.sleep(3000);

        }

    }

}