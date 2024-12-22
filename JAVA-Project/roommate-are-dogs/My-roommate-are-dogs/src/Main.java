public class Main {
    public static void main(String[] args) {
//        System.out.println("类的示例");
//        Dog xq = new Dog();
//        xq.name = "小虫";
//        xq.age = 18;
//        xq.Bark();
//        xq.Eat();
        System.out.println("*********************************************");
        System.out.println("********李帅博 电子232 2330201146 *************");
        System.out.println("*********************************************");

        System.out.printf("\n");
        System.out.println("手机类的示例");
        System.out.printf("\n");

        Cellphone hw = new Cellphone();
        hw.Name = "华为";
        hw.Edition = "国行";
        hw.Resolution = "2500*1600";
        hw.Model = "Mate-60";
        hw.name();
        hw.edition();
        hw.model();
        hw.resolution();
    }
}

class Dog{
    String name;
    int age;
    String color;

    public void Bark(){
        System.out.println("我是" + name + "今年刚满" + age + "岁" + "，我喜欢\"汪汪\"叫");
    }

    public void Eat(){
        System.out.println("我是" + name + "今年刚满" + age + "岁" + "，我喜欢吃屎");
    }
}

class Cellphone{
    String Name;
    String Model;
    String Edition;
    String Resolution;

    public void name(){
        System.out.println("品牌：" + Name);
    }

    public void model(){
        System.out.println("型号：" + Model);
    }

    public void edition(){
        System.out.println("版本：" + Edition);
    }

    public void resolution (){
        System.out.println("分辨率：" + Resolution);
    }
}