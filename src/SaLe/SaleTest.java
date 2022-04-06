package SaLe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaleTest {

//判定覆盖



        SaleMachine saleMachine=new SaleMachine();
        //语句覆盖
    @Test
   public void sale1() {
        //语句一：没有啤酒或有橙汁
        assertEquals("很抱歉，没有beer", saleMachine.sale("beer", 5, 5, 0, 0));
        assertEquals("很抱歉，没有orange", saleMachine.sale("orange", 5, 5, 0, 0));
        //语句二：有啤酒或有橙汁，或者二者都有，顾客支付五元
        assertEquals("请取走orange", saleMachine.sale("orange", 5, 5, 1, 0));
        //语句三：有啤酒或有橙汁，或者二者都有，顾客支付10元，能够找零钱
        assertEquals("拿好五元，请取走orange", saleMachine.sale("orange", 10, 5, 1, 0));
        //语句四：有啤酒或有橙汁，或者二者都有，顾客支付10元，不能能够找零钱
        assertEquals("没有零钱，退您十元", saleMachine.sale("orange", 10, 0, 1, 0));
        //语句五：输入错误指令
        assertEquals("错误指令", saleMachine.sale("coffer", 10, 5, 5, 5));

    }
    //判断覆盖
//    @Test
//   public void sale()
//    {
//       //判断1：没有啤酒或没有橙汁
//        assertEquals("很抱歉，没有beer", saleMachine.sale("beer", 5, 5, 0, 0));
//        assertEquals("很抱歉，没有orange", saleMachine.sale("orange", 5, 5, 0, 0));
//        //判断2：有啤酒或有橙汁，或者二者都有，顾客支付五元
//        assertEquals("请取走orange", saleMachine.sale("orange", 5, 5, 1, 0));
//        assertEquals("请取走beer", saleMachine.sale("beer", 5, 5, 1, 1));
//        assertEquals("请取走beer", saleMachine.sale("beer", 5, 5, 1, 1));
//        //判断3：有啤酒或有橙汁，或者二者都有，顾客支付10元，能够找零钱
//        assertEquals("拿好五元，请取走orange", saleMachine.sale("orange", 10, 5, 1, 0));
//        assertEquals("拿好五元，请取走beer", saleMachine.sale("beer", 10, 5, 0, 1));
//        //判断4：有啤酒或有橙汁，或者二者都有，顾客支付10元，不能能够找零钱
//        assertEquals("没有零钱，退您十元", saleMachine.sale("orange", 10, 0, 1, 0));
//        assertEquals("没有零钱，退您十元", saleMachine.sale("beer", 10, 0, 0, 1));
//        //判断五：输入错误的金额，或者错误的饮料名称
//        assertEquals("错误指令", saleMachine.sale("coffer", 10, 5, 5, 5));
//        assertEquals("错误指令", saleMachine.sale("beer", 1000, 5, 5, 5));
//    }

//        saleMachine.sale("beer",5);//请取走
//        saleMachine.sale("beer",10);//拿好五元，请取走。将5元取完
//        saleMachine.sale("beer",10);//没有零钱，退您十元
//
//        saleMachine.sale("orange",5);//请取走
//        saleMachine.sale("orange",10);//拿好五元，请取走
//        saleMachine.sale("orange",10);//第一层判断完成，orange取完
//        //进入第二层判断
//        saleMachine.sale("orange",5);//orange为空，无法取，很抱歉，没有
//        //进入第三层判断
//        saleMachine.sale("coffer",10);//输入错误饮料，错误指示
//        saleMachine.sale("orange",1000);//输入错误金额，，错误指示


    }

