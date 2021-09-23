/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab6;

/**
 *
 * @author 000728303
 */

//This class makes a question with a id to Identify it
public class Question {

    private String text;
    private int id;

    public Question(String text, int id) {
        this.text = text;
        this.id = id;
    }

    
    
    @Override
    public String toString() {
        return String.format("Question: %s, %d", text, id);
    }
    

    
}
