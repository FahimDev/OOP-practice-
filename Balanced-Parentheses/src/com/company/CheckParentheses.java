package com.company;

import java.util.Stack;

public class CheckParentheses {

    private String given;
    private Stack<Character> jar;

    CheckParentheses(String input){
        this.given = input;
        this.jar = new Stack<>();
    }

    public boolean operation(){
        System.out.println("Given: "+ given);
        for (int i =0; i < this.given.length();i++){
            //System.out.println("Single: "+ this.given.charAt(i));
            if(this.given.charAt(i) == '(' || this.given.charAt(i) == '{' || this.given.charAt(i) == '['){
                this.jar.push(this.given.charAt(i));
                //continue;
            }

            if(this.jar.isEmpty()){
                return false;
            }

            char popped;

            switch (this.given.charAt(i)){
                case ')':
                    //System.out.println("FLAG1");
                    popped = this.jar.pop();
                    if(popped == '{' || popped == '['){
                        return false;
                    }
                break;

                case '}':
                    //System.out.println("FLAG2");
                    popped = this.jar.pop();
                    if(popped == '(' || popped == '['){
                        return false;
                    }
                break;

                case ']':
                    //System.out.println("FLAG3");
                    popped = this.jar.pop();
                    if(popped == '{' || popped == '('){
                        return false;
                    }
                break;

            }

        }

        return true;
    }

}
