package Bai_Tap.ss19_string_vs_regex;

public class RegularExpressionSoDienThoai {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Sử dụng biểu thức chính quy để kiểm tra tính hợp lệ
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        return phoneNumber.matches(regex);
    }

    public static void main(String[] args) {
        // Kiểm thử một số số điện thoại
        String[] phoneNumbers = {"(84)-(0978489648)", "(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};
        for (String number : phoneNumbers) {
            if (isValidPhoneNumber(number)) {
                System.out.println(number + " là số điện thoại hợp lệ.");
            } else {
                System.out.println(number + " không phải là số điện thoại hợp lệ.");
            }
        }
    }
}
