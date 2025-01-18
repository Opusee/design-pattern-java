package com.may.patternType.behavior.mediator;

/**
 * 中介模式
 * 中介模式更像是网络拓扑中的星型结构，它描述了众节点与中心点的关系。
 * 中介模式符合迪米特法则，它解决了对象间过度耦合、复杂频繁交互的问题，打破了你中有我，我中有你的相互依赖，
 * 第三方的介入有助于双方调停，打破如胶似漆、纠缠不休的关系，让他们之间变得松散、自由、独立。
 */
public class Client {
    public static void main(String[] args) {
        User u1 = new User("张三");
        User u2 = new User("李四");

        ChatRoom chatRoom = new ChatRoom("私密聊天室");

        u1.login(chatRoom);
        u2.login(chatRoom);

        u1.talk("四哥在吗？");
        u2.listen(u2,"四哥在呢！");
    }
}
