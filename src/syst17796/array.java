/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syst17796;
/**
 *
 * @author Jared Woodard
 */
import java.util.Scanner;
public class array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    System.out.println ("Enter a word: ");
    Scanner userword = new Scanner (System.in);
    String word = userword.nextLine();
        
    char[] letters = new char[word.length()];
    
    for (int i = 0; i < word.length(); i++)
    {
        letters[i] = word.charAt(i);
    }
    
    System.out.println("Reversed:");
    
    for (int i = word.length() - 1; i >= 0; i--)
    {
        System.out.print (letters[i]);
    }
    
    System.out.println("");
    
    }
    
}
