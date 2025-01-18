package com.may.patternType.structure.composite;

/*
  组合模式
  要点：组合模式所应用的就是树形结构以表达“部分/整体”的层次结构。相信我们都知道“二叉树”结构吧，根部分出来两个枝杈（左节点，右节点），
  每个枝杈上又可以继续分叉，直到末端的叶子为止。
  而部分的结构又和整体是类似的，这就有了重复、迭代的自似性。
 */
public class Client {
    public static void main(String[] args) {
        Node driveD = new Folder("D盘");

        Node doc = new Folder("文档");
        doc.add(new File("简历.doc"));
        doc.add(new File("项目介绍.ppt"));

        driveD.add(doc);

        Node music = new Folder("音乐");

        Node jay = new Folder("周杰伦");
        jay.add(new File("双截棍.mp3"));
        jay.add(new File("告白气球.mp3"));
        jay.add(new File("听妈妈的话.mp3"));

        Node jack = new Folder("张学友");
        jack.add(new File("吻别.mp3"));
        jack.add(new File("一千个伤心的理由.mp3"));

        music.add(jay);
        music.add(jack);

        driveD.add(music);

        driveD.ls();
    }
}
