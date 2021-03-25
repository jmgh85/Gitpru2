/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitpru2;

/**
 *
 * @author jguther0
 */
public class Gitpru2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String exampleString = "This is just a sample string2";

        int stringLength = exampleString.length();

        System.out.println("String length: " + stringLength);

        int stringLengthWithoutSpaces = exampleString.replace(" ", "").length();
        System.out.println("String length without counting whitespaces: " + stringLengthWithoutSpaces);
    }
    
}
