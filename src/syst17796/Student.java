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
public class Student {
    
    private String name;
    private String ID;
    private String program;
    private boolean setFullTime = true;
    
    public Student()
    {
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * @return the isFullTime
     */
    public boolean SetIsFullTime() {
        return SetFullTime;
    }

    /**
     * @param isFullTime the isFullTime to set
     */
    public void setIsFullTime(boolean setFullTime) {
        this.setFullTime = setFullTime;
    }
}
