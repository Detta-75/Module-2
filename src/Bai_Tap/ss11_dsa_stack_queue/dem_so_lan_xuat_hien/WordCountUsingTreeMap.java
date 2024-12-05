package Bai_Tap.ss11_dsa_stack_queue.dem_so_lan_xuat_hien;

import java.util.Map;
import java.util.TreeMap;

public class WordCountUsingTreeMap {
    public static void countWords(String input) {
        TreeMap<String, Integer> wordMap = new TreeMap<>();

        String[] words = input.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println("Từ: " + entry.getKey() + " - Số lần xuất hiện: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String input = "Hello world! Hello everyone. Welcome to the world of Java.";
        System.out.println("Chuỗi đầu vào:");
        System.out.println(input);

        System.out.println("\nKết quả đếm từ:");
        countWords(input);
    }
}
