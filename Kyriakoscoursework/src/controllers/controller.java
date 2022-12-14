package controllers;

import daos.arrayDAOImpl;
import helpers.InputHelper;
import helpers.OutputHelper;
import helpers.TextColours;
import model.lettersASCII;


public class controller {
    //Add your variables here
    private final InputHelper inputHelper;

    public controller() {
        // Add your code here
        this.inputHelper = new InputHelper();
    }

    /**
     * Displays the menu and uses an InputHelper object
     * to accept valid user choice.
     * An appropriate private method is called to implement the choice.
     */
    public void run() {
        boolean finished = false;

        int iChoice = 0;
        this.setup();

        System.out.println();

        do {
            this.theMenu();
            iChoice = inputHelper.readInt("Enter choice", 4,1);

            switch (iChoice) {
                // Add more cases
                case 1:
                    System.out.println();
                    break;

                default: // invalid option
                    System.out.println("Oops! Something has went wrong!");
                    break;
            }
        } while (!finished);
    }

    private void setup(){
        // Add your code here
    }

    private void theMenu() {
        // Print menu to console
        // Add your code here
    }

    // Add your code here
    // Add more private methods for each of your cases

}
