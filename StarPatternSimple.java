public class StarPatternSimple {
    public static void main(String[] args) {
        int rows = 5;

        System.out.println("Pattern 1:");
        printPattern1(rows);

        System.out.println("\nPattern 2:");
        printPattern2(rows);

        System.out.println("\nPattern 3:");
        printPattern3(rows);
    }

    // Pattern 1: Right Triangle
    public static void printPattern1(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 2: Inverted Right Triangle
    public static void printPattern2(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 3: Diamond
    public static void printPattern3(int rows) {
        int spaces = rows - 1;
        int stars = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            System.out.println();

            if (i < rows) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }
    }
}
