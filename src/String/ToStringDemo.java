package String;

public class ToStringDemo {
    int rollNum;
    String Name;
    String eMail;
    int addNum;

    public ToStringDemo(int rollNum, String name, String eMail, int addNum) {
        this.rollNum = rollNum;
        Name = name;
        this.eMail = eMail;
        this.addNum = addNum;
    }

    @Override
    public String toString() {
        return "Student Detail {" +
                "rollNum=" + rollNum +
                ", Name='" + Name + '\'' +
                ", eMail='" + eMail + '\'' +
                ", addNum=" + addNum +
                '}';
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getAddNum() {
        return addNum;
    }

    public void setAddNum(int addNum) {
        this.addNum = addNum;
    }
}
