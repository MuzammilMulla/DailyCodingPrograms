package stack;

import java.util.Stack;

public class PreviousSmallerElement {
    public static void main(String[] args) {

        int arr[] = {43, 12, 436, 56, 123, 6456, 242};  // output--> -1, -1,  12,  12,  56, 123, 123

        Stack <Integer> stack = new Stack<>();

        for (int i = 0; i <arr.length ; i++) {
            if(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                System.out.print(-1+ " ");
            }else{
                System.out.print(stack.peek()+ " ");
            }
            stack.push(arr[i]);
        }
    }
}


