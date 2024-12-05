package Bai_Tap.SS12_javaCollectionFramework.luyentap_arraylist_linkedlist;

import java.util.*;

public class ProductManager {
    Scanner sc = new Scanner(System.in);
    ArrayList<Product> list = new ArrayList<>();

    public void display() {
        for (Product product : list) {
            product.display();
        }
    }

    public void addProduct() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập giá: ");
        double price = sc.nextDouble();
        Product product = new Product(name,id,price);
        list.add(product);
    }

    public void updateProductById() {
        System.out.println("Nhập id can sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        for (Product product : list) {
            if (product.getId() == id) {
                System.out.println("Nhập name: ");
                product.setName(sc.nextLine());
                System.out.println("Nhập giá: ");
                product.setPrice(sc.nextDouble());
                System.out.println("Cập nhật thành công.");
            }
        }
        System.out.println("Không tìm thấy");
    }

    public void deleteProductById() {
        System.out.println("Nhập Id cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(list.get(i));
                break;
            } else {
                System.out.println("Không tìm thấy để xóa");
            }
        }
    }

    public void seach() {
        System.out.println("Nhập tên cần tìm: ");
        String name = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println("Id: " + list.get(i).getId());
                System.out.println("Name: " + list.get(i).getId());
                System.out.println("Price: " + list.get(i).getPrice());
            } else {
                System.out.println("Không tìm thấy");
            }
        }
    }
}
