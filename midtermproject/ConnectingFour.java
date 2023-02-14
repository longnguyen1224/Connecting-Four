package edu.angelo.midtermprojectnguyen;
/**
 * Author: Hoang Long Nguyen
 * CS 3372
 * Midterm Project: Connect 4
 */

import android.graphics.Color;

public class ConnectingFour {

    /**
     * declare player 1 as red color and player 2 as yellow color, and unused places
     */
    int player1 = Color.rgb(255, 0, 0); // represent for red color
    int player2 = Color.rgb(255, 255, 0); // represent for yellow color
    int Whitespace = Color.rgb(0,0,255); // represent for blue color


    /**
     * Declare number of steps represents the order of the players, turn 1 is red, and turn 2 is yellow
     */

    int steps;

    /**
     * Declare number of sequent colors needed to win
     */

    private static final int colorsWin = 4;

    /**
     *  Create board dimensions with row and column
     */
    private final int numRows, numColumns;


    /**
     *  Create a two-dimensional array of integers to keep track the board's grid
     */
    private int[][] board;

    /**
     * @param rows
     * @param columns
     * Use this method to initialize the number of rows and columns
     */
    public ConnectingFour(int rows, int columns) {
        this.numRows = rows;
        this.numColumns = columns;
        board = new int[rows][columns];
        clearBoard();
    }


    /**
     * Use this method to return the integer element of the board.
     */

    public int getLightColor (int row, int column) {
        // Use try-catch to check if number of row and column is out of bound
        try {
            return board[row][column];

            // If out of bound return 0
        } catch (ArrayIndexOutOfBoundsException exception ) {
            return 0;

        }
    }


    /**
     * Use this method to check if there is a white column available in click, drop the oval
     */
    public int Drop(int row, int column) {
        while ((board[row][column] == Whitespace) && column < numColumns - 1) {
            if (board[row][column + 1] == Whitespace) {
                column++;
            }
            else {

                break;
            }
        }

        return column;
    }

    /**
     * Use this method to check whenever it is either player 1 or player 2 turn, click on the board position to start playing, in this case, changing the color
     */

    public void click(int row, int column) {
        column = Drop(row, column);
        if (steps % 2 == 0 && board[row][column] == Whitespace) {
            board[row][column] = player1;
            steps++;
        }
        else if (board[row][column] == Whitespace) {
            board[row][column] = player2;
            steps++;
        }

    }



    /**
     * Use this method to check Draw game
     * @return true or false
     */
    public boolean full() {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (board[i][j] == Whitespace) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     *  Use this method to check if last play is a winning
     *  Return: the color who is win the game
     */

    public int isWinningPlay() {
        // Use this for loop to check every rows from bottom left corner
        for (int i = 0; i < numRows; i++) {
            int colors = board[i][numColumns - 1];
            if (colors == Whitespace) {
                break;
            }
            int sequent = 1;
            // Use this for loop check every column and check if there are enough sequent colors needed to win
            for (int j = numColumns - 2; j >= 0; j--) {
                if (colors == board[i][j]) {
                    sequent++;
                    if (sequent == colorsWin) {
                        return colors;
                    }
                }
                else if (board[i][j] != Whitespace) {
                    colors = board[i][j];
                    sequent = 1;
                }
                else {
                    break;
                }
            }
        }

        //Use this for loop to check every columns from bottom left corner
        for (int j = numColumns - 1; j >= 0; j--) {
            int colors = board[0][j];
            int sequent;
            if (colors == Whitespace) {
                sequent = 0;
            }
            else {
                sequent = 1;
            }

            // Use this for loop to check every row to and check if there are enough sequent colors needed to win
            for (int i = 1; i < numRows; i++) {
                if (board[i][j] == colors) {
                    if (colors != Whitespace) {
                        ++sequent;
                        if (sequent == colorsWin) {
                            return colors;
                        }
                    }
                }
                else if (board[i][j] != Whitespace) {
                    colors = board[i][j];
                    sequent = 1;
                }
                else {
                    colors = Whitespace;
                    sequent = 0;
                    continue;
                }
            }
        }

        // Use for loop here to check upward diagonals for winning
        for (int j = numColumns - 1; j >= 0; j--)
            for (int i = 0; i < numRows; ++i) {
                int colors = board[i][j];
                int sequent;
                if (colors == Whitespace) {
                    sequent = 0;
                }
                else {
                    sequent = 1;
                }
                for (int a = i+1, b = j-1; a < numRows && b >= 0; a++, b--) {
                    if (board[a][b] == colors) {
                        if (colors != Whitespace) {
                            sequent++;
                            if (sequent == colorsWin) {
                                return colors;
                            }
                        }
                    }
                    else if (board[a][b] != Whitespace) {
                        colors = board[a][b];
                        sequent = 1;
                    }
                    else {
                        colors = Whitespace;
                        sequent = 0;
                        continue;
                    }
                }
            }

        // Use this for loop to check downwards diagonals for winners if they start from upper left corner.
        for (int j = 0; j < numColumns; j++)
            for (int i = 0; i < numRows; i++) {
                int colors = board[i][j];
                int sequent;
                if (colors == Whitespace) {
                    sequent = 0;
                }
                else {
                    sequent = 1;
                }

                for (int a = i+1, b = j+1; a < numRows && b < numColumns; a++, b++) {
                    if (board[a][b] == colors) {
                        if (colors != Whitespace) {
                            sequent++;
                            if (sequent == colorsWin) {
                                return colors;
                            }
                        }
                    } else if (board[a][b] != Whitespace) {
                        colors = board[a][b];
                        sequent = 1;
                    } else {
                        colors = Whitespace;
                        sequent = 0;
                        continue;
                    }
                }
            }


        return Whitespace;
    }


    /**
     * Use this method to clear the board
     */
    public void clearBoard() {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                board[i][j] = Whitespace;
            }
        }
        steps = 0;
    }



    /**
     * Use this method to output the string
     */

    public String toString() {
        // Convert int number to String and return.
        StringBuilder boardgame = new StringBuilder();
        for (int row = 0; row < numRows; row++) {
            for (int column = 0; column < numColumns; column++) {
                boardgame.append(board[row][column]);
            }
            boardgame.append("\n");
        }
        return boardgame.toString();
    }

}




