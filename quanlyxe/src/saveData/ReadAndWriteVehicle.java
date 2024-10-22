package saveData;

import model.Vehicle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteVehicle {
    private File file = new File("database/Vehicle.csv");
    public void WriteData(List<Vehicle> list) {
        try {
            // Kiểm tra và tạo thư mục nếu không tồn tại
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }

            StringBuilder data = new StringBuilder();
            for (Vehicle item : list) {
                data.append(item.getName()).append(", ")
                        .append(item.getPhoneNumber()).append(", ")
                        .append(item.getLicensePlate()).append(", ")
                        .append(item.getStatus()).append("\n");
            }

            FileWriter fileWriter = new FileWriter(this.file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi vào tệp: " + e.getMessage());
        }
    }

    public List<Vehicle> ReadData() {
        List<Vehicle> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(this.file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(", ");
                if (data.length == 4) {
                    Vehicle employee = new Vehicle(data[0], data[1], data[2], data[3]); // Cập nhật thứ tự
                    list.add(employee);
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Lỗi đọc từ tệp: " + e.getMessage());
        }
        return list;
    }
}
