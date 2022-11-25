import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class ChangeMembership {     //TODO: MENU FOR MEMBER SHIP AND THIS.

    //—————————————————————————————————————————————————— Variables —————————————————————————————————————————————————————
    private String InputChangeMembership;
    private int inputDeleted;

    //—————————————————————————————————————————————————— instance & scanner ————————————————————————————————————————————

    Membership membership = new Membership();
    Scanner sc = new Scanner(System.in);
    //——————————————————————————————————————————————————   Methodes ————————————————————————————————————————————————————

    public void changeMembership () {
        System.out.println("You want to change your membership");
        System.out.println("write your membership ID: ");
        InputChangeMembership = sc.nextLine();
        if (InputChangeMembership.equals(membership.getMemberNumber())) {
           // member.remove(inputLine);
            changeOutcome();
        }
    }

    public void changeOutcome() {
        if (InputChangeMembership.equals("active".toLowerCase())) {
            System.out.println("Your membership is change to a passive membership");
            membership.getInputLine().equals("Passive Member");
           // member.add(inputLine);
        } else if (InputChangeMembership.equals("passive".toLowerCase())) {
            System.out.println("Your membership is change to a active membership");
            membership.getInputLine().equals("active member");
           // member.add("active member");
        }
    }

    public void deleteMembership () {
        try {
            System.out.println(" Write the number for the line you want to delete");
            inputDeleted = sc.nextInt();
            if (inputDeleted == membership.getMemberNumber()) {
              //  member.remove(input);
                System.out.println(inputDeleted + " is not a member from"
                        + LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-MM-DD HH:mm:ss" + " ")));
            }
        }catch (Exception e) {
            System.out.println("Something went wrong while deleting a member");
        }

    }


}

