/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab6;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 000728303
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("questions.txt");
        Charset cs = Charset.forName("UTF-8");
        List<String> lines = Files.readAllLines(path,cs);
        List<Question> questions= new ArrayList<>();
        
        for(String line : lines){
            String []s = line.split(";");
            int id = Integer.parseInt(s[1]);
            Question question = new Question(s[0],id);
            questions.add(question);
        }
        int questionNum = questions.size();
        int randomNum = (int) (Math.random() * (questionNum));
        System.out.println(questions.get(randomNum).toString());
        
        
        
    }
}
