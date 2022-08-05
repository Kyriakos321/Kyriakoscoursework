package daos;

import app.ASCIIAlphaApp;
import model.*;
import view.aView;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class arrayDAOImpl extends DAO{
    private ArrayList<lettersASCII> theData;
    // Add variables here

    public static final char DELIMITER = ',';
    public static final char EOLN='\n';
    public static final String QUOTE="\"";
    public static final String USERDIRECTORY = System.getProperty("user.dir");

    private String stripQuotes(String str) {
        return str.substring(1, str.length()-1);
    }

    public arrayDAOImpl(){
        // Add your code here
    }

    public arrayDAOImpl(ArrayList<lettersASCII> alData, stackDAOImpl aStack, aView aDataView) {
        // Add your code here
    }

    public ArrayList<lettersASCII> getTheData() {
        return null; // Add your return type here
    }

    public void setTheData(ArrayList<lettersASCII> theData) {
        // Add your code here
    }

    @Override
    public void loadFromFile(String filename) {
        String transactionFile = USERDIRECTORY +"\\" + filename;

        try (BufferedReader br = new BufferedReader(new FileReader(transactionFile))) {
            // Add your variables here

            String[] temp;
            String line = br.readLine();
            while(line!=null){
                // split each line and store the values in your variables

                // Create required instances of your modelled data

                // Insert into the list
                line = br.readLine();

            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(ASCIIAlphaApp.class.getName()).log(Level.INFO, null, ex);
        }
    }

    @Override
    public void writeToFile(String filename) {
        // Add your code here
    }

    @Override
    public void add(lettersASCII aLetter) {
        // Add your code here
    }

    @Override
    public lettersASCII retrieve(String aLetter) {
        // Add your code here
        return null;  // Add your return value here
    }

    @Override
    public lettersASCII remove(int pos) {
        return null;
    }

    public String convertToBase(int number, int base)
    {
        // Add your code here
        return null;  // Add your return value here
    }

    public void displayAllData(){
        // Add your code here
    }

    public void displayAnItem(lettersASCII anItem){
        // Add your code here
    }
}
