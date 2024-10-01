package Bai_Tap.ss11_dsa_stack_queue.Lop_LinkedList_trong_thu_vien_java;

public class GenericStackClient {
    private static void strackOfFIString() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Nam");
        stack.push("Bon");
        stack.push("Ba");
        stack.push("Hai");
        stack.push("Mot");
        System.out.println("1.1 Tong stack: " + stack.size());
        System.out.println("1.2 Cac phan tu cua stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Kich thuoc stack sau khi giam: " + stack.size());
    }

    private static void strackOfFIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Tong stack: " + stack.size());
        System.out.println("2.2 Cac phan tu cua stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n2.3. Kich thuoc stack sau khi giam: " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        strackOfFIntegers();
        System.out.println("\n2. Stack of String");
        strackOfFIString();
    }
}
