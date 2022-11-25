import java.util.Scanner;
public class Economy {
    //—————————————————————————————————————————————————— Variables ———————————————————————————————————————————————————
        private int paymentInput;
        private String accountNumber;

    //—————————————————————————————————————————————————— Scanner ———————————————————————————————————————————————————
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
    //—————————————————————————————————————————————————— Methodes ———————————————————————————————————————————————————
    public void payNowOrLater () {
        System.out.println("Do you want to pay now OR Later ?");
        System.out.println("Choose '1' (Now) \nChoose '2' (Later)");
        paymentInput = sc.nextInt();
        if (paymentInput == 1) {
            //member.add( payment :  'payed'));
            BankAccountInformation();
            System.out.println("We have know with drawn money from your bank account");
        }

        else if (paymentInput == 2)  {
            BankAccountInformation();
            //member.add( payment :  'debt' + "Bank account information" : +  userInput));
            System.out.println("We have now saved your bank acount informatiion for future payment");
        }
    }
        public void BankAccountInformation () {
            System.out.println("Please enter your bank accountnumber:");
            accountNumber = scanner.nextLine();
           // memeber.add("Bankaccountinofrmation:" + userInput);

        }

    }




