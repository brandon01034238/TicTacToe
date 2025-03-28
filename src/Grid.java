import java.util.*;
public class Grid {


    private String[][] Grid = {{"⬜", "⬜", "⬜"},
            {"⬜", "⬜", "⬜"},
            {"⬜", "⬜", "⬜"}};


    public Grid(){
        this.Grid = Grid;
    }




    public void start(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Player 1, which row would you like?");
        int row = scanner.nextInt();
        if (row > 2){
            while (row > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 1, which row would you like?");
                row = scanner.nextInt();
            }
        }
        System.out.println("Player 1, which column would you like?");
        int column = scanner.nextInt();
        if (column > 2){
            while (column > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 1, which column would you like?");
                column = scanner.nextInt();
            }
        }
        Grid[row][column] = "|X|";
        for(int i = 0; i<Grid.length; i++){
            for (int j = 0; j < Grid[0].length; j ++){
                System.out.print(Grid[i][j] + " ");
            }
            System.out.println();
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Player 2, which row would you like?");
        int row1 = scanner1.nextInt();
        if (row1 > 2){
            while (row1 > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 2, which row would you like?");
                row1 = scanner1.nextInt();
            }
        }
        System.out.println("Player 2, which column would you like?");
        int column1 = scanner1.nextInt();
        if (column1 > 2){
            while (column1 > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 2, which column would you like?");
                column1 = scanner1.nextInt();
            }
        }
        Grid[row1][column1] = "|O|";
        for(int i = 0; i<Grid.length; i++){
            for (int j = 0; j < Grid[0].length; j ++){
                System.out.print(Grid[i][j] + " ");
            }
            System.out.println();
        }






        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Player 1, which row would you like?");
        int row2 = scanner2.nextInt();
        if (row2 > 2){
            while (row2 > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 1, which row would you like?");
                row2 = scanner2.nextInt();
            }
        }
        System.out.println("Player 1, which column would you like?");
        int column2 = scanner2.nextInt();
        if (column2 > 2){
            while (column2 > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 1, which column would you like?");
                column2 = scanner2.nextInt();
            }
        }
        Grid[row2][column2] = "|X|";
        for(int i = 0; i<Grid.length; i++){
            for (int j = 0; j < Grid[0].length; j ++){
                System.out.print(Grid[i][j] + " ");
            }
            System.out.println();
        }
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Player 2, which row would you like?");
        int row3 = scanner3.nextInt();
        if (row3 > 2){
            while (row3 > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 2, which row would you like?");
                row3 = scanner3.nextInt();
            }
        }
        System.out.println("Player 2, which column would you like?");
        int column3 = scanner3.nextInt();
        if (column3 > 2){
            while (column3 > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 2, which column would you like?");
                column3 = scanner3.nextInt();
            }
        }
        Grid[row3][column3] = "|O|";
        for(int i = 0; i<Grid.length; i++){
            for (int j = 0; j < Grid[0].length; j ++){
                System.out.print(Grid[i][j] + " ");
            }
            System.out.println();
        }




        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Player 1, which row would you like?");
        int row4 = scanner4.nextInt();
        if (row4 > 2){
            while (row4 > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 1, which row would you like?");
                row4 = scanner4.nextInt();
            }
        }
        System.out.println("Player 1, which column would you like?");
        int column4 = scanner4.nextInt();
        if (column4 > 2){
            while (column4 > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 1, which column would you like?");
                column4 = scanner4.nextInt();
            }
        }
        Grid[row4][column4] = "|X|";
        for(int i = 0; i<Grid.length; i++){
            for (int j = 0; j < Grid[0].length; j ++){
                System.out.print(Grid[i][j] + " ");
            }
            System.out.println();
        }
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Player 2, which row would you like?");
        int row5 = scanner5.nextInt();
        if (row5 > 2){
            while (row5 > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 2, which row would you like?");
                row5 = scanner5.nextInt();
            }
        }
        System.out.println("Player 2, which column would you like?");
        int column5 = scanner5.nextInt();
        if (column5 > 2){
            while (column5 > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 2, which column would you like?");
                column5 = scanner5.nextInt();
            }
        }
        Grid[row5][column5] = "|O|";
        for(int i = 0; i<Grid.length; i++){
            for (int j = 0; j < Grid[0].length; j ++){
                System.out.print(Grid[i][j] + " ");
            }
            System.out.println();
        }






        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Player 1, which row would you like?");
        int row6 = scanner6.nextInt();
        if (row6 > 2){
            while (row6 > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 1, which row would you like?");
                row6 = scanner6.nextInt();
            }
        }
        System.out.println("Player 1, which column would you like?");
        int column6 = scanner6.nextInt();
        if (column6 > 2){
            while (column6 > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 1, which column would you like?");
                column6 = scanner6.nextInt();
            }
        }
        Grid[row6][column6] = "|X|";
        for(int i = 0; i<Grid.length; i++){
            for (int j = 0; j < Grid[0].length; j ++){
                System.out.print(Grid[i][j] + " ");
            }
            System.out.println();
        }
        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Player 2, which row would you like?");
        int row7 = scanner7.nextInt();
        if (row7 > 2){
            while (row7 > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 2, which row would you like?");
                row7 = scanner7.nextInt();
            }
        }
        System.out.println("Player 2, which column would you like?");
        int column7 = scanner7.nextInt();
        if (column7 > 2){
            while (column7 > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 2, which column would you like?");
                column7 = scanner7.nextInt();
            }
        }
        Grid[row7][column7] = "|O|";
        for(int i = 0; i<Grid.length; i++){
            for (int j = 0; j < Grid[0].length; j ++){
                System.out.print(Grid[i][j] + " ");
            }
            System.out.println();
        }


        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Player 1, which row would you like?");
        int row8 = scanner8.nextInt();
        if (row8 > 2){
            while (row8 > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 1, which row would you like?");
                row8 = scanner8.nextInt();
            }
        }
        System.out.println("Player 1, which column would you like?");
        int column8 = scanner8.nextInt();
        if (column8 > 2){
            while (column8 > 2){
                System.out.println("You can only choose between numbers 0-2");
                System.out.println("Player 1, which column would you like?");
                column8 = scanner8.nextInt();
            }
        }
        Grid[row8][column8] = "|X|";
        for(int i = 0; i<Grid.length; i++){
            for (int j = 0; j < Grid[0].length; j ++){
                System.out.print(Grid[i][j] + " ");
            }
            System.out.println();
        }


        if(Grid[0][0].equals("|X|") && Grid[0][1].equals("|X|") && Grid[0][2].equals("|X|")){
            System.out.println("Player 1, you are the winner!");
        }
        else if(Grid[1][0].equals("|X|") && Grid[1][1].equals("|X|") && Grid[1][2].equals("|X|")){
            System.out.println("Player 1, you are the winner!");
        }
        else if(Grid[2][0].equals("|X|") && Grid[2][1].equals("|X|") && Grid[2][2].equals("|X|")){
            System.out.println("Player 1, you are the winner!");
        }
        else if(Grid[0][0].equals("|X|") && Grid[1][0].equals("|X|") && Grid[2][0].equals("|X|")){
            System.out.println("Player 1, you are the winner!");
        }
        else if(Grid[0][1].equals("|X|") && Grid[1][1].equals("|X|") && Grid[2][1].equals("|X|")){
            System.out.println("Player 1, you are the winner!");
        }
        else if(Grid[0][2].equals("|X|") && Grid[1][2].equals("|X|") && Grid[2][2].equals("|X|")){
            System.out.println("Player 1, you are the winner!");
        }
        else if(Grid[0][0].equals("|X|") && Grid[1][1].equals("|X|") && Grid[2][2].equals("|X|")){
            System.out.println("Player 1, you are the winner!");
        }
        else if(Grid[2][0].equals("|X|") && Grid[1][1].equals("|X|") && Grid[0][2].equals("|X|")){
            System.out.println("Player 1, you are the winner!");
        }




        else if (Grid[0][0].equals("|O|") && Grid[0][1].equals("|O|") && Grid[0][2].equals("|O|")){
            System.out.println("Player 2, you are the winner!");
        }
        else if(Grid[1][0].equals("|O|") && Grid[1][1].equals("|O|") && Grid[1][2].equals("|O|")){
            System.out.println("Player 2, you are the winner!");
        }
        else if(Grid[2][0].equals("|O|") && Grid[2][1].equals("|O|") && Grid[2][2].equals("|O|")){
            System.out.println("Player 2, you are the winner!");
        }
        else if(Grid[0][0].equals("|O|") && Grid[1][0].equals("|O|") && Grid[2][0].equals("|O|")){
            System.out.println("Player 2, you are the winner!");
        }
        else if(Grid[0][1].equals("|O|") && Grid[1][1].equals("|O|") && Grid[2][1].equals("|O|")){
            System.out.println("Player 2, you are the winner!");
        }
        else if(Grid[0][2].equals("|O|") && Grid[1][2].equals("|O|") && Grid[2][2].equals("|O|")){
            System.out.println("Player 2, you are the winner!");
        }
        else if(Grid[0][0].equals("|O|") && Grid[1][1].equals("|O|") && Grid[2][2].equals("|O|")){
            System.out.println("Player 2, you are the winner!");
        }
        else if(Grid[2][0].equals("|O|") && Grid[1][1].equals("|O|") && Grid[0][2].equals("|O|")){
            System.out.println("Player 2, you are the winner!");
        }


        else {
            System.out.println("It was a tie! No winner!");
        }






    }
}

