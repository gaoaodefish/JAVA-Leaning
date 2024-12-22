import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Math.E);
//        System.out.println(Math.PI);
//        System.out.println(Math.abs(-5));//绝对值
//        double kaifeng = Math.sqrt(4);//开方
//        System.out.println(kaifeng);
//        System.out.println(Math.cbrt(8));//开立方
//        System.out.println(Math.hypot(3,4));//勾股定理，求斜边
//        System.out.println(Math.round(8.26));//四舍五入
//        System.out.println(Math.log10(100));//求对数
//        System.out.println(Math.pow(2,3));//幂

        String ID = "2330201146";//账号位置可修改
        String Password = "146";//密码位置可修改

        boolean Start = true;
        int i,j;
        int row = 5;//数组行
        int col = 4;//数组列
        char[][] arr =
                {
                        {'%', 'E', 'C', '/'},
                        {'7', '8', '9', '*'},
                        {'4', '5', '6', '-'},
                        {'1', '2', '3', '+'},
                        {'#', '0', '.', '='},
                };
        Scanner NUM = new Scanner(System.in);
        double Num1;
        double Num2 = 0;
        String symbol;
        boolean def;

        do
        {
            //输入账号密码
            System.out.println("请输入账号(不想玩请输入：exit):");
            Scanner num2 = new Scanner(System.in);
            String input_ID = num2.nextLine();
            if(input_ID.equals("exit"))break;

            System.out.println("请输入密码(不想玩请输入：exit):");
            String input_password = num2.nextLine();
            if(input_password.equals("exit"))break;

            //判断是否正确
            if(input_ID.equals(ID) && input_password.equals(Password))
            {
                System.out.println();
                System.out.println("主人您好，这是独属于您的计算机");
                System.out.println();
                do
                {
                    def = true;
                    //打印可视化界面
                    for(i = 0; i < row; i++)
                    {
                        for(j = 0; j < col; j++)
                        {
                            System.out.printf("  %c  ", arr[i][j]);
                        }
                        System.out.println();
                    }

                    try {
                        //输入第一个数字
                        System.out.println("Please input a number:");
                        Num1 = NUM.nextFloat();

                        //输入符号
                        System.out.println("Enter a symbol：（+, -, *, /, abs, sqrt, cbrt, log10）");
                        Scanner num1 = new Scanner(System.in);
                        symbol = num1.nextLine();

                        //输入第二个数字
                        if(symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/"))
                        {
                            System.out.println("Please input a number:");
                            Num2 = NUM.nextFloat();
                        }

                        //计算过程
                        switch(symbol)
                        {

                            case "+":
                                Num1= Num1 + Num2;
                                break;
                            case "-":
                                Num1 = Num1 - Num2;
                                break;
                            case "*":
                                Num1 = Num1 * Num2;
                                break;
                            case "/":
                                Num1 = Num1 / Num2;
                                break;
                            case "sqrt":
                                Num1 = Math.sqrt(Num1);//开方
                                break;
                            case "abs":
                                Num1 = Math.abs(Num1);//绝对值
                                break;
                            case "cbrt":
                                Num1 = Math.cbrt(Num1);//开立方
                            case "log10":
                                Num1 = Math.log10(Num1);//求 10 的对数
                            default:
                                def = false;
                                break;
                        }
                        if(def)System.out.println("value = " + Num1);
                        else {
                            System.out.println("error");
                            System.out.println();
                            continue;
                        }

                        Scanner t = new Scanner(System.in);
                        //判断是否要计算
                        while(true) {
                            System.out.println("Whether to continue the calculation:(Y/N)");
                            char str = t.next().charAt(0);
                            if (str == 'y' || str == 'Y') {Start = true;break;}
                            else if (str == 'n' || str == 'N') {Start = false;break;}
                            else System.out.println("Error");
                        }
                    }
                    catch (Exception e)
                    {
                        System.out.println("error");
                    }
                }while(Start);
            }else System.out.println("账号或密码错误请重新输入");
        }while(true);
        System.out.println("已退出");
    }

/*//    public static int countString(String arr){
//        int count = 0;
//        int i;
//        for(i = 0; i < arr.length(); i++)
//        {
//            if(arr.charAt(i) == '朋' && arr.charAt(i+1) == '友')
//            {
//                count++;
//            }
//        }
//        return count;
//    }*/
}