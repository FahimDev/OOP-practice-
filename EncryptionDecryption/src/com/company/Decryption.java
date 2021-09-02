package com.company;

public class Decryption {
    String encryptedText = "Mi$2i$2ip2i.^vi$it^to^going^am^I^month^n3xt^&^Chit2agong^from^Fahim^am^I^World!^H3l2o^";

    Decryption(){

    }

    public String  mechanism(){
        Database db = new Database();
        this.encryptedText = db.get();
        StringBuilder sb = new StringBuilder();
        sb.append(this.encryptedText);

        for (int i = 0; i < this.encryptedText.length(); i++){
            //DECODER
            if(sb.charAt(i) == '^'){
                sb.setCharAt(i,' ');
            }

            if(sb.charAt(i) == '$'){
                if(i > 0 && sb.charAt(i-1) == ' '){
                    sb.setCharAt(i,'S');
                }else{
                    sb.setCharAt(i,'s');
                }
            }

            if(sb.charAt(i) == '3'){
                if(i > 0 && sb.charAt(i-1) == ' '){
                    sb.setCharAt(i,'E');
                }else{
                    sb.setCharAt(i,'e');
                }
            }

            String temp = Character.toString(sb.charAt(i));
            if(temp.matches("\\d+")){
                char tempChar = sb.charAt(i-1);

                sb.setCharAt(i,tempChar);
            }

        }

        this.encryptedText = sb.toString();

        String correctOrder = "";
        String[] convert = this.encryptedText.split(" ");

        for(int i = convert.length-1 ; i >= 0; i--){
            correctOrder += convert[i]+ " ";
        }

        return correctOrder;
    }

    public void showInfo(){
        System.out.println("---->Encrypted text has been Decrypted into:");
        System.out.println(this.mechanism());

    }
}
