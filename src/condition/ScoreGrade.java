package condition;

import java.util.Scanner;

/**
 * 【条件判断】ScoreGrade
 * 题目：输入学生成绩（0-100），输出对应等级：90-100为A，80-89为B，70-79为C，60-69为D，60以下为E。
 */
public class ScoreGrade {
    public static void main(String[] args) {
        // 在这里写你的代码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩");
        int score = sc.nextInt();
        if (score<0||score>100){
            System.out.println("成绩无效");
        } else if (score>=90&&score<=100) {
            System.out.println("等级为A");
        }  else if (score>=80&&score<=89) {
            System.out.println("等级为B");
        } else if (score>=70&&score<=79) {
            System.out.println("等级为C");
        } else if (score>=60&&score<=69) {
            System.out.println("等级为D");
        } else  {
            System.out.println("等级为E");
        }
    }
}

