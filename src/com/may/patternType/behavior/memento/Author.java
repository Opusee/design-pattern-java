package com.may.patternType.behavior.memento;

/**
 * 备忘录模式
 * 要点：存在一个历史记录用于实现备忘录操作。但是备忘录也有缺点，因为历史记录是list的存在，但文档较大的时候，备忘录会特别大，而备忘录是存在内存中的，
 * 因此会极大的消耗内存
 */
public class Author {
    public static void main(String[] args) {
        Editor editor = new Editor(new Doc("《AI的觉醒》"));
        /*
         <<<打开文档《AI的觉醒》

         文章结束>>>
         */
        editor.append("第一章 混沌初开");
        /*
        <<<插入操作
        第一章 混沌初开
        文章结束>>>
        */
        editor.append("\n  正文2000字……");
        /*
        <<<插入操作
        第一章 混沌初开
          正文2000字……
        文章结束>>>
        */
        editor.append("\n第二章 荒漠之花\n  正文3000字……");
        /*
        <<<插入操作
        第一章 混沌初开
          正文2000字……
        第二章 荒漠之花
          正文3000字……
        文章结束>>>
        */
        editor.delete();
        /*
        <<<删除操作

        文章结束>>>
        */

        //吃下后悔药，我的世界又完整了。
        editor.undo();
        /*
        >>>撤销操作
        第一章 混沌初开
          正文2000字……
        第二章 荒漠之花
          正文3000字……
        文章结束>>>
        */
    }
}
