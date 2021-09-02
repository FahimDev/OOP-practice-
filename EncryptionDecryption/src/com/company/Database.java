package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Database {


    Database(){

    }

    public void save(String data){
        try (BufferedReader br = Files.newBufferedReader(Paths.get("textSack.txt"))) {
            File fileOne = new File("textSack.txt");
            // assign a printer
            PrintWriter writer = new PrintWriter(fileOne);

            // write down data
            writer.println(data);

            // free resources
            writer.flush();
            writer.close();

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

    public String get(){
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = Files.newBufferedReader(Paths.get("textSack.txt"))) {

            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        return sb.toString();
        //System.out.println(sb);
    }

    public void view(){
        System.out.println(this.get());
    }

}
