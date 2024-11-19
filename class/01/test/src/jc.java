public class jc {
    public static void main(String[] args) {
        System.out.println("继承的使用方法");

        Phone pn = new Phone();
        pn.show();

        Huawei hw = new Huawei();
        hw.show();

        Honor hn = new Honor();
        hn.show();
        hn.sj();

        Xiaomi xm = new Xiaomi();
        xm.show();
    }
}

//这是父类
class Phone{
    String brand = " 品牌 ";//品牌
    String origin = " World ";//产地
    String slogan = " 通信改变世界 ";//口号

    void show(){
        System.out.println("手机" + brand + ",产地" + origin + ",愿景" + slogan);
    }
}

//子类
class Huawei extends Phone{
    String brand = " Huawei ";//品牌
    String origin = " China ";//产地
    String slogan = " 遥遥领先 ";//口号
    String advantage = " 通信 ";//优势

    void show(){
        System.out.println("手机" + brand + ",产地" + origin + ",愿景" + slogan + "优势" + advantage);
    }
}

//子类的子类
class Honor extends Huawei
{
    String arr = "各个手机有各个手机的助手！！！";
    void sj()
    {
        System.out.println(arr);
    }
    void show(){
        System.out.println("手机" + brand + "的小弟 Honor,产地" + origin + ",愿景" + slogan + "优势" + advantage);
    }
}

//子类
class Xiaomi extends Phone{
    void show(){
        System.out.println("手机" + brand + "我是小米,产地" + origin + ",愿景" + slogan);
    }
}