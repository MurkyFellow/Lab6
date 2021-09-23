/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab6;

/**
 *
 * @author Seth
 */


//This class will make an answer to a question with a specific ID
public class Answer {
    private String text;
    private int questionID;

    public Answer(String text, int questionID) {
        this.text = text;
        this.questionID = questionID;
    }

    
    @Override
    public String toString() {
        return String.format("Answer: %s ,%d",text, questionID);
    }
    
    
}
