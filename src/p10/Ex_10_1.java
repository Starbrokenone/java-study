package p10;
import java.lang.*; 
public class Ex_10_1 extends Thread {
//创建一个类继承Thread
	String studentName;
	public Ex_10_1(String studentName) {
		System.out.println(studentName+"申请访问服务器");
		this.studentName=studentName;
	}
	public void run() {
		//用在此线程中执行的代码覆盖thread类中的润方法
		for(int i=0;i<5;i++) {
			System.out.println("当前的服务对象是"+studentName+"同学");
			try {
				Thread.sleep((int)(Math.random()*2000));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	public static void main(String[] args) {
		Ex_10_1 t1 = new Ex_10_1("邸志玲");
		Ex_10_1 t2 = new Ex_10_1("王笑容");
		t1.start();
		t2.start();
		
				
	}
	
}