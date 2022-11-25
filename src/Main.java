import java.io.IOException;

public class Main {
    void run () throws IOException {
        Menu menu = new Menu(" Delfine Swimmingclub" , " Choose one of the options : ", (" _______________________________________________")+ "\n Choose 1. (Member) \n "+ "Choose 2. (Economy)\n Choose 3. (Competition Swimmers)\n Choose 4. (economy)\n Choose 9 (End session)\n" + ("_______________________________________________"));
        menu.readChoice();


    }
    public static void main(String[] args) throws IOException {
        new Main().run();
    }
}
