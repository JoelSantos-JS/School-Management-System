package entities;


public class Student {

    private int id;
    private String name;
    private int grade;
    private int fesspaid;
    private int feesTotal;

    public Student() {

    }

    public Student(int id, String name, int grade) {
        fesspaid = 0;
        feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
       
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFesspaid() {
        return fesspaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void pay(int fesspaid) {
        this.fesspaid += fesspaid;
        School school ;
        School.updateTotalMoneyEarned(this.getFesspaid());
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }


    public void updateFeesPaid(int fees) {
        fesspaid = fesspaid + fees;
    }

    

    
}
