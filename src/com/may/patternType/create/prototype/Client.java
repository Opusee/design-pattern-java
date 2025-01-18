package com.may.patternType.create.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 原型模式。
 * 要点：在需要大量同类型，不同实例的情况下。只在初始实例化一次，通过对象克隆的方式进行返回，大大提高了效率降低了性能消耗。
 * 注意：我们都知道Java中的变量分为原始类型和引用类型，所谓浅拷贝只是拷贝原始类型的指基本数据类型，int short long char 等。
 * 引用数据类型，也就是对象，只能拷贝对象的地址，那造成的效果就不是原型模式了，而是单例模式。因此对引用数据类型，要它自己也实现拷贝。
 */
public class Client {
    public static void main(String[] args) {

        EnemyPlane ep = new EnemyPlane(new Random().nextInt(200));
        List<EnemyPlane> enemyPlanes = new ArrayList<>();
        enemyPlanes.add(ep);
        for (int i = 0; i < 50; i++) {
            //此处随机位置产生敌机
            EnemyPlane instance = EnemyPlaneFactory.getInstance(new Random().nextInt(200));
            enemyPlanes.add(instance);
        }

        enemyPlanes.stream().filter(elem -> elem.getX() > 20).filter(elem -> elem.getX() < 100).forEach(elem -> System.out.print(elem.getX() + " "));
    }
}
