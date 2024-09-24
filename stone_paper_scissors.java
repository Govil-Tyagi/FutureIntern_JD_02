import java.util.Scanner;

public class stone_paper_scissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] box = { "stone", "paper", "sciocsor" };

        while (true) {
            System.out.println("Enter your choice \"stone\", \"paper\", \"scissors\"  (complete spelling)");
            String user = sc.next();
            int idx = (int) (Math.random() * 3);
            System.out.println("System's choice is " + box[idx]);
            if (user.equalsIgnoreCase("stone")) {
                if (box[idx].equalsIgnoreCase("scissors")) {
                    System.out.println("You won");
                } else if (box[idx].equalsIgnoreCase("stone")) {
                    System.out.println("It is a draw");
                } else {
                    System.out.println("You lost");
                }
            } else if (user.equalsIgnoreCase("paper")) {
                if (box[idx].equalsIgnoreCase("stone")) {
                    System.out.println("You won");
                } else if (box[idx].equalsIgnoreCase("paper")) {
                    System.out.println("It is a draw");

                } else {
                    System.out.println("You lost");
                }
            } else if (user.equalsIgnoreCase("scissors")) {
                if (box[idx].equalsIgnoreCase("paper")) {
                    System.out.println("You won");
                } else if (box[idx].equalsIgnoreCase("scissors")) {
                    System.out.println("It is a draw");

                } else {
                    System.out.println("You lost");
                }
            } else {
                System.out.println("Wrong spelling ");
            }
            System.out.println("Want to play again ? y for yes");
            char ch = sc.next().charAt(0);
            if (ch == 'y') {
                continue;
            } else {
                break;
            }
        }
        System.out.println("Thanks for playing");
        sc.close();
    }
}
