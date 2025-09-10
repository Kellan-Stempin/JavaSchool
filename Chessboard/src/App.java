public class App {
    public static void main(String[] args) throws Exception {
        String[][] chessBoard = {
                                    {"R", "N", "B", "Q", "K", "B", "N", "R"},
                                    {"P", "P", "P", "P", "P", "P", "P", "P"},
                                    {"", "", "", "", "", "", "", ""},
                                    {"", "", "", "", "", "", "", ""},
                                    {"", "", "", "", "", "", "", ""},
                                    {"", "", "", "", "", "", "", ""},
                                    {"P", "P", "P", "P", "P", "P", "P", "P"},
                                    {"R", "N", "B", "Q", "K", "B", "N", "R"},
                                };
        
        Boolean flipper = false;

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                flipper = !flipper;
                if (flipper) {
                    System.out.print("\u001B[47m");
                    if (chessBoard[i][j] == "") {
                        System.out.print("   ");
                    }
                    else {
                        System.out.print(" " + chessBoard[i][j] + " ");
                    }
                } else {
                    System.out.print("\u001B[40m");
                    if (chessBoard[i][j] == "") {
                        System.out.print("---");
                    }
                    else {
                        System.out.print("-" + chessBoard[i][j] + "-");
                    }
                }
                System.out.print("\u001B[0m");
            }
            System.out.println();
            flipper = !flipper;
        }

    }
}
