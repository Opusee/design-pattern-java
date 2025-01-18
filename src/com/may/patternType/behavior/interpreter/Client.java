package com.may.patternType.behavior.interpreter;

import java.util.Arrays;

/**
 * 解释器模式
 * 要点：将动作拆分为原子操作，即不可再分，然后进行组合，解释每一个原子操作
 * 和结构模式相比。解释器模式是强调行为型，组合模式是强调结构型
 */
public class Client {
    public static void main(String[] args) {
        /*
         * BEGIN             // 脚本开始
         * MOVE 500,600;     // 鼠标移动到坐标(500, 600)
         *  BEGIN LOOP 5     // 开始循环5次
         *      LEFT_CLICK;  // 循环体内单击左键
         *      DELAY 1;     // 每次延时1秒
         *  END;             // 循环体结束
         * RIGHT_DOWN;       // 按下右键
         * DELAY 7200;       // 延时2小时
         * END;              // 脚本结束
         */

        // 构造指令集语义树，实际情况会交给语法解析器（Evaluator or Parser）。
        Expression sequence = new Sequence(Arrays.asList(
                new Move(500, 600),
                new Repetition(
                        new Sequence(
                                Arrays.asList(new LeftClick(),
                                        new Delay(1))
                        ),
                        5
                        ),
                new RightDown(),
                new Delay(7200)
        ));

        sequence.interpret();
        /*打印输出
            移动鼠标：【500,600】
            按下鼠标：左键
            松开鼠标：左键
            系统延迟：1秒钟
            按下鼠标：左键
            松开鼠标：左键
            系统延迟：1秒钟
            按下鼠标：左键
            松开鼠标：左键
            系统延迟：1秒钟
            按下鼠标：左键
            松开鼠标：左键
            系统延迟：1秒钟
            按下鼠标：左键
            松开鼠标：左键
            系统延迟：1秒钟
            按下鼠标：右键
            系统延迟：7200秒钟
         */
    }
}
