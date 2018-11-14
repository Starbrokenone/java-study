package p5;
//使用this区分成员变量和局部变量
public class Ex5_6{
    int x = 188,y;
    public static void main(String[] args){
        Ex5_6 e = new Ex5_6();
        e.f();
    }
    void f(){
        int x = 3;
        y = x;//y得到的值是3，而非成员变量x的值188
        System.out.println("y = "+y);
        y = this.x;
        System.out.println("y = "+y);
    }
}

