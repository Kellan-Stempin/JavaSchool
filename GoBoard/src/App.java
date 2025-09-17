import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[][] goBoard = new String[9][9];

        for(int i = 0; i < goBoard.length; i++) {
            for(int j = 0; j < goBoard[i].length; j++) {
                goBoard[i][j] = "-+-";
            }
        }

        Scanner scanner = new Scanner(System.in);
        Boolean flipper = true; //black starts

        while (true) {
            for (int i = 0; i < goBoard.length; i++) {
                for (int j = 0; j < goBoard[i].length; j++) {
                    System.out.print(goBoard[i][j]);
            }
            System.out.println();
        }

        String player = flipper ? "Black (B)" : "White (W)";
        System.out.println(player + "'s turn");
        System.out.print("Enter row 0-8");
        int row = scanner.nextInt();
        System.out.print("Enter column 0-8");
        int col = scanner.nextInt();

        if (row < 0 || row >= goBoard.length || col < 0 || col >= goBoard.length) {
            System.out.println("Move is out of bounds.");
            continue;
        }

        if (!goBoard[row][col].equals("-+-")) {
            System.out.println("Spot already taken");
            continue;
        }

        goBoard[row][col] = flipper ? "-B-" : "-W-";
        flipper = !flipper;
        }
    }
}
