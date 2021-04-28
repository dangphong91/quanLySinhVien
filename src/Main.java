import java.io.*;

public class Main {
    public static void main(String[] args) {
        StudentManager list = new StudentManager();
        File file = new File("D:\\bai tap\\SV.csv");
        StudentFileCsv test = new StudentFileCsv(file, list);
        try {
            test.readCSV().printList();
//            SinhVien huy = new SinhVien(1717, "Huy", 25, "Nam");
//            list.add(huy);
//            test.writeCSV();
//            SinhVien chuong = new SinhVien(1818, "Chuong", 25, "Nam");
//            System.out.println(list.remove(1));
//            SinhVien thienEdit = new SinhVien(1616, "Thien", 28, "Nam");
//            list.setSV(6, thienEdit);
//            test.writeCSV();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
