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
public class Question {

    private String text;
    private int id;

    @Override
    public String toString() {
        return String.format("Question: %s, %d", text, id);
    }
    

    
}
