package Bai_Tap.ss11_dsa_stack_queue.dao_nguoc_phan_tu_dung_stack;

import java.util.Stack;

public class StackRong {
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int element : array) {
            stack.push(element);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Mảng ban đầu:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        reverseArray(array);

        System.out.println("\nMảng sau khi đảo ngược:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
