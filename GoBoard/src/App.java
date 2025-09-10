public class App {
    public static void main(String[] args) throws Exception {
        String[][] goBoard = new String[19][19];

        for(int i = 0; i < goBoard.length; i++) {
            for(int j = 0; j < goBoard[i].length; j++) {
                goBoard[i][j] = "-+-";
            }
        }

        goBoard[3][3] = "-B-";
        goBoard[10][15] = "-W-";

        for (int i = 0; i < goBoard.length; i++) {
            for (int j = 0; j < goBoard[i].length; j++) {
                System.out.print(goBoard[i][j]);
            }
            System.out.println();
        }
    }
}
