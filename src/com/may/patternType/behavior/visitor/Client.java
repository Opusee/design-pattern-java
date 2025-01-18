package com.may.patternType.behavior.visitor;

import com.may.patternType.behavior.visitor.pojo.Candy;
import com.may.patternType.behavior.visitor.pojo.Fruit;
import com.may.patternType.behavior.visitor.pojo.Wine;
import com.may.patternType.behavior.visitor.service.Acceptable;
import com.may.patternType.behavior.visitor.service.Visitor;
import com.may.patternType.behavior.visitor.service.impl.DiscountVisitor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * 访问者模式。
 * 要点：利用双派发机制，接待者主动接待访问者的访问。
 */
public class Client {
    public static void main(String[] args) {

        /* 所有商品统统被泛化且当作“接待者”了，由于泛型化后的商品像是被打了包裹一样让拜访者无法识别品类，所以在迭代里面我们让这些商品对象主动去“接待”来访者
           这类似于警察（访问者）办案时嫌疑人（接待者）需主动接受调查并出示自己的身份证给警察，如此就可以基于个人信息查询前科并展开相关调查。
         */
        List<Acceptable> products = Arrays.asList(
                new Candy("小黑兔奶糖", LocalDate.of(2018, 10, 1), 20.00f),
                new Wine("猫泰白酒", LocalDate.of(2017, 1, 1), 1000.00f),
                new Fruit("草莓", LocalDate.of(2018, 12, 26), 10.00f, 2.5f)
        );
        Visitor discountVisitor = new DiscountVisitor(LocalDate.of(2019, 1, 1));
        // 迭代购物车轮流结算
        for (Acceptable product : products){
            product.accept(discountVisitor);
        }
        /*
          如此一来，在运行时的糖果自己是认识自己的，它就把自己递交给来访者，此时的this必然就属糖果类了，
          所以能得偿所愿地派发到Visitor的visit(Fruit fruit)重载方法，这样便实现了“双派发”，也就是说我们先派发给商品去主动接待，
          然后又把自己派发回给访问者，我不认识你，你告诉我你是谁。
          终于，我们巧妙地用双派发解决了方法重载的多态派发问题，如虎添翼，访问者模式框架至此搭建竣工，之后再添加业务逻辑不必再改动数据实体类了，
          比如我们再增加一个针对六一儿童节打折业务，加大对糖果类、玩具类的打折力度，而不需要为每个POJO类添加对应打折方法，
          数据资源（实现接待者接口）与业务（实现访问者接口）被分离开来，且业务处理集中化、多态化、亦可扩展。纯粹的数据，不应该多才多艺。
        */
    }

}
