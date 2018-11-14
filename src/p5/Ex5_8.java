package p5;

public class Ex5_8 {
    public static void main(String[] args){
        Annimal a = new Annimal(10,20);
        System.out.println("新生小动物");
        System.out.println("年龄="+a.age+"\t体重="+a.weight);
    }
}
class Annimal{
    int age;
    String furCorlor;
    String eyeCorlor;
    String name;
    float weight;
    float height;
    public Annimal(float height){
        this.age = 1;
        this.height = height;
    }
    public Annimal(String name){
        this.age = 1;
        this.name = name;
    }
    public Annimal(float height,float weight){
        this(height);//A行，使用this调用其它构造函数
        this.weight = weight;
    }

}