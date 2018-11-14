package p10;

public class Ex10_2{
	CardAccount  cardaccount;
	Thread messConsume,schoolingConsume;
	Thread mobileConsume,libraryConsume,marketConsume;
	Ex10_2(){
		cardaccount = new CardAccount();
		messConsume = new Thread(cardaccount);
		schoolingConsume = new Thread(cardaccount);
		mobileConsume = new Thread(cardaccount);
		libraryConsume = new Thread(cardaccount);
		marketConsume = new Thread(cardaccount);
		messConsume.setName("messConsume");
		schoolingConsume.setName("schoolingConsume");
		mobileConsume.setName("mobileConsume");
		marketConsume.setName("marketConsume");
		libraryConsume.setName("libraryConsume");
	}
	public static void main(String[] args) {
	Ex10_2 ex = new Ex10_2();
	ex.caserun();
	}
	public void caserun() {
		try {
			messConsume.start();
			libraryConsume.start();
			marketConsume.start();
			mobileConsume.start();
			schoolingConsume.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
class CardAccount implements Runnable{
	int fund = 1000;
	String accessType;
	public void setFund(int num) {
		fund = num;
	}
	
	public synchronized void accountAccess(int num,boolean k) {
		for(int i = 0;i<3;i++) {
			accessType = Thread.currentThread().getName();
			if(k)
				fund+=num;
			else {
				fund-=num;
			}
			try {
				System.out.println("��ǰ�߳���"+accessType+",�˻�ʣ���ʽ�Ϊ"+fund+".");
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println(e.toString());	
			}
		}
	}
	public void run() {
		accessType = Thread.currentThread().getName();
		if(accessType.equals("messConsume"))
			accountAccess(5,false);
		else if(accessType.equals("schoolingConsume"))
			accountAccess(100,false);
		else if(accessType.equals("mobileConsume"))
			accountAccess(20,false);
		else if(accessType.equals("libaryConsume"))
			accountAccess(2,false);
		else if(accessType.equals("marketConsume"))
			accountAccess(6,false);
			
	}
}
	