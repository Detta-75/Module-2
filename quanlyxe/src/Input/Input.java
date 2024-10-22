package Input;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    public boolean checkPhoneNumber(String phoneNumber) {
        String phoneNumberRegex = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";
        return Pattern.matches(phoneNumberRegex, phoneNumber);
    }

    public boolean checkLicensePlate(String licensePlate) {
        String licensePlateRegex = "^\\d{2}[A-Z]-\\d{3}\\.\\d{2}$";
        return Pattern.matches(licensePlateRegex, licensePlate);
    }


    public String getCheckLicensePlateEnter(String licensePlate) {;
        boolean isValid = false;

        while (!isValid) {
            if (!checkLicensePlate(licensePlate)) {
                System.out.println("Biển số xe không hợp lệ. Vui lòng nhập đúng định dạng (VD: 76A-123.45).");
                System.out.println("Bạn có muốn nhập lại không:(Y/N)");
                String retry = scanner.nextLine();
                if (retry.equalsIgnoreCase("n")) {
                    System.out.println("Hủy thao tác.");
                    return null;
                } else if (retry.equalsIgnoreCase("y")) {
                    System.out.println("Mời nhập lại biển số: ");
                    licensePlate = scanner.nextLine();
                }
            } else {
                isValid = true;
            }
        }
        return licensePlate;
    }

    public String getCheckIDEnter(String ID) {
        boolean isValid = false;

        while (!isValid) {
            if (!checkID(ID)) {
                System.out.println("ID không hợp lệ. Vui lòng nhập lại (VD: A-12)");
                System.out.println("Bạn có muốn nhập lại lai không:(Y/N)");
                String retry = scanner.nextLine();
                if (retry.equalsIgnoreCase("n")) {
                    System.out.println("Hủy thao tác.");
                    return null;
                } else if (retry.equalsIgnoreCase("y")) {
                    System.out.println("Mời nhập lại ID: ");
                    ID = scanner.nextLine();
                }
            } else {
                isValid = true;
            }
        }
        return ID;
    }

    public boolean checkID(String ID) {
        String IDRegex = "^[A-Z]-\\d{2}$";
        return Pattern.matches(IDRegex,ID);
    }


    public String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        String[] words = input.split(" ");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                capitalized.append(capitalizedWord).append(" ");
            }
        }

        return capitalized.toString().trim();
    }
}
