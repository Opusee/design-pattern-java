package com.may.patternType.structure.bridge;

/**
 * 桥接模式。
 * 和策略模式不同的是，策略更强调的是行为的替换。但对于桥接模式而言，
 * 它巧妙运用了抽象类（抽象画笔类）植入接口（尺子接口），这样我们不但能替换各种形状的尺子实现类，
 * 还能替换各种颜色的画笔子类，这就是对抽象、实现的双边解耦、分离、脱钩。
 */
public class Client {
    public static void main(String args[]) {

        //白色画笔对应的所有形状
        new WhitePen(new CircleRuler()).draw();
        new WhitePen(new SquareRuler()).draw();
        new WhitePen(new TriangleRuler()).draw();

        //黑色画笔对应的所有形状
        new BlackPen(new CircleRuler()).draw();
        new BlackPen(new SquareRuler()).draw();
        new BlackPen(new TriangleRuler()).draw();

        /*运行结果：
            白○
            白□
            白△
            黑○
            黑□
            黑△
        */
    }
}
