import java.util.*;

public class StudentManager {
    private HashMap<Integer, SinhVien> listSV;

    public StudentManager() {
        this.listSV = new HashMap<>();
    }

    public void add(SinhVien sv) {
        listSV.put(listSV.size()+1, sv);
    }

    public void setSV(int id, SinhVien sv) {
        for (Map.Entry<Integer, SinhVien> entry : listSV.entrySet()) {
            if (entry.getKey() == id) {
                entry.setValue(sv);
            }
        }
    }

    public boolean remove(int id) {
        return listSV.remove(id) != null ? true : false;
    }

    public void printList() {
        for (Map.Entry<Integer, SinhVien> entry : listSV.entrySet())
            System.out.print(entry.getKey() + " - " + entry.getValue().toString());
    }

    public ArrayList<String> read() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<Integer, SinhVien> entry : listSV.entrySet())
        arrayList.add(entry.getValue().toString());
        return arrayList;
    }
}
