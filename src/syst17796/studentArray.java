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
public class studentArray {
    
    public static void main(String[] args) {
    
    Student[] classList = new Student [5];
    
    Student Mark = new Student();
    Mark.setName("Mark");
    Mark.setProgram("System Analyst");
    
    classList[0] = Mark;
    
    Student Alice = new Student();
    Alice.setName("Alice");
    Alice.setProgram("Backend Developer");
    
    classList[1] = Alice;
    
    Student Kyle = new Student();
    Kyle.setName("Kyle");
    Kyle.setProgram("Programmer");
    
    classList[2] = Kyle;
    
    Student Mari = new Student();
    Mari.setName("Mari");
    Mari.setProgram("Play-Tester");
    
    classList[3] = Mari;
    
    Student Travis = new Student();
    Travis.setName("Travis");
    Travis.setProgram("Cyber Safety");
    
    classList[4] = Travis;
    
    for (int i = 0; i < classList.length; i++) {
        System.out.println (classList[i].getName());
    }
    }
}