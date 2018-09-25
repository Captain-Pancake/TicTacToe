package game.base;

public class StaticAI {


    //i is a random number between 0 and 3 to select one of 4 different strategies.
    int turn1(int i) {
        int move=0;

        switch (i) {
            case 1: //something
                move=4;
                break;

            case 2: //something else

                break;

            default:
                break;
        }


        return move;
    }

    //i is a random number between 0 and 3 to select one of 4 different strategies.
    int turn2(int i, int[] winMarks) {
        int move=0;

        switch (i) {
            case 1: //something
                if(winMarks[0]==0) {
                    move=0;
                }
                else {
                    move=2;
                }
                break;

            case 2: //something else

                break;

            default:
                break;
        }
        return move;
    }

    //i is a random number between 0 and 3 to select one of 4 different strategies.
    int turn3(int i, int[] winMarks) {
        int move=0;
        int x=0;

        switch (i) {
            case 1: //something
                if(winMarks[6]==0&&winMarks[2]==1) {
                    move=6;
                }
                else if(winMarks[8]==0&&winMarks[0]==1){
                    move=8;
                }
                else if(winMarks[6]==4&&winMarks[8]==4){
                    move=7;
                }
                else if(winMarks[2]==4&&winMarks[8]==4){
                    move=5;
                }
                else if(winMarks[0]==4&&winMarks[6]==4){
                    move=3;
                }
                else {
                    while (winMarks[x] != 0) {
                        x++;
                    }
                    move = x;
                }
                break;

            case 2: //something else

                break;

            default:
                break;
        }
        return move;
    }

    //i is a random number between 0 and 3 to select one of 4 different strategies.
    public int turn4(int i, int[] winMarks) {
        int move=0;
        int x=0;

        switch (i) {
            case 1: //something

                if(winMarks[0]+winMarks[1]+winMarks[2]==8){
                    if(winMarks[0]==0){
                        move=0;
                        break;
                    }
                    if(winMarks[1]==0){
                        move=1;
                        break;
                    }
                    if(winMarks[2]==0){
                        move=2;
                        break;
                    }
                }
                else if(winMarks[0]+winMarks[3]+winMarks[6]==8){
                    if(winMarks[0]==0){
                        move=0;
                        break;
                    }
                    if(winMarks[3]==0){
                        move=3;
                        break;
                    }
                    if(winMarks[6]==0){
                        move=6;
                        break;
                    }
                }
                else if(winMarks[0]+winMarks[4]+winMarks[8]==8){
                    if(winMarks[0]==0){
                        move=0;
                        break;
                    }
                    if(winMarks[4]==0){
                        move=4;
                        break;
                    }
                    if(winMarks[8]==0){
                        move=8;
                        break;
                    }
                }
                else if(winMarks[1]+winMarks[4]+winMarks[7]==8){
                    if(winMarks[1]==0){
                        move=1;
                        break;
                    }
                    if(winMarks[4]==0){
                        move=4;
                        break;
                    }
                    if(winMarks[7]==0){
                        move=7;
                        break;
                    }
                }
                else if(winMarks[2]+winMarks[5]+winMarks[8]==8){
                    if(winMarks[2]==0){
                        move=2;
                        break;
                    }
                    if(winMarks[5]==0){
                        move=5;
                        break;
                    }
                    if(winMarks[8]==0){
                        move=8;
                        break;
                    }
                }
                else if(winMarks[2]+winMarks[4]+winMarks[6]==8){
                    if(winMarks[2]==0){
                        move=2;
                        break;
                    }
                    if(winMarks[4]==0){
                        move=4;
                        break;
                    }
                    if(winMarks[6]==0){
                        move=6;
                        break;
                    }
                }
                else if(winMarks[3]+winMarks[4]+winMarks[5]==8){
                    if(winMarks[3]==0){
                        move=3;
                        break;
                    }
                    if(winMarks[4]==0){
                        move=4;
                        break;
                    }
                    if(winMarks[5]==0){
                        move=5;
                        break;
                    }
                }
                else if(winMarks[6]+winMarks[7]+winMarks[8]==8){
                    if(winMarks[6]==0){
                        move=6;
                        break;
                    }
                    if(winMarks[7]==0){
                        move=7;
                        break;
                    }
                    if(winMarks[8]==0){
                        move=8;
                        break;
                    }
                }
                else if(winMarks[0]+winMarks[1]+winMarks[2]==2){
                    if(winMarks[0]==0){
                        move=0;
                        break;
                    }
                    if(winMarks[1]==0){
                        move=1;
                        break;
                    }
                    if(winMarks[2]==0){
                        move=2;
                        break;
                    }
                }
                else if(winMarks[0]+winMarks[3]+winMarks[6]==2){
                    if(winMarks[0]==0){
                        move=0;
                        break;
                    }
                    if(winMarks[3]==0){
                        move=3;
                        break;
                    }
                    if(winMarks[6]==0){
                        move=6;
                        break;
                    }
                }
                else if(winMarks[0]+winMarks[4]+winMarks[8]==2){
                    if(winMarks[0]==0){
                        move=0;
                        break;
                    }
                    if(winMarks[4]==0){
                        move=4;
                        break;
                    }
                    if(winMarks[8]==0){
                        move=8;
                        break;
                    }
                }
                else if(winMarks[1]+winMarks[4]+winMarks[7]==2){
                    if(winMarks[1]==0){
                        move=1;
                        break;
                    }
                    if(winMarks[4]==0){
                        move=4;
                        break;
                    }
                    if(winMarks[7]==0){
                        move=7;
                        break;
                    }
                }
                else if(winMarks[2]+winMarks[5]+winMarks[8]==2){
                    if(winMarks[2]==0){
                        move=2;
                        break;
                    }
                    if(winMarks[5]==0){
                        move=5;
                        break;
                    }
                    if(winMarks[8]==0){
                        move=8;
                        break;
                    }
                }
                else if(winMarks[2]+winMarks[4]+winMarks[6]==2){
                    if(winMarks[2]==0){
                        move=2;
                        break;
                    }
                    if(winMarks[4]==0){
                        move=4;
                        break;
                    }
                    if(winMarks[6]==0){
                        move=6;
                        break;
                    }
                }
                else if(winMarks[3]+winMarks[4]+winMarks[5]==2){
                    if(winMarks[3]==0){
                        move=3;
                        break;
                    }
                    if(winMarks[4]==0){
                        move=4;
                        break;
                    }
                    if(winMarks[5]==0){
                        move=5;
                        break;
                    }
                }
                else if(winMarks[6]+winMarks[7]+winMarks[8]==2){
                    if(winMarks[6]==0){
                        move=6;
                        break;
                    }
                    if(winMarks[7]==0){
                        move=7;
                        break;
                    }
                    if(winMarks[8]==0){
                        move=8;
                        break;
                    }
                }
                else {
                    while (winMarks[x] != 0) {
                        x++;
                    }
                    move = x;
                }

                break;

            case 2: //something else

                break;

            default:
                break;
        }
        return move;
    }

    //i is a random number between 0 and 3 to select one of 4 different strategies.
    int turn5(int i, int[] winMarks) {
        int move=0;
        int x=0;

        while (winMarks[x] != 0) {
            x++;
        }
        move = x;

        return move;
    }




}
