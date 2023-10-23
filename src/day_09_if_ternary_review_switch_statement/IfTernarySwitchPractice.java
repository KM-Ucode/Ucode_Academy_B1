package day_09_if_ternary_review_switch_statement;

import java.sql.SQLOutput;

public class IfTernarySwitchPractice {

    public static void main(String[] args) {


        // HTTP Protocol/API Status Code
        // 200-> OK
        // 201 -> Created
        // 202 -> Accepted
        // 301 -> Moved Permanently
        // 303 -> See Other

        // Write a program that print/displays the message based on status code

        int statusCode = 200;
        String message = "";

        switch (statusCode){
            case 200:
                message += "OK";
                break;

            case 201:
                message += "Created";
                break;

            case 202:
                message += "Accepted";
                break;

            case 301:
                message += "Move Permanently";
                break;

            case 303:
                message += "See Other";
                
            default: 
                message += "Invalid Status Code";
                
        }
        System.out.println(message);

        System.out.println("==============");
        
        String msg1 = "";
        
        if (statusCode == 200){
            msg1 += "OK";
        } else if (statusCode == 201) {
            msg1 += "";

                    }
        }




    }

