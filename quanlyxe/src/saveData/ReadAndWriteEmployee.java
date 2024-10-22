package saveData;

import model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
    private File file = new File("database/Employee.csv");
    public void WriteData(List<Employee> list) {
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }

            StringBuilder data = new StringBuilder();
            for (Employee employee : list) {
                data.append(employee.getId()).append(", ")
                        .append(employee.getName()).append(", ")
                        .append(employee.getPhoneNumber()).append(", ")
                        .append(employee.getShift()).append("\n");
            }

            FileWriter fileWriter = new FileWriter(this.file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi vào tệp: " + e.getMessage());
        }
    }

    public List<Employee> ReadData() {
        List<Employee> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(this.file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(", ");
                if (data.length == 4) {
                    Employee employee = new Employee(data[0], data[1], data[2], data[3]);
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
