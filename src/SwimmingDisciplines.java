import java.util.Scanner;

public class SwimmingDisciplines {

    //—————————————————————————————————————————————————— Variables —————————————————————————————————————————————————————
    private int userInput;
    private String breastSwimming;
    private String butterfly;
    private String backSwimming;
    Scanner sc = new Scanner(System.in);

    //—————————————————————————————————————————————————— Getter ————————————————————————————————————————————————————————
    public String getBreastSwimming () {
        return breastSwimming;
    }
    public String getButterfly () {
        return butterfly;
    }
    public String getBackSwimming () {
        return backSwimming;
    }
    //—————————————————————————————————————————————————— Methode  ——————————————————————————————————————————————————————
    public void ChooseASwimmingDisciplin () {
        try {
            System.out.println("\nSwimming Disciplins");
            System.out.println("Choose 1 (breastSwimming) \nChoose 2 (butterfly)\nChoose 3 (backSwimming)");
            System.out.print("Enter : ");
            userInput = sc.nextInt();
            if (userInput == 1 ) {
                //memeber.add("Swimming disciplin : " + getBreastSwimming)
                System.out.println("Your swimming displin is now registed as: " + getBreastSwimming());

            } else if (userInput == 2) {
                //memeber.add("Swimming disciplin : " + getButterfly )
                System.out.println("Your swimming displin is now registed as: " + getButterfly());

            } else if (userInput == 3) {
                //memeber.add("Swimming disciplin : " + getBackSwimming )
                System.out.println("Your swimming displin is now registed as: " + getBackSwimming());
            } else {
                System.out.println("you didnt type one of the opions");
            }
        } catch (Exception e) {
            System.err.println("something went wrong while choosing swimming disciplin");

        }
        }

        }





