import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int countFixed = 0;
        int countReject = 0;
        int countReady = 0;


        for (int i = 0; i < n; i++) {
            int readiness = scanner.nextInt();

            if (readiness == 1) {
                countFixed++;
            } else if (readiness == -1) {
                countReject++;
            } else if (readiness == 0) {
                countReady++;
            }
        }
        System.out.println(countReady + " " + countFixed + " " + countReject);

        scanner.close();
    }
}