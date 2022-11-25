import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;
public class Membership {
    //—————————————————————————————————————————————————— Variables ———————————————————————————————————————————————————
    private String firstName;
    private String surname;
    private String birtInput;
    private String inputLine;
    private int age;
    private int input;
    private static int nextMember = 1;
    private int memberNumber;
    private int price;

    //—————————————————————————————————————————————————— Constructur ———————————————————————————————————————————————————
    public Membership() {
        memberNumber = nextMember++;
    }
    //——————————————————————————————————————————————————  Arraylist ————————————————————————————————————————————————————
    private ArrayList <String> member = new ArrayList<>();

    //——————————————————————————————————————————————————  Scanner & instance ————————————————————————————————————————————————————
    SwimmingDisciplines swimmingDisciplines = new SwimmingDisciplines();
    Scanner sc = new Scanner(System.in);

    //——————————————————————————————————————————————————  Getter ——————————————————————————————————————————————————————

    // getter
    public int getMemberNumber() {
        return memberNumber;
    }

    public String getInputLine() {
        return inputLine;
    }

    public int getPrice () {
        return price;
    }


    //——————————————————————————————————————————————————  Setter ——————————————————————————————————————————————————————

    public void setOverAgePrice (int overAgePrice) {
        this.price = overAgePrice;
    }

    //——————————————————————————————————————————————————  Methodes ————————————————————————————————————————————————————


    public void CreatMember() {
        System.out.println("What is your first name ?");
        firstName = sc.nextLine();
        System.out.println("What is your surname ?");
        surname = sc.nextLine();
        System.out.println("Enter your date of birth in the following format 'YYYY-MM-DD':");
        birtInput = sc.nextLine();
        activeOrPassiveMember();
    }

    public void activeOrPassiveMember () {
        System.out.println("Do you want a active or passive membership? ");
        inputLine = sc.nextLine();
        member.add(inputLine + "Member");

        if (inputLine.equals("passive".toLowerCase())) {
            setOverAgePrice(500);
            System.out.println("Price: " + (getPrice()));

        } else if (inputLine.equals("active".toLowerCase())) {
            exerciserOrCompetitionSwimmer();
            swimmingDisciplines.ChooseASwimmingDisciplin();
        }
    }
    public int getAge(){
        return age;
    }

    public int age () {
        LocalDate birth = LocalDate.parse(birtInput);
        LocalDate presentDate = LocalDate.now();
        System.out.println(Period.between(birth, presentDate).getYears());
        return age;
    }

    public int calculatingAge() {
        try {
            LocalDate birth = LocalDate.parse(birtInput);
            LocalDate presentDate = LocalDate.now();
            if (Period.between(birth, presentDate).getYears() < 18 ) {
                setOverAgePrice(1600);
                System.out.println(" You will be set on the junior team\nPrice junior team : " + (getPrice())+ " yeary");
            }
            else if (Period.between(birth, presentDate).getYears() >= 18) {
                setOverAgePrice(1000);
                System.out.println("You will be set on the senior team\nPrice senior team : " +(getPrice())+ " yeary" );
            }
            else if  (Period.between(birth, presentDate).getYears() >= 60 )  {
                setOverAgePrice(1200);
                System.out.println("You are 18 you will be set on the senior team \nPrice senior team : " + (getPrice()) + "(25% of the senori price) ");
                }

        } catch (Exception e) {
            System.err.println("Something went wrong");
        }
        return age;
    }

    public void exerciserOrCompetitionSwimmer() {
        System.out.println("Swimming form ");
        System.out.println("Choose 1 (competition swimmer) \nChooose 2 (exerciser)");
        System.out.print("Enter:");
        input = sc.nextInt();
        if (input == 1)  {
            calculatingAge();
        }
        else if (input == 2) {
            System.out.println("You are now registered as a exerciser");
            //TODO:calulating pricee
        }
    }


}

