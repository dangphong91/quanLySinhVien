public class SinhVien {
    private int id;
    private String name;
    private int old;
    private String gender;

    public SinhVien(int code, String name, int old, String gender) {
        this.id = code;
        this.name = name;
        this.old = old;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + old + "," + gender + "\n";
    }
}
