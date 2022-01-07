import java.util.*;
public class TicTacToe {
    public static void main(String []args) {
        System.out.println("Welcome to Tic Tac Toe! \nYou will start with X's\n\nEnter a number for the corresponding box\n");
        char[][] board = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        Scanner input = new Scanner(System.in);
        boolean hasGameEnd = false, plrTurn, comTurn;
        int plrNum;
        int x =0, y =0;
        displayBoard(board);
        while(!hasGameEnd){
            System.out.println();
            plrTurn = true;
            while (plrTurn){
                System.out.println("Enter a position");
                plrNum = input.nextInt();
                switch(plrNum){
                    case 1: x =0; y=0; break;
                    case 2: x =0; y=1; break;
                    case 3: x =0; y=2; break;
                    case 4: x =1; y=0; break;
                    case 5: x =1; y=1; break;
                    case 6: x =1; y=2; break;
                    case 7: x =2; y=0; break;
                    case 8: x =2; y=1; break;
                    case 9: x =2; y=2; break;
                }
                if(plrNum<1 || plrNum>10 || !Character.isDigit(board[x][y])){
                    System.out.println("Enter a valid position");
                } else {
                    board[x][y] = 'X';
                    plrTurn = false;
                }
            }
            displayBoard(board);
            System.out.println();
            hasGameEnd = checkWinner(board);
            if(hasGameEnd){
                System.out.println("You win!");
                break;
            }
            System.out.println("Computer's turn");
            comTurn = true;
            while(comTurn){
                int comNum = (int)(Math.random()*9)+1;
                switch(comNum){
                    case 1: x =0; y=0; break;
                    case 2: x =0; y=1; break;
                    case 3: x =0; y=2; break;
                    case 4: x =1; y=0; break;
                    case 5: x =1; y=1; break;
                    case 6: x =1; y=2; break;
                    case 7: x =2; y=0; break;
                    case 8: x =2; y=1; break;
                    case 9: x =2; y=2; break;
                }
                if(Character.isDigit(board[x][y])){
                    board[x][y] = 'O';
                    comTurn = false;
                }
            }
            displayBoard(board);
            System.out.println();
            hasGameEnd = checkWinner(board);
            if(hasGameEnd)System.out.println("You lose");
        }
    }
    public static boolean checkWinner(char[][] board){
        int x;
        boolean hasWon = false;
        for(x = 0; x<3; x++){
            if(board[x][0] == board[x][1] && board[x][0] == board[x][2]){
                hasWon = true;
                //System.out.println("Left and right");
            }
        }
        for(x = 0; x<3; x++){
            if(board[0][x] == board[1][x] && board[0][x] == board[2][x]){
                hasWon = true;
                //System.out.println("Up and down");
            }
        }
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2]){
            hasWon = true;
            //System.out.println("Diagonal down from left to right");
        }
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0]){
            hasWon = true;
            //System.out.println("Diagonal down from right to left");
        }
        return hasWon;
    }
    public static void displayBoard(char[][] board){
        for(char[] row : board){
            for(char i : row){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
