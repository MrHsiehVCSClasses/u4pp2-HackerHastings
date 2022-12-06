package u4pp;
import java.util.Scanner;

public class InputHelper {
    
    Scanner scanner = new Scanner(System.in);

    public InputHelper(Scanner scanner){
        this.scanner = scanner;
    }
    //gets input from user - yes or no
    public boolean getYesNoInput(String prompt){
        boolean question = true;
        while(question == true){
            System.out.println(prompt);
            String answer = scanner.nextLine();

            if(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y'){
                question = false;
                return true;
            } else if(answer.charAt(0) == 'n' || answer.charAt(0) == 'N'){
                question = false;
                return false;
            } else {
                System.out.println("That's not a valid answer idiot, Y or N.");
            }
        }
        return false;
    }
//gets input from user, range of numbers
    public int getIntegerInput(String prompt, int min, int max){
        boolean question = true;
        while(question == true){
            System.out.println(prompt);
            int answer = scanner.nextInt();
            String answerIdiot = scanner.nextLine();
            if(answer >= min && answer <= max){
                question = false;
                return answer;
            } else {
                System.out.println("That's not a valid answer idiot");
            }
        }
        return -1;
    }
}
