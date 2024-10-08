public class VariableDemo2{
	//主入口
	public static void main(String[] args){
		//1.变量的基本用法
		//定义变量，在进行输出
		int a = 10;
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		
		//2.变量参与计算
		int b = 30;
		int c = 20;
		System.out.println(b + c);
		
		//3.修改变量记录的值
		a = 50;
		System.out.println(a);
		
		System.out.println("---------------------------");//分割线
		//注意事项
		//一条语句可以定义多个变量
		int d = 100, e = 200, f = 300;
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		System.out.println("---------------------------");//分割线
		//变量定义时必须付初值
		int g;
		g = 400;
		//建议：定义时顺手付初值上面写的有点怪
		System.out.println(g);
	}
}