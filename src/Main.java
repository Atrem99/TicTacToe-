import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = "_________";


        System.out.println("---------");
        System.out.print("| ");

        char a = value.charAt(0);
        System.out.print(a + " ");

        char a1 = value.charAt(1);
        System.out.print(a1 + " ");

        char a2 = value.charAt(2);
        System.out.println(a2 + " |");

        System.out.print("| ");

        char a3 = value.charAt(3);
        System.out.print(a3 + " ");

        char a4 = value.charAt(4);
        System.out.print(a4 + " ");

        char a5 = value.charAt(5);
        System.out.println(a5 + " |");

        System.out.print("| ");

        char a6 = value.charAt(6);
        System.out.print(a6 + " ");

        char a7 = value.charAt(7);
        System.out.print(a7 + " ");

        char a8 = value.charAt(8);
        System.out.println(a8 + " |");

        System.out.println("---------");

        char[][] el = new char[][]{
                {a, a1, a2},
                {a3, a4, a5},
                {a6, a7, a8},
        };

        boolean XWin = false;
        boolean OWin = false;


        int n1;
        int n2;

        int countGamer = 1;
        int sumCount = 0;


        while (sumCount < 9) {

            System.out.print("Enter the coordinates: ");

            if (sc.hasNextInt()) {

                n1 = sc.nextInt() - 1;
                n2 = sc.nextInt() - 1;

                if (n1 < 0 || n2 < 0 || n1 > 2 || n2 > 2) {
                    System.err.println("\n" + "Coordinates should be from 1 to 3!");

                } else if (el[n1][n2] == 'X' || el[n1][n2] == 'O') {
                    System.err.println("\n" + "This cell is occupied! Choose another one!");

                } else if (el[n1][n2] != 'X' || el[n1][n2] != 'O') {
                    switch (countGamer) {
                        case 1:
                            el[n1][n2] = 'X';
                            sumCount++;
                            countGamer++;
                            break;
                        case 2:
                            el[n1][n2] = 'O';
                            sumCount++;
                            countGamer--;
                            break;
                    }
                }
                System.out.println("---------");
                System.out.print("| ");
                System.out.print(el[0][0] + " ");
                System.out.print(el[0][1] + " ");
                System.out.println(el[0][2] + " |");
                System.out.print("| ");
                System.out.print(el[1][0] + " ");
                System.out.print(el[1][1] + " ");
                System.out.println(el[1][2] + " |");
                System.out.print("| ");
                System.out.print(el[2][0] + " ");
                System.out.print(el[2][1] + " ");
                System.out.println(el[2][2] + " |");
                System.out.println("---------");

                final int XRes = 264;
                final int ORes = 237;

                int XCount = 0;
                int OCount = 0;

                int sum0 = 0;
                int sum1 = 0;
                int sum2 = 0;
                int sum3 = 0;
                int sum4 = 0;
                int sum5 = 0;
                int sum6 = 0;
                int sum7 = 0;

                for (int i = 0; i < el.length; i++) {
                    for (int j = 0; j < el[i].length; j++) {
                        if (el[i][j] == 88) {
                            XCount++;
                        }
                        if (el[i][j] == 79) {
                            OCount++;
                        }
                        if (i == j) {
                            sum6 += el[i][j];
                        }
                        if (i == el.length - 1 - j) {
                            sum7 += el[i][j];
                        }
                    }
                }
                for (int k = 0; k < el.length; k++) {
                    sum0 += el[0][k];
                    sum1 += el[1][k];
                    sum2 += el[2][k];
                    sum3 += el[k][0];
                    sum4 += el[k][1];
                    sum5 += el[k][2];
                }

                if (sum0 == XRes || sum1 == XRes || sum2 == XRes || sum3 == XRes || sum4 == XRes || sum5 == XRes || sum6 == XRes || sum7 == XRes) {
                    XWin = true;
                }
                if (sum0 == ORes || sum1 == ORes || sum2 == ORes || sum3 == ORes || sum4 == ORes || sum5 == ORes || sum6 == ORes || sum7 == ORes) {
                    OWin = true;
                }

                if (XWin) {
                    System.out.println("X wins");
                    break;
                } else if (OWin) {
                    System.out.println("O wins");
                    break;
                } else if (XCount + OCount == 9) {
                    System.out.println("Draw");
                    break;
                }

            } else {
                System.err.println("You should enter numbers!");
                sc.nextLine();
            }
        }
    }
}















