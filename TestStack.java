import java.util.Scanner;

/**
 * Created by Arabic on 25/01/22.
 */
public class TestStack {
    public static void main(String[] args) {
        ArrayStack<String> myStack= new ArrayStack<>(5);
        Scanner in= new Scanner(System.in);
        System.out.println("is the stack empty?"+myStack.isEmpty());
        System.out.println("input elements");
        for (int i = 0; i <5 ; i++) {
            myStack.push(in.next());
            System.out.println("top= "+myStack.top());
            System.out.println("size="+myStack.size() );
            System.out.println("is the stack empty?"+myStack.isEmpty());

        }
        for (int i = 0; i <6 ; i++) {
            System.out.println("deleted="+myStack.pop());;
            System.out.println("top afrer delete= "+myStack.top());
            System.out.println("size afrer delete="+myStack.size() );
            System.out.println("is the stack empty?"+myStack.isEmpty());

        }
    }
}
