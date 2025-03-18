import java.util.*;
public class Grid {
    public static void main(String[] args) {
        String[][] Grid = {{" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}};


        Scanner scanner= new Scanner(System.in);
        System.out.println("Player 1, which row would you like?");
        int row = scanner.nextInt();
        System.out.println("Player 1, which column would you like?");
        int column = scanner.nextInt();
        Grid[row][column] = "X";
        System.out.println(Arrays.deepToString(Grid));


    }
}
