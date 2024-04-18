import java.util.*;
public class Main {

    private static int ROW = 3;
    private static int COL =3;

    private static String [][] board = new String[ROW][COL];
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        boolean done=false;
        boolean finish = false;
        boolean finishmove = false;
        int rowmove = 0;
        int colmove = 0;
        String playerMove = "x";



        do{
            clearBoard();
            do{//start of game
                display();
                do{//move loop
                    //get row move
                    rowmove = safeinput.getIntRange(in,"what is your row move?",1,3);
                    colmove = safeinput.getIntRange(in,"what is your column move?",1,3);
                    rowmove --;
                    colmove --;
                    finishmove = isValidMove(rowmove,colmove);
                }while(!finishmove);
                //place move in board
                board [rowmove][colmove] = playerMove;

                //check for win
           done=isWin(playerMove);



                //toggle player
                if (playerMove == "x"){
                    playerMove = "o";

                }
                else {
                    playerMove = "x";
                }

            }while(!done);

            finish=safeinput.getYN(in,"do you want to play again?");




        }while(finish);





    }


    private static void clearBoard(){
        for(int row=0;row < ROW; row++){
            for(int col =0; col < COL; col++){
                board[row][col]="-";
            }
        }

    }

    private static void display(){
        for(int row=0; row<ROW;row++){
            System.out.print("| ");
            for(int col=0;col<COL;col++){
                System.out.print(board[row][col]+" | ");
            }
            System.out.println();
        }
    }

    private static boolean isValidMove(int row,int col){
        boolean validMove = false;
        if(board [row][col].equals("-")){
            validMove = true;

        }
        else{
            System.out.println("space already taken");
        }
        return validMove;
    }


    private static boolean isRowWin(String player){
        boolean win = false;

        for (int i=0; i<ROW; i++){
            if (board[i][0].equals(player) &&
                board[i][1].equals(player) &&
                    board[i][2].equals(player)){
                win = true;
            }
        }
        return win;
    }

    private static boolean isColWin(String player){
        boolean win = false;

        for (int i=0; i<ROW; i++){
            if (board[0][i].equals(player) &&
                    board[1][i].equals(player) &&
                    board[2][i].equals(player)){
                win = true;
            }
        }
        return win;
    }

    private static boolean isdiagWin(String player){
        boolean win = false;


            if (board[0][0].equals(player) &&
                    board[1][1].equals(player) &&
                    board[2][2].equals(player)) {
                win = true;
            }
        else if (board[0][2].equals(player) &&
                board[1][1].equals(player) &&
                board[2][0].equals(player)) {
            win = true;
        }

        return win;
    }

    private static  boolean isWin(String player){
        boolean win = false;

        if(isRowWin(player)){
            win = true;
            System.out.println("you win! "+ player);
        }
        else if (isColWin(player)){
            win = true;
            System.out.println("you win! "+player);

        }else if (isdiagWin(player)){
            win = true;
            System.out.println("you win! "+player);
        }
        else if (isTie()){
            win = true;
            System.out.println("its a tie!");
        }
        return win;

    }

    private static boolean isTie(){
        boolean tie = true;
         for(int i =0; i < COL; i++){
             if(board[0][i].equals("-") || board[1][i].equals("-") || board[2][i].equals("-") ){
                 tie = false;
             }
             else if(board[i][0].equals("-") || board[i][1].equals("-") || board[i][2].equals("-") ){
                 tie = false;
             }
             else if(board[0][0].equals("-") || board[1][1].equals("-") || board[2][2].equals("-") ){
                 tie = false;
             }
             else if(board[0][2].equals("-") || board[1][1].equals("-") || board[2][0].equals("-") ){
                 tie = false;
             }




         }
        return tie;
    }


}

