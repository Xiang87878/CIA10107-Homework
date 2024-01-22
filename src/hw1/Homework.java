package hw1;

public class Homework {
	public static void main(String[] args) {
		// 1.請設計一隻Java程式，計算12，6這兩個數值的和與積
		int num1 = 12, num2 = 6;
		System.out.println("==================第一題");
		System.out.println("和為" + (num1 + num2));
		System.out.println("積為" + num1 * num2);

		// 2.請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
		int egg = 200, dozen = 12;
		System.out.println("==================第二題");
		System.out.print("共"+egg / dozen + "打");
		System.out.println("且剩餘" + egg % dozen + "顆");

		// 3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int total = 256559, min = 60, hour = 60, day = 24;
		System.out.println("==================第三題");
		System.out.print(total / (min * hour * day) + "天");
		System.out.print(total / (min * hour) % day + "小時");
		System.out.print(total / (min) % hour + "分");
		System.out.println(total % min + "秒");

		// 4.請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		double pi = 3.1415;
		int r = 5;
		System.out.println("==================第四題");
		System.out.println("面積為" + pi * r * r);
		System.out.println("周長為" + pi * r * 2);

		// 5.某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
		// 金加利息共有多少?
		System.out.println("==================第五題");
		double ir = 1.02;
		double ir0 = 1.0;
		int money = 1500000;
		for (int year = 1; year <= 10; year++) {
			ir0 *= ir;
		}
		System.out.println("本金加利息有" + money * ir0 + "元");

		/*
		 * 6.請寫一隻程式，利用System.out.println()印出以下三個運算式結果： 5 + 5 5 + ‘5’ 5 + “5”
		 * 並請用註解各別說明答案的產生原因
		 */
		System.out.println("==================第六題");
		System.out.println(5 + 5); 	 // 兩邊皆為整數，所以直接相加等於10。
		System.out.println(5 + '5'); // '5'在unicode裡編號為0035，且是16進位，以10進位來看就是數字53。所以5 + 53 = 58
		System.out.println(5 + "5"); // 意思為整數"5"加上右邊的"字串"5，所以看起來像55。
	}

}
