package com.code.test;

public class SellPlaneTicket {
    public static void main(String[] args) {
        double price = planePrice(100, 11, "头等舱");
        System.out.println(price);
    }

    public static double planePrice(double price, int month, String seat)
    {
        if(month >= 5 && month <= 10)
        {
            if(seat.equals("头等舱"))
            {
                return price*.9;
            }
            else if(seat.equals("经济舱"))
            {
                return price*.85;
            }
        }
        else
        {
            if(seat.equals("头等舱"))
            {
                return price*.7;
            }
            else if(seat.equals("经济舱"))
            {
                return price*.65;
            }
        }
        return 0;
    }
}
