package JavaFundamentalsTasks;
import java.util.*;

public class MainTaskJava2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert command line arguments split with comma. Press Enter once you are done.");
        String arguments = scan.nextLine();
        String[] splitArguments = arguments.split(",");
        for (int i = splitArguments.length - 1; i >= 0; i--) {
            System.out.print(splitArguments[i] + " ");
        }
    }
}
