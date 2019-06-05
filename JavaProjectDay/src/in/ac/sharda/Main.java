package in.ac.sharda;

public class Main {

	public static void main(String[] args) {
		Main m=new Main();
		int res=m.sum(2,3);
		System.out.println(res);
		String result=m.sum("khushi","snigdha");
		System.out.println(result);
	}
	public int sum(int a,int b) {
		return a+b;
		
	}
	public String sum(String a,String b) {
		return a+"\n"+b;
	}	
		

	}


