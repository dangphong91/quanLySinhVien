import com.sun.net.httpserver.Authenticator;

import java.io.*;
import java.util.ArrayList;

public class StudentFileCsv {
    File file;
    StudentManager list;

    public StudentFileCsv(File path, StudentManager list) {
        this.file = path;
        this.list = list;
    }

    public StudentManager readCSV() throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            String[] st = line.split(",");
            SinhVien sv = new SinhVien(Integer.parseInt(st[0]), st[1], Integer.parseInt(st[2]), st[3]);
            list.add(sv);
        }
        return list;
    }

    public void writeCSV() throws IOException {
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        ArrayList<String> svs = list.read();
        for (String sv:
             svs) {
            bw.append(sv);
        }
        bw.close();
        fw.close();
        System.out.println("Success.");
    }
}
