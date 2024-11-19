package Bai_Tap.ss19_string_vs_regex;

public class RegularExpressionLopHoc {
    public static boolean isValidClassName(String className) {
        String regex = "^[CAP]\\d{4}[GHIK]$";
        return className.matches(regex);
    }

    public static void main(String[] args) {
        String[] classNames= {"C0223G", "A0323K", "M0318G", "P0323A"};
        for (String name : classNames) {
            if (isValidClassName(name)) {
                System.out.println(name + " la ten hop le.");
            } else {
                System.out.println(name + " khong hop le");
            }
        }
    }
}
