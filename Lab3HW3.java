/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.hw3;

import java.util.Stack;
/**
 *
 * @author User
 */
public class Lab3HW3 {

    private static Stack<Integer> stackPush(Stack<Integer> stack1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @param args the command line arguments
     */
    public class Transfer {
        /**
         *
         * @param stack
         * @return
         */
        public static Stack<Integer> stackPush(Stack <Integer> stack1)
            
    {
        for(int i = 0; i < 5; i++){
            Integer push = (Integer) stack.push(i);
            System.out.println(push);
        }
      return stack1;

        }
            

    }
    public static void pop(Stack<Integer> stack){
        for(int i = 0; i < 5; i++){
            Integer pop = (Integer) stack.pop();
            System.out.println(pop);
        }
    }
    public static void peek(Stack<Integer> stack){
        Integer peek = (Integer) stack.peek();
        System.out.println("Top of the element is: " + peek);
    }
    public static void search(Stack<Integer> stack, int element){
        System.out.println("Element searched is: ");
        Integer search = (Integer) stack.search(element);
        if(element == -1){
            System.out.println("Stack is empty.");
        }
        else{
            System.out.println("Element is: " + search);
        }
    }
    public static Stack<Integer> transfer(Stack<Integer> stack1, Stack<Integer> stack2){
        stack2 = stackPush(stack1);
        System.out.println("Stack transfered successfully: "+ stack2);
        return stack2;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
         Stack<Integer> stack1 = new Stack<>();
        
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> finalStack = transfer(stack1, stack2);
        

    }
}
