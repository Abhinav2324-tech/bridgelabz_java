package com.bridgelabz.java_stack_queue_hashmap;

public class BalancedParentheses {
    public boolean isValid(String str){
        char[] stack=new char[str.length()];
        int top=-1;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                top++;
                stack[top]=ch;
            }
            else if(ch==')' || ch==']' || ch=='}'){
                if(top==-1){
                    System.out.println("Stack is empty");
                    return false;
                }
                char opening=stack[top];
                top--;
                if(ch==')' && opening != '('){
                    return false;
                }
                if(ch==']' && opening!='['){
                    return false;
                }
                if(ch=='}' && opening !='{'){
                    return false;
                }
            }
        }
        return top==-1;
    }

    public static void main(String[] args) {
        BalancedParentheses obj=new BalancedParentheses();
        String str="([{}])";
        if(obj.isValid(str)){
            System.out.println("Valid Parenthesis");
        }
        else {
            System.out.println("Invalid parenthesis");
        }
    }
}
