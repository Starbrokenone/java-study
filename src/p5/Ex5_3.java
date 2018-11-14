package p5;

public class Ex5_3 {
    public static void main(String[] args){
        Student s1,s2;
        s1 = new Student();
        s2 = new Student();
        s1.setInfo("赵强","20100038","山西太原");
        s2.setInfo(23.5f,"201000089");
        s2.getInfo(23.5f);
        s1.getInfo("山西太原");
    }
}
class Student{
    public  String name;
    public String studentID;
    private String address;
    public String mobilePhone;
    protected String major;
    private float gpa;
    public void register(){

    }

    public float getgpa() {
        return gpa;
    }

    public void setGpa() {
        gpa = 23.5f;
    }
    public void setInfo(String n,String ID){
        name = n;
        studentID = ID;
    }
    public void setInfo(String n,String ID,String add){
        name = n;
        studentID = ID;
        address = add;
    }
    public void setInfo(float g,String ID){
        gpa = g;
        studentID = ID;
    }
    public void getInfo(float g){
        System.out.println("学号："+studentID+"\t平均成绩点数:"+g);
    }
    public void getInfo(String add){
        System.out.println("学号："+studentID+"\t姓名:"+name+"\t地址"+add);
    }
}
