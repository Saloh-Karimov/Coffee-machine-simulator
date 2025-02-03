import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input n variable
        int n = scanner.nextInt();

        //initialize grade counts
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for (int i = 0; n > i; i++ ) {
            String grade = scanner.next();
            if (grade.equals("D")) {
                countD++;
            } else if (grade.equals("C")) {
                countC++;
            } else if (grade.equals("B")) {
                countB++;
            } else if (grade.equals("A")) {
                countA++;
            }

        }
        System.out.println(countD + " " + countC + " " + countB + " " + countA);

        scanner.close();

    }
}