package hw1;

public class Homework2 {
	public static void main(String[] args) {
/////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("==========99乘法表:for+while迴圈==========");
		
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		} 
/////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("==========99乘法表:for+do while迴圈==========");

		for (int i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
		} 
/////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("==========99乘法表:while+do while迴圈==========");

		int i = 1;
		while (i <= 9) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			i++;
			System.out.println();
		} 
/////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("==========請設計一隻Java程式，計算1～1000的偶數和==========");
		
		int a = 0;
		for (int b = 2; b <=1000; b +=2) {
			a+=b;
		}
		System.out.println(a);
/////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("==========請設計一隻Java程式，計算1～10的連乘積(用for迴圈)==========");
		
		int c = 1;
		for (int d = 2; d <=10; d++) {
			c*=d;
		}
		System.out.println(c);
/////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("==========請設計一隻Java程式，計算1～10的連乘積(用while迴圈)==========");
		
		int e = 1,f = 2;
		while(f<=10) {
			e*=f;
			f++;
		}
		System.out.println(e);
/////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("==========請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100==========");
		
		int g = 0;
		for(int h =1; h <=19; h+=2) {
			g+=h;
			System.out.print(g+" ");
		}
/////////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("==========阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，\r\n"
				+ "輸出結果為阿文可以選擇的數字有哪些？總共有幾個？==========");
		
		int count = 0;
		for(int k = 1;k <40; k++) {
			if(k==4) {
			} else if(k==14) {
			} else if(k==24) {
			} else if(k==34) {
			} else {
			count++;	
			System.out.print(k+" ");
			}
		}	
		System.out.println();
		System.out.println("總計"+count+"個數字");
		
/////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println();
		System.out.println("===============分隔線===============");
		
		for(int l = 10; l>=1; l--) {
			for(int m = 1; m<=l; m++) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
/////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println("===============分隔線===============");
			
		for(int o = 1; o<=6; o++) {
			for(int p = 1; p<=o; p++) {
				if(o==1) {
				System.out.print("A");
				} else if(o==2) {
				System.out.print("B");	
				} else if(o==3) {
				System.out.print("C");
				} else if(o==4) {
				System.out.print("D");
				} else if(o==5) {
				System.out.print("E");
				} else {
				System.out.print("F");
				}
			}
			System.out.println();
		}
	}
}
