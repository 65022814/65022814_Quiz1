public class main {
    public static void main(String[] args) {
        student me = new student("Wave","65022814", 2020, 2.5);
        me.showDetails();
        me.updateAdmissionYear(2023);
        me.updateGPA(4);
        me.showDetails();

    }
}

class student {
    private String Name;
    private String ID;
    private int addmissionYear;
    private double GPA;

    student(String Name, String ID, int addmissionYear, double GPA) {
        this.Name = Name;
        this.ID = ID;
        this.addmissionYear = addmissionYear;
        this.GPA = GPA;
    }
    public String getName() {
        return Name;
    }
    
    public void updateName(String name) {
        this.Name = Name;
    }
    public String getID() {
        return ID;
    }
    
    public void updateID(String ID) {
        this.ID = ID;
    }
    
    public int getaddmissionYear() {
        return addmissionYear;
    }
    
    public void updateAdmissionYear(int addmissionYear) {
        this.addmissionYear = addmissionYear;
    }
    
    public double getGPA() {
        return GPA;
    }
    
    public void updateGPA(double GPA) {
        this.GPA = GPA;
    }

     public void showDetails() {
        System.out.println("Student ID: " + ID);
        System.out.println("Name: " + Name);
        System.out.println("addmission Year: " + addmissionYear);
        System.out.println("GPA: " + GPA);
     }
}