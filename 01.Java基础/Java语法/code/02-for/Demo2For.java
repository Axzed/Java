public class Demo2For {
	/*
		需求：在控制台输出1-5和5-1的数据
		
		分析:
			
			1. 从1开始到5结束，设置初始化从1开始
			2. 设置判断条件为没有到5的时候继续执行，执行到超过5程序结束
			3. 从1到5，每次增加1，设置条件控制每次+1
			4. 将反复进行的事情写入循环结构内部，打印对应数据
			
		注意:
			1. 循环中, 控制循环的变量, 可以作为逻辑组织到循环体中进行使用的.
			
			2. 循环的 条件控制语句, 不要局限的认为只能是++
	*/
	public static void main(String[] args) {
		// 1. 从1开始到5结束，设置初始化从1开始
		// 2. 设置判断条件为没有到5的时候继续执行，执行到超过5程序结束
		// 3. 从1到5，每次增加1，设置条件控制每次+1
		for(int i = 1; i <= 5; i++){
			// 4. 将反复进行的事情写入循环结构内部，打印对应数据
			System.out.println(i);		// 1 2 3
		}
		
		System.out.println("--------------");
		
		for(int i = 5; i >= 1; i--){
			System.out.println(i);		// 5 4 3..
		}
	}
}