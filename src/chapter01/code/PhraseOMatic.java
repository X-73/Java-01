package chapter01.code;

public class PhraseOMatic {
    public static void main(String[] args) {
        // 你可以随意加上其他术语
        String[] wordListOne = {"24/7", "Multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mind share", "portal", "space", "vision", "paradigm", "mission"};

        // 计算每一组有多少个名词
        int oneLength = wordListOne.length;
        int twoLength = wordListOne.length;
        int threeLength = wordListThree.length;

        // 产生随机数字
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // 组合出专家术语
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // 输出
        System.out.println("What we need is a " + phrase);

    }
}
