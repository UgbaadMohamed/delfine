import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class Membership {

    //Attributter-----------------
    private String firstName;

    private String surname;

    private int age;

    private String birtInput;

    private String inputLine;

    private int input;

    private String userInput;

    private static int nextmemeber = 1;

    private int membernumber;

    //construtur-----------------

    public Membership() {
        membernumber = nextmemeber++;
    }

    //Arraylist----------------

    private ArrayList <String> memeber = new ArrayList();

    //Scanner----------------
    Scanner sc = new Scanner(System.in);


    //getter -----------------

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
    public int getMembernumber () {
        return membernumber;
    }


    //setter -----------------
    public void setSurname() {
        this.surname = surname;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public void setAge() {
        this.age = age;
    }

    //MainMetoder -----------------

    public void membershipInformation() {
        System.out.println("What is your first name ?");
        firstName = sc.nextLine();
        System.out.println("What is your surname ?");
        surname = sc.nextLine();
        activeOrPaasivMememeber();
    }

    //subMetoder -----------------

    public void membersBirth() {
        System.out.println("Enter your date of birth in the following format 'YYYY-MM-DD':");
        birtInput = sc.nextLine();
    }

    public void calculatingAge() {
        try {
            LocalDate birth = LocalDate.parse(birtInput);
            LocalDate presentDate = LocalDate.now();

            if (Period.between(birth, presentDate).getYears() < 18 ) {
                System.out.println("Beacuse you are under 18, so you will be set on the junior team");
            }
            else if (Period.between(birth, presentDate).getYears() >= 18) {
                System.out.println("Beacuse you are 18 or above so you will be set on the senior team");
            }
        } catch (Exception e) {
            System.err.println("something went wrong");
        }
    }

    //TODO:FÅ DEN TIL A KØRER ELLERS RIGTIG!
    public void activeOrPaasivMememeber () {
        System.out.println("Do you want a active or passiv memebership?");
        System.out.print("Enter : ");
        inputLine = sc.nextLine();
        memeber.add(inputLine + "Member");

        if (inputLine.equals("passiv".toLowerCase())) {
            membersBirth();
            System.out.println("Your memebership is set to a passiv memebership from " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-MM-DD HH:mm:ss" + " ") ) + "Your memeber number is " + getMembernumber());
        } else if  (inputLine.equals("active".toLowerCase())) {
            System.out.println("Your memebership is now ready and is a active memebership from following date: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-MM-DD HH:mm:ss" + " ")) + "Your memeber number is " + getMembernumber());
            membersBirth();
            exerciserOrCompetitionSwimmer();
        }
    }
    public void exerciserOrCompetitionSwimmer() {
        System.out.println("Do you want to be registred as a competition swimmer or exerciser");
        System.out.println("Chooose '1' (competition swimmer) \nChooose '2' (exerciser) ");
        input = sc.nextInt();
        if (input == 1)  {
           System.out.println("You are now registred as a competition swimmer");
           calculatingAge();
        }
        else if (input == 2) {
            System.out.println("You are now registred as a exerciser");
        }
    }

    public void changeMembership () {
        System.out.println("You want to change your membership");
        System.out.println("write your memebership ID: ");
        userInput = sc.nextLine();
        if (userInput.equals(membernumber)) {
            memeber.remove(inputLine);
            changeOutcome();
        }
    }

    public void changeOutcome() {
        if (userInput.equals("active".toLowerCase())) {
            System.out.println("Your membership is change to a passiv memebership");
            inputLine = "Passiv Memeber";
            memeber.add(inputLine);
        } else if (userInput.equals("passiv".toLowerCase())) {
            System.out.println("Your membership is change to a active memebership");
            inputLine = "active memeber";
            memeber.add("active memeber");

        }
    }
    public void deleteMemebership () {
        try {
            System.out.println(" Write the number for the line you want to delete");
            input = sc.nextInt();
            if (input == membernumber ) {
                memeber.remove(input);
                System.out.println(input + " is not a member from" +  LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-MM-DD HH:mm:ss" + " ")));
            }

        }catch (Exception e) {
            System.out.println("Something went wrong while deleting a member");
        }
    }

}





