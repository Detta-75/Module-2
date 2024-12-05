package Bai_Tap.SS12_javaCollectionFramework.luyentap_arraylist_linkedlist;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int i;
        do {
            System.out.println("1. Hiển thị");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("0. Thoát");
            i = Integer.parseInt(scanner.nextLine());
            switch (i) {
                case 1:
                    manager.display();
                    break;
                case 2:
                    manager.addProduct();
                    break;
                case 3:
                    manager.updateProductById();
                    break;
                case 4:
                    manager.deleteProductById();
                    break;
                case 5:
                    manager.seach();
                    break;
            }
        } while (i != 0);
    }
}
