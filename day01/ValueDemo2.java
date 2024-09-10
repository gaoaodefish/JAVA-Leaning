public class ValueDemo2{
		//叫做main方法，表示程序的主入口，格式固定
        public static void main(String[] args){
			//目的：熟悉制表符的用法
			
			System.out.println("name" + "age");
			System.out.println("tom" + "23");
			
			//制表符在不足8位是补满8位
			//例：name四位，后面补四个空格
			System.out.println("name" + '\t' + "age");
			System.out.println("tom" + '\t' + "23");
        }
}