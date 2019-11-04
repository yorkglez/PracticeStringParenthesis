package com.paacticestringparenthesis.model;

import java.util.Stack;
public class OperationsStack
{
    //Attribute declaration
    private  char arrayCad[];

    //Constructors
    public OperationsStack(){}

    public OperationsStack(char arrayCad[])
    {
        this.arrayCad = arrayCad;
    }

    //Validate balanced () [] {}
    public boolean ValidCad()
    {
        //Variables declaration
        boolean isValid = true;
        int count = 0;

        //Object declaration
        Stack stack = new Stack();

        //Process
        while(count < arrayCad.length)
        {
            //Validate open chars
           if(arrayCad[count] == '(' || arrayCad[count] == '[' || arrayCad[count] == '{')
           {
               //Push chars to stack
               stack.push(arrayCad[count]);
           }

           //Validate close chars
           //If the stack is empty, break while and return false
            else if(stack.isEmpty())
           {
               isValid = false;
               break;
           }

           //Validate close chars
           else if((stack.peek().equals('(') && arrayCad[count] == ')')
                   || (stack.peek().equals('[') && arrayCad[count] == ']')
                   || (stack.peek().equals('{') && arrayCad[count] == '}'))
           {
               //Pop char of the stack
               stack.pop();
           }
            count++;
        }

        //Return result
        if(!stack.isEmpty())
        {
            isValid = false;
        }

        return isValid;
    }

    //Getters and setters
    public char[] getArrayCad() {
        return arrayCad;
    }

    public void setArrayCad(char[] arrayCad) {
        this.arrayCad = arrayCad;
    }
}
