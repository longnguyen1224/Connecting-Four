
package edu.angelo.midtermprojectnguyen;
/**
 * Author: Hoang Long Nguyen
 * CS 3372
 * Midterm Project: Connect 4
 */

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /*
   declare and initialize variables to hold the length, width and the number of colors of the board
    */
    private final int NUM_COLUMNS = 7;
    private final int NUM_ROWS = 6;
    private final int[] colors = new int[]{
            Color.rgb(255, 0, 0), // red color
            Color.rgb(255, 255, 0), // yellow color
            Color.rgb(0,0,255)// blue color
    };
    //access from the ConnectingFour by the object gameBoard
    private ConnectingFour gameBoard;

    // Create two dimensional array to hold the value of the button
    private Button[][] ConnectingButton;



    /**
     * function updateGameBoard made to reflect the state of the game by represents the colors and change the announcement
     * Return: the text when player 1 or player 2 who is winner

     */

    private void updateGameBoard() {
        for (int i = 0; i < NUM_COLUMNS; i++) {
            for (int j = 0; j < NUM_ROWS; j++) {
                ConnectingButton[i][j].setBackgroundColor(gameBoard.getLightColor(i,j));
            }
        }

        if (gameBoard.isWinningPlay() == colors[0]) {
            TextView textView = findViewById(R.id.textView);
            textView.setText("PLAYER 1 IS THE WINNER");
            textView.setTextColor(Color.rgb(255,255,255)); // white color
            textView.setBackgroundColor(Color.rgb(255,0,0)); // red color
        }
        else if (gameBoard.isWinningPlay() == colors[1]) {
            TextView textView = findViewById(R.id.textView);
            textView.setText("PLAYER 2 IS THE WINNER");
            textView.setTextColor(Color.rgb(0,0,0)); // black color
            textView.setBackgroundColor(Color.rgb(255,255,0)); // yellow color

        }
        else if (gameBoard.full()){
            TextView textView = findViewById(R.id.textView);
            textView.setText("No one win, TIE GAME!");
            textView.setTextColor(Color.rgb(0,0,0)); // black color
            textView.setBackgroundColor(Color.rgb(0,0,255)); // blue color
        }
        else {
            TextView textView = findViewById(R.id.textView);
            textView.setText("WHO WILL WIN CONNECTING FOUR?");
            textView.setTextColor(Color.rgb(0,0,0));
            textView.setBackgroundColor(Color.rgb(255,255,255));
        }

    }


    /**
     *  Write 42 public methods that buttons will use
     */

    public void clickR0C0(View click00) {
        gameBoard.click(0, 0);
        updateGameBoard();
    }

    public void clickR1C0(View click01) {
        gameBoard.click(1, 0);
        updateGameBoard();
    }

    public void clickR2C0(View click20) {
        gameBoard.click(2, 0);
        updateGameBoard();
    }

    public void clickR3C0(View click30) {
        gameBoard.click(3, 0);
        updateGameBoard();
    }

    public void clickR0C1(View click01) {
        gameBoard.click(0, 1);
        updateGameBoard();
    }

    public void clickR1C1(View click11) {
        gameBoard.click(1, 1);
        updateGameBoard();
    }

    public void clickR2C1(View click21) {
        gameBoard.click(2, 1);
        updateGameBoard();
    }

    public void clickR3C1(View click31) {
        gameBoard.click(3, 1);
        updateGameBoard();
    }

    public void clickR0C2(View click02) {
        gameBoard.click(0, 2);
        updateGameBoard();
    }

    public void clickR1C2(View click30) {
        gameBoard.click(1, 2);
        updateGameBoard();
    }

    public void clickR2C2(View click31) {
        gameBoard.click(2, 2);
        updateGameBoard();
    }

    public void clickR3C2(View click32) {
        gameBoard.click(3, 2);
        updateGameBoard();
    }

    public void clickR0C3(View click03) {
        gameBoard.click(0, 3);
        updateGameBoard();
    }

    public void clickR1C3(View click13) {
        gameBoard.click(1, 3);
        updateGameBoard();
    }

    public void clickR2C3(View click23) {
        gameBoard.click(2, 3);
        updateGameBoard();
    }

    public void clickR3C3(View click32) {
        gameBoard.click(3, 3);
        updateGameBoard();
    }

    public void clickR0C4(View click32) {
        gameBoard.click(0, 4);
        updateGameBoard();
    }

    public void clickR1C4(View click32) {
        gameBoard.click(1, 4);
        updateGameBoard();
    }

    public void clickR2C4(View click32) {
        gameBoard.click(2, 4);
        updateGameBoard();
    }

    public void clickR3C4(View click32) {
        gameBoard.click(3, 4);
        updateGameBoard();
    }

    public void clickR0C5(View click32) {
        gameBoard.click(0, 5);
        updateGameBoard();
    }

    public void clickR1C5(View click32) {
        gameBoard.click(1, 5);
        updateGameBoard();
    }

    public void clickR2C5(View click32) {
        gameBoard.click(2, 5);
        updateGameBoard();
    }

    public void clickR3C5(View click32) {
        gameBoard.click(3, 5);
        updateGameBoard();
    }
    public void clickR4C0(View click40) {
        gameBoard.click(4, 0);
        updateGameBoard();
    }
    public void clickR4C1(View click40) {
        gameBoard.click(4, 1);
        updateGameBoard();
    }
    public void clickR4C2(View click42) {
        gameBoard.click(4, 2);
        updateGameBoard();
    }
    public void clickR4C3(View click43) {
        gameBoard.click(4, 3);
        updateGameBoard();
    }
    public void clickR4C4(View click44) {
        gameBoard.click(4, 4);
        updateGameBoard();
    }
    public void clickR4C5(View click45) {
        gameBoard.click(4, 5);
        updateGameBoard();
    }
    public void clickR5C0(View click50) {
        gameBoard.click(5, 0);
        updateGameBoard();
    }
    public void clickR5C1(View click51) {
        gameBoard.click(5, 1);
        updateGameBoard();
    }
    public void clickR5C2(View click52) {
        gameBoard.click(5, 2);
        updateGameBoard();
    }
    public void clickR5C3(View click53) {
        gameBoard.click(5, 3);
        updateGameBoard();
    }
    public void clickR5C4(View click54) {
        gameBoard.click(5, 4);
        updateGameBoard();
    }
    public void clickR5C5(View click55) {
        gameBoard.click(5, 5);
        updateGameBoard();
    }
    public void clickR6C0(View click60) {
        gameBoard.click(6, 0);
        updateGameBoard();
    }
    public void clickR6C1(View click61) {
        gameBoard.click(6, 1);
        updateGameBoard();
    }
    public void clickR6C2(View click62) {
        gameBoard.click(6, 2);
        updateGameBoard();
    }
    public void clickR6C3(View click63) {
        gameBoard.click(6, 3);
        updateGameBoard();
    }
    public void clickR6C4(View click64) {
        gameBoard.click(6, 4);
        updateGameBoard();
    }
    public void clickR6C5(View click65) {
        gameBoard.click(6, 5);
        updateGameBoard();
    }


    /**
     * Use this method to make Reset button reset the board and text when the game is finished

     */
    public void startNewGame() {
        gameBoard.clearBoard();
        updateGameBoard();
    }

    /**
     * Use this method to set the text when player press start new game button
     */
    public void reset(View reset) {
        startNewGame();

    }

    /**
     * Initialize the gameBoard object and all the buttons in on create to start the board whenever through app runs
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gameBoard = new ConnectingFour(NUM_COLUMNS, NUM_ROWS);
        ConnectingButton = new Button[][]{{
                findViewById(R.id.R0C0),
                findViewById(R.id.R0C1),
                findViewById(R.id.R0C2),
                findViewById(R.id.R0C3),
                findViewById(R.id.R0C4),
                findViewById(R.id.R0C5)
        }, {
                findViewById(R.id.R1C0),
                findViewById(R.id.R1C1),
                findViewById(R.id.R1C2),
                findViewById(R.id.R1C3),
                findViewById(R.id.R1C4),
                findViewById(R.id.R1C5)
        }, {
                findViewById(R.id.R2C0),
                findViewById(R.id.R2C1),
                findViewById(R.id.R2C2),
                findViewById(R.id.R2C3),
                findViewById(R.id.R2C4),
                findViewById(R.id.R2C5)
        }, {
                findViewById(R.id.R3C0),
                findViewById(R.id.R3C1),
                findViewById(R.id.R3C2),
                findViewById(R.id.R3C3),
                findViewById(R.id.R3C4),
                findViewById(R.id.R3C5)
        }, {
                findViewById(R.id.R4C0),
                findViewById(R.id.R4C1),
                findViewById(R.id.R4C2),
                findViewById(R.id.R4C3),
                findViewById(R.id.R4C4),
                findViewById(R.id.R4C5)

        }, {
                findViewById(R.id.R5C0),
                findViewById(R.id.R5C1),
                findViewById(R.id.R5C2),
                findViewById(R.id.R5C3),
                findViewById(R.id.R5C4),
                findViewById(R.id.R5C5)
        }, {
                findViewById(R.id.R6C0),
                findViewById(R.id.R6C1),
                findViewById(R.id.R6C2),
                findViewById(R.id.R6C3),
                findViewById(R.id.R6C4),
                findViewById(R.id.R6C5)

        }};
       updateGameBoard();
    }
}