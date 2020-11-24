package five;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {
    public static String select(String tip, String... selections) {
        for (int i = 0; i < selections.length; i++) {
            System.out.println(i + ")\t" + selections[i]);
        }
        return selections[inputInt(tip, 0, selections.length - 1)];
    }

    public static String inputString(String tip) {
        do {
            System.out.print("[?] " + tip + " ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine().trim();
            return str;
        } while (true);
    }

    public static int inputInt(String tip, int min, int max) {
        do {
            System.out.print("[?] " + tip + " [" + (min >= 0 ? min : "?") + "-" + (max >= 0 ? max : "?") + "]: ");
            Scanner sc = new Scanner(System.in);
            Integer intinput = null;
            try {
                intinput = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("非数字");
                return intinput;
            }
            while (true);
        }
    }
