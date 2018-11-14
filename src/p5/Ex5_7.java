package p5;
//使用this返回实例对象的引用
public class Ex5_7 {
    public static  void  main(String args[]){
        Dog tom = new Dog();
        System.out.println(tom.height+"\t"+tom.age);
        tom = tom.grow();
        System.out.println(tom.height+"\t"+tom.age);
    }
}
class Dog{
    int age;
    float height;
    public Dog(){
        age = 1;
        height = 10;
    }
    public Dog grow(){
        height = height+10;
        age++;
        return this;
    }
}