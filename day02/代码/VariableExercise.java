public class VariableExercise{
	//主入口
	public static void main(String[] args){
		//整形变量num，表车上人数
		//开始车上没人
		int num = 0;
		
		//第一站，上一个人
		System.out.println("-------------------------------------");//分割线
		num += 1;
		System.out.println(num);
		
		//第二站，上车两个人，下车一个人
		System.out.println("-------------------------------------");//分割线
		num += 2;
		num -= 1;
		System.out.println(num);
		
		//第三站，上车两个人，下车一个人
		System.out.println("-------------------------------------");//分割线
		num += 2;
		num -= 1;
		System.out.println(num);
		
		//第四站，下车一个人
		System.out.println("-------------------------------------");//分割线
		num -= 1;
		System.out.println(num);
		
		//第五站，上车一个人
		System.out.println("-------------------------------------");//分割线
		num += 1;
		//最后人数
		System.out.println(num);
	}
}