package game.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.*;

public class TTTGame {

    private BufferedReader in;
    private String[] marks = {" "," "," "," "," "," "," "," "," "};
    private int[] winMarks = {0,0,0,0,0,0,0,0,0}; // player 1 = 1 player 2 = 4
    private int player = 1; //true == player 1 false == player 2
    private boolean gameOngoing = true;
    private boolean AIOn = false;
    private int turn = 1;
    private StaticAI AIOpponent;
    private int strategy=1;


    public static void main(String[] args) throws IOException {
	// init marks - everyting is set to " ";

        TTTGame game;

        game = new TTTGame();
        game.gameLoop();
    }

    private TTTGame(){
        in = new BufferedReader(new InputStreamReader(System.in));
    }

    private void gameLoop() throws IOException {

        AIOpponent = new StaticAI();

        setUpGame();
        printBoard();
        while(gameOngoing) {



            placeMark();
            printBoard();
            checkWin();

        }


    }

    private void setUpGame() throws IOException {

        String input;
        System.out.println("Welcome to a round of TicTacToe, do you want to play against the static AI? (Y/N)");
        input=getInput();
        if(input.equals("Y")){
            AIOn=true;
            System.out.println("AI Opponent activated - good luck.");
            System.out.println("AI is Player one, X marks.");
        }
    }


    private void printBoard(){

        //System.out.println("Hier wird ein neues Spiel entstehen.");
        System.out.println(" ___________________________");
        System.out.println("|        |         |        |");
        System.out.println("|   "+marks[0]+"    |    "+marks[1]+"    |    "+marks[2]+"   |");
        System.out.println("|        |         |        |");
        System.out.println("| ------------------------- |");
        System.out.println("|        |         |        |");
        System.out.println("|    "+marks[3]+"   |    "+marks[4]+"    |    "+marks[5]+"   |");
        System.out.println("|        |         |        |");
        System.out.println("| ------------------------- |");
        System.out.println("|        |         |        |");
        System.out.println("|    "+marks[6]+"   |    "+marks[7]+"    |    "+marks[8]+"   |");
        System.out.println("| _______|_________|_______ |");




    }

    private void placeMark() throws IOException {

        boolean markPlaced = false;
        int markCoordsInt;
        String markCoordsString;
        int move=-1;

        if(AIOn&&player==1){

            switch (turn){

                case 1: move= AIOpponent.turn1(strategy);
                break;
                case 2: move=AIOpponent.turn2(strategy, winMarks);
                break;
                case 3: move=AIOpponent.turn3(strategy, winMarks);
                break;
                case 4: move=AIOpponent.turn4(strategy, winMarks);
                    break;
                case 5: move=AIOpponent.turn5(strategy, winMarks);
                    break;
                default: move=-1;
                break;
            }
            winMarks[move]=player;
            marks[move]="X";
            markPlaced=!markPlaced;
            player=4;
            turn++;
        }



        while(!markPlaced) {
            System.out.println("Please place a mark by entering a value between 0 and 8.");
            markCoordsString= getInput();
            markCoordsInt=Integer.parseInt(markCoordsString);
            if(winMarks[markCoordsInt]==0){
                if(markCoordsString.equals("0")){

                }
                    System.out.println("Mark Set");
                    winMarks[markCoordsInt]=player;
                    if (player==1){
                        marks[markCoordsInt]="X";
                        player=4;
                    }
                    else{
                        marks[markCoordsInt]="O";
                        player=1;
                    }
                    markPlaced=!markPlaced;
            }
            else{
                System.out.println("The Spot is taken. 0 to 8 left up right down.");
            }

        }

    }


    public void checkWin(){

        int playerWin = 0;

        if(winMarks[0]+winMarks[1]+winMarks[2]==3) {
            playerWin=1;
        }
        else if(winMarks[0]+winMarks[1]+winMarks[2]==12) {
            playerWin=2;
        }
        /////////////////////////
        if(winMarks[0]+winMarks[3]+winMarks[6]==3) {
            playerWin=1;
        }
        else if(winMarks[0]+winMarks[3]+winMarks[6]==12) {
            playerWin=2;
        }
        ///////////////////////////
        if(winMarks[0]+winMarks[4]+winMarks[8]==3) {
            playerWin=1;
        }
        else if(winMarks[0]+winMarks[4]+winMarks[8]==12) {
            playerWin=2;
        }
        ////////////////////////
        if(winMarks[1]+winMarks[4]+winMarks[7]==3) {
            playerWin=1;
        }
        else if(winMarks[1]+winMarks[4]+winMarks[7]==12) {
            playerWin=2;
        }
        /////////////////////////
        if(winMarks[2]+winMarks[4]+winMarks[6]==3) {
            playerWin=1;
        }
        else if(winMarks[2]+winMarks[4]+winMarks[6]==12) {
            playerWin=2;
        }
        /////////////////////////
        if(winMarks[2]+winMarks[5]+winMarks[8]==3) {
            playerWin=1;
        }
        else if(winMarks[2]+winMarks[5]+winMarks[8]==12) {
            playerWin=2;
        }
        /////////////////////////
        if(winMarks[3]+winMarks[4]+winMarks[5]==3) {
            playerWin=1;
        }
        else if(winMarks[3]+winMarks[4]+winMarks[5]==12) {
            playerWin=2;
        }
        /////////////////////////
        if(winMarks[6]+winMarks[7]+winMarks[8]==3) {
            playerWin=1;
        }
        else if(winMarks[6]+winMarks[7]+winMarks[8]==12) {
            playerWin=2;
        }

        if(playerWin!=0){
            endGame(playerWin);
        }
        else if(IntStream.of(winMarks).sum()==21){
            tieGame();
        }

    }

    private void endGame(int i){

        System.out.println("Congratulations Player "+i+" you won!");
        System.out.println("The game is over");
        gameOngoing=!gameOngoing;
    }

    private void tieGame(){
        System.out.println("The Game is a TIE!");
        gameOngoing=!gameOngoing;
    }

    private String getInput() throws IOException {
        //einlesen von Konsole
        return in.readLine();
    }



}

