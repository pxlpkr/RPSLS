import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class RPSLS {
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> options = Arrays.asList(new String[] {"rock", "paper", "scissors", "spock", "lizard"});
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter Rock, Paper, Scissors, Lizard, or Spock: ");
            int input = options.indexOf(scanner.nextLine().toLowerCase());
            if (input == -1) {
                System.out.println("Invalid response.");
                break;
            }
            int cpu = (int) (Math.random()*options.size());
            if (cpu == input) {
                System.out.printf("You tied! %s vs %s\n",options.get(input),options.get(cpu));
            } else if (cpu == input-1 || cpu == input+2 || cpu == input-3 || cpu == input+4) {
                System.out.printf("You won! %s beats %s\n",options.get(input),options.get(cpu));
            } else {
                System.out.printf("You lose! %s beats %s\n",options.get(cpu),options.get(input));
            }
        }
    }
}