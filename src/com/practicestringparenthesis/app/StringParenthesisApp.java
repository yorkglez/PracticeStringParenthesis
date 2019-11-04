package com.practicestringparenthesis.app;

import java.util.Scanner;
import java.util.Stack;

import com.paacticestringparenthesis.model.OperationsStack;

public class StringParenthesisApp
{
    public static void main(String[] args)
    {
        //Variables declaration
        String cad = "";
        char arrayCad[];
        boolean result = false;

        //Object declaration
        Scanner in = new Scanner(System.in);

        //Input cad
//        System.out.print("Write string: ");
//        cad = in.next();

        cad = "[{}(Hello) [] [ World](!!)] {}[()]";

        //Replace letters
        //cad = cad.replaceAll("[^\\(){}]", "");

        //Replace spaces
        cad = cad.replace(" ","");

        //Convert cad to char
        arrayCad = cad.toCharArray();

        //Object declaration
        OperationsStack operationsStack = new OperationsStack();
        operationsStack.setArrayCad(arrayCad);

        //Get result
        result = operationsStack.ValidCad();

        //Output result
        System.out.println(result);
    }
}
